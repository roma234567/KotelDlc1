package Kotel.gui.menu;

import java.util.ArrayList;
import java.util.List;

public class CustomMainMenu {
    private final List<CustomButton> buttons = new ArrayList<>();
    private String title = "KotelDLC";
    private String subtitle = "Safe client scaffold";
    public CustomMainMenu() { buttons.add(new CustomButton("Singleplayer", () -> log("Singleplayer"))); buttons.add(new CustomButton("Multiplayer", () -> log("Open vanilla multiplayer"))); buttons.add(new CustomButton("Settings", () -> log("Settings"))); buttons.add(new CustomButton("Quit", () -> log("Quit"))); }
    private void log(String action) { System.out.println("Menu action: " + action); }
    public List<CustomButton> getButtons() { return List.copyOf(buttons); }
    public String getTitle() { return title; }
    public String getSubtitle() { return subtitle; }
    public String mockRender() { StringBuilder b=new StringBuilder(title).append("\n").append(subtitle).append("\n"); for(CustomButton button:buttons) b.append(button.renderText()).append("\n"); return b.toString(); }
}
// project note 17: safe scaffold placeholder for local/client-side use only
// project note 18: safe scaffold placeholder for local/client-side use only
// project note 19: safe scaffold placeholder for local/client-side use only
// project note 20: safe scaffold placeholder for local/client-side use only
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
