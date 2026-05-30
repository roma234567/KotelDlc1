package Kotel.core.module;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ModuleManager {
    private final List<Module> modules = new ArrayList<>();
    public void register(Module module) { modules.add(module); modules.sort(Comparator.comparing(Module::getName)); }
    public List<Module> all() { return List.copyOf(modules); }
    public Optional<Module> find(String name) { return modules.stream().filter(m -> m.getName().equalsIgnoreCase(name)).findFirst(); }
    public List<Module> byCategory(ModuleCategory category) { return modules.stream().filter(m -> m.getCategory()==category).collect(Collectors.toList()); }
    public List<Module> enabled() { return modules.stream().filter(Module::isEnabled).collect(Collectors.toList()); }
    public void tick() { modules.stream().filter(Module::isEnabled).forEach(Module::onTick); }
    public void render2D() { modules.stream().filter(Module::isEnabled).forEach(Module::onRender2D); }
    public void render3D() { modules.stream().filter(Module::isEnabled).forEach(Module::onRender3D); }
    public String summary() { return modules.size() + " modules, " + enabled().size() + " enabled"; }
}
// project note 21: safe scaffold placeholder for local/client-side use only
// project note 22: safe scaffold placeholder for local/client-side use only
// project note 23: safe scaffold placeholder for local/client-side use only
// project note 24: safe scaffold placeholder for local/client-side use only
// project note 25: safe scaffold placeholder for local/client-side use only
// project note 26: safe scaffold placeholder for local/client-side use only
// project note 27: safe scaffold placeholder for local/client-side use only
// project note 28: safe scaffold placeholder for local/client-side use only
// project note 29: safe scaffold placeholder for local/client-side use only
// project note 30: safe scaffold placeholder for local/client-side use only
// project note 31: safe scaffold placeholder for local/client-side use only
// project note 32: safe scaffold placeholder for local/client-side use only
// project note 33: safe scaffold placeholder for local/client-side use only
// project note 34: safe scaffold placeholder for local/client-side use only
// project note 35: safe scaffold placeholder for local/client-side use only
// project note 36: safe scaffold placeholder for local/client-side use only
// project note 37: safe scaffold placeholder for local/client-side use only
// project note 38: safe scaffold placeholder for local/client-side use only
// project note 39: safe scaffold placeholder for local/client-side use only
// project note 40: safe scaffold placeholder for local/client-side use only
// project note 41: safe scaffold placeholder for local/client-side use only
// project note 42: safe scaffold placeholder for local/client-side use only
// project note 43: safe scaffold placeholder for local/client-side use only
// project note 44: safe scaffold placeholder for local/client-side use only
// project note 45: safe scaffold placeholder for local/client-side use only
// project note 46: safe scaffold placeholder for local/client-side use only
// project note 47: safe scaffold placeholder for local/client-side use only
// project note 48: safe scaffold placeholder for local/client-side use only
// project note 49: safe scaffold placeholder for local/client-side use only
// project note 50: safe scaffold placeholder for local/client-side use only
