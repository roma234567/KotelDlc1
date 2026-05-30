package Kotel.core.resources;

import java.io.InputStream;
import java.util.Optional;

public class ResourceLoader {
    private final String namespace;
    public ResourceLoader(String namespace) { this.namespace = namespace == null ? "koteldlc" : namespace; }
    public Optional<InputStream> open(String path) { String clean = path.startsWith("/") ? path.substring(1) : path; return Optional.ofNullable(Thread.currentThread().getContextClassLoader().getResourceAsStream(clean)); }
    public String assetPath(String folder, String name) { return "assets/" + namespace + "/" + folder + "/" + name; }
    public String getNamespace() { return namespace; }
}
// project note 13: safe scaffold placeholder for local/client-side use only
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
