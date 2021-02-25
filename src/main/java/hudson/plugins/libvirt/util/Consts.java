package hudson.plugins.libvirt.util;

/**
 * Created by magnayn on 22/02/2014.
 */
public final class Consts {
    public static final String PLUGIN_URL = "/plugin/libvirt-slave/";

    /**
     * The base URL of the plugin images.
     */
    public static final String PLUGIN_IMAGES_URL = PLUGIN_URL + "images/";

    /**
     * The base URL of the plugin javascripts.
     */
    public static final String PLUGIN_JS_URL = PLUGIN_URL + "js/";

    private Consts() {
      //not called
    }
}
