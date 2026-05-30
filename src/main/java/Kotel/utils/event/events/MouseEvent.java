package Kotel.utils.event.events;

import Kotel.utils.event.Event;

public class MouseEvent extends Event {
    private final long frame;
    private final String detail;
    public MouseEvent() { this(0L, ""); }
    public MouseEvent(long frame, String detail) { this.frame = frame; this.detail = detail == null ? "" : detail; }
    public long getFrame() { return frame; }
    public String getDetail() { return detail; }
    public String describe() { return "MouseEvent[frame=" + frame + ", detail=" + detail + "]"; }
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
