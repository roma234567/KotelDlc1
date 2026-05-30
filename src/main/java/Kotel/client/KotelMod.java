package Kotel.client;

import Kotel.antileak.AntiLeak;
import Kotel.core.event.EventManager;
import Kotel.core.module.ModuleManager;
import Kotel.core.resources.ResourceLoader;
import Kotel.core.theme.ThemeManager;
import Kotel.gui.clickgui.ClickGUI;
import Kotel.gui.menu.CustomMainMenu;
import Kotel.modules.combat.KillAura;
import Kotel.modules.combat.AimAssist;
import Kotel.modules.combat.triggerBot;
import Kotel.modules.combat.Hitboxes;
import Kotel.modules.movement.Speed;
import Kotel.modules.movement.Fly;
import Kotel.modules.movement.NoFall;
import Kotel.modules.movement.NoSlow;
import Kotel.modules.movement.Strafe;
import Kotel.modules.movement.Jesus;
import Kotel.modules.movement.LongJump;
import Kotel.modules.movement.ElytraGlide;
import Kotel.modules.movement.SafeWalk;
import Kotel.modules.movement.InventoryMove;
import Kotel.modules.movement.Sprint;
import Kotel.modules.visual.ESP;
import Kotel.modules.visual.TargetHUD;
import Kotel.modules.visual.HUD;
import Kotel.modules.visual.Fullbright;
import Kotel.modules.visual.Chams;
import Kotel.modules.visual.HandChams;
import Kotel.modules.visual.Particles;
import Kotel.modules.visual.JumpCircle;
import Kotel.modules.visual.KillEffect;
import Kotel.modules.visual.HitEffect;
import Kotel.modules.visual.BlockESP;
import Kotel.modules.visual.ChinaHat;
import Kotel.modules.visual.CrossHair;
import Kotel.modules.visual.SwingAnimation;
import Kotel.modules.visual.ViewModel;
import Kotel.modules.visual.CameraSettings;
import Kotel.modules.visual.AspectRatio;
import Kotel.modules.visual.FreeCam;
import Kotel.modules.visual.NoRender;
import Kotel.modules.visual.BetterMinecraft;
import Kotel.modules.visual.SeeInvisible;
import Kotel.modules.visual.AuctionHelper;
import Kotel.modules.visual.ProjectilePrediction;
import Kotel.modules.visual.TargetESP;
import Kotel.modules.visual.Arrows;
import Kotel.modules.misc.AutoAccept;
import Kotel.modules.misc.AutoAuth;
import Kotel.modules.misc.AutoRespawn;
import Kotel.modules.misc.AutoResell;
import Kotel.modules.misc.AutoJoin;
import Kotel.modules.misc.AutoDuels;
import Kotel.modules.misc.Disabler;
import Kotel.modules.misc.NameProtect;
import Kotel.modules.misc.AntiCheatDetector;
import Kotel.modules.misc.InventoryCleaner;
import Kotel.modules.player.AutoArmor;
import Kotel.modules.player.AutoTool;
import Kotel.modules.player.NoSlowBreak;

public class KotelMod {
    public static final String MOD_ID = "koteldlc";
    public static final String VERSION = "1.0.0-safe-scaffold";
    private final EventManager eventManager = new EventManager();
    private final ModuleManager moduleManager = new ModuleManager();
    private final ThemeManager themeManager = new ThemeManager();
    private final ResourceLoader resourceLoader = new ResourceLoader(MOD_ID);
    private final CustomMainMenu mainMenu = new CustomMainMenu();

    public KotelMod() {
        registerModules();
        new AntiLeak().showIntegrityNotice();
    }

    private void registerModules() {
        moduleManager.register(new KillAura());
        moduleManager.register(new AimAssist());
        moduleManager.register(new triggerBot());
        moduleManager.register(new Hitboxes());
        moduleManager.register(new Speed());
        moduleManager.register(new Fly());
        moduleManager.register(new NoFall());
        moduleManager.register(new NoSlow());
        moduleManager.register(new Strafe());
        moduleManager.register(new Jesus());
        moduleManager.register(new LongJump());
        moduleManager.register(new ElytraGlide());
        moduleManager.register(new SafeWalk());
        moduleManager.register(new InventoryMove());
        moduleManager.register(new Sprint());
        moduleManager.register(new ESP());
        moduleManager.register(new TargetHUD());
        moduleManager.register(new HUD());
        moduleManager.register(new Fullbright());
        moduleManager.register(new Chams());
        moduleManager.register(new HandChams());
        moduleManager.register(new Particles());
        moduleManager.register(new JumpCircle());
        moduleManager.register(new KillEffect());
        moduleManager.register(new HitEffect());
        moduleManager.register(new BlockESP());
        moduleManager.register(new ChinaHat());
        moduleManager.register(new CrossHair());
        moduleManager.register(new SwingAnimation());
        moduleManager.register(new ViewModel());
        moduleManager.register(new CameraSettings());
        moduleManager.register(new AspectRatio());
        moduleManager.register(new FreeCam());
        moduleManager.register(new NoRender());
        moduleManager.register(new BetterMinecraft());
        moduleManager.register(new SeeInvisible());
        moduleManager.register(new AuctionHelper());
        moduleManager.register(new ProjectilePrediction());
        moduleManager.register(new TargetESP());
        moduleManager.register(new Arrows());
        moduleManager.register(new AutoAccept());
        moduleManager.register(new AutoAuth());
        moduleManager.register(new AutoRespawn());
        moduleManager.register(new AutoResell());
        moduleManager.register(new AutoJoin());
        moduleManager.register(new AutoDuels());
        moduleManager.register(new Disabler());
        moduleManager.register(new NameProtect());
        moduleManager.register(new AntiCheatDetector());
        moduleManager.register(new InventoryCleaner());
        moduleManager.register(new AutoArmor());
        moduleManager.register(new AutoTool());
        moduleManager.register(new NoSlowBreak());
    }

    public void start() {
        System.out.println("Starting " + MOD_ID + " " + VERSION);
        System.out.println(moduleManager.summary());
        System.out.println(mainMenu.mockRender());
        System.out.println(new ClickGUI(moduleManager).mockRender());
    }

    public EventManager getEventManager() { return eventManager; }
    public ModuleManager getModuleManager() { return moduleManager; }
    public ThemeManager getThemeManager() { return themeManager; }
    public ResourceLoader getResourceLoader() { return resourceLoader; }
    public CustomMainMenu getMainMenu() { return mainMenu; }

    public static void main(String[] args) {
        new KotelMod().start();
    }
}
