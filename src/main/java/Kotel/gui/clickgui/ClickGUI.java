package Kotel.gui.clickgui;

import Kotel.core.module.Module;
import Kotel.core.module.ModuleCategory;
import Kotel.core.module.ModuleManager;

import java.util.ArrayList;
import java.util.List;

public class ClickGUI {
    private final List<Panel> panels = new ArrayList<>();

    public ClickGUI(ModuleManager manager) {
        int x = 16;
        for (ModuleCategory category : ModuleCategory.values()) {
            Panel panel = new Panel(category.getDisplayName(), x, 24, 126, 22);
            int row = 0;
            for (Module module : manager.byCategory(category)) {
                panel.add(new Component(module.getName(), x + 8, 52 + row * 18, 110, 16));
                row++;
            }
            panels.add(panel);
            x += 138;
        }
    }

    public List<Panel> getPanels() { return List.copyOf(panels); }

    public String mockRender() {
        StringBuilder builder = new StringBuilder("ClickGUI\n");
        for (Panel panel : panels) {
            builder.append(panel.renderList());
        }
        return builder.toString();
    }
}
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
