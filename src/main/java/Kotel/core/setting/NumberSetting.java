package Kotel.core.setting;

public class NumberSetting extends Setting<Double> {
    private final double min;
    private final double max;
    private final double step;
    public NumberSetting(String name, String description, double defaultValue, double min, double max, double step) {
        super(name, description, defaultValue);
        this.min = min; this.max = max; this.step = step <= 0 ? 1.0 : step;
        setValue(defaultValue);
    }
    @Override protected Double sanitize(Double candidate) {
        double value = candidate == null ? getDefaultValue() : candidate;
        value = Math.max(min, Math.min(max, value));
        return Math.round(value / step) * step;
    }
    public double getMin() { return min; }
    public double getMax() { return max; }
    public double getStep() { return step; }
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
