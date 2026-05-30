package Kotel.core.theme;

import java.util.LinkedHashMap;
import java.util.Map;

public class ThemeManager {
    private final Map<String, Integer> colors = new LinkedHashMap<>();
    public ThemeManager() { applyKotelDark(); }
    public void applyKotelDark() { colors.clear(); colors.put("background", 0xE6101018); colors.put("panel", 0xFF171827); colors.put("accent", 0xFFFF6A00); colors.put("text", 0xFFF6F7FB); colors.put("muted", 0xFF8E93A8); }
    public int color(String key) { return colors.getOrDefault(key, 0xFFFFFFFF); }
    public Map<String,Integer> snapshot() { return Map.copyOf(colors); }
    public String cssLike() { StringBuilder b=new StringBuilder(); colors.forEach((k,v)->b.append(k).append('=').append(String.format("#%08X", v)).append("\n")); return b.toString(); }
}
// project note 14: safe scaffold placeholder for local/client-side use only
// project note 15: safe scaffold placeholder for local/client-side use only
// project note 16: safe scaffold placeholder for local/client-side use only
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
