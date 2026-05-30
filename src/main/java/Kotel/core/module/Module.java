package Kotel.core.module;

import Kotel.core.setting.Setting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Module {
    private final String name;
    private final String description;
    private final ModuleCategory category;
    private final boolean safeToEnable;
    private boolean enabled;
    private int keyBind;
    private final List<Setting<?>> settings = new ArrayList<>();

    protected Module(String name, String description, ModuleCategory category, boolean safeToEnable) {
        this.name = Objects.requireNonNull(name, "name");
        this.description = description == null ? "" : description;
        this.category = Objects.requireNonNull(category, "category");
        this.safeToEnable = safeToEnable;
    }

    public final void toggle() { setEnabled(!enabled); }
    public final void setEnabled(boolean enabled) {
        if (enabled && !safeToEnable) {
            onBlockedEnable("This module is a non-functional safety placeholder.");
            this.enabled = false;
            return;
        }
        if (this.enabled == enabled) return;
        this.enabled = enabled;
        if (enabled) onEnable(); else onDisable();
    }
    protected void onEnable() { }
    protected void onDisable() { }
    protected void onBlockedEnable(String reason) { System.out.println(name + " blocked: " + reason); }
    public void onTick() { }
    public void onRender2D() { }
    public void onRender3D() { }
    protected <T extends Setting<?>> T add(T setting) { settings.add(setting); return setting; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public ModuleCategory getCategory() { return category; }
    public boolean isSafeToEnable() { return safeToEnable; }
    public boolean isEnabled() { return enabled; }
    public int getKeyBind() { return keyBind; }
    public void setKeyBind(int keyBind) { this.keyBind = keyBind; }
    public List<Setting<?>> getSettings() { return Collections.unmodifiableList(settings); }
    public String cardSubtitle() { return category.getDisplayName() + " • " + (safeToEnable ? "safe" : "placeholder"); }
}
