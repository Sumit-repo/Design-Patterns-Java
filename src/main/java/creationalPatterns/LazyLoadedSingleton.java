package creationalPatterns;

/**
 * Lazy-loaded Singleton class.
 * This approach is not thread-safe and may cause issues in a multithreaded environment.
 */
public class LazyLoadedSingleton {
    private static LazyLoadedSingleton singleton;

    /**
     * Private constructor to prevent instantiation.
     */
    private LazyLoadedSingleton() {}

    /**
     * Returns the lazily-loaded Singleton instance.
     * Instance is created only when first requested.
     *
     * @return LazyLoadedSingleton instance
     */
    public static LazyLoadedSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyLoadedSingleton();
        }
        return singleton;
    }
}
