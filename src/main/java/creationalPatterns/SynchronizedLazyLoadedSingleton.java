package creationalPatterns;

public class SynchronizedLazyLoadedSingleton {
    private static SynchronizedLazyLoadedSingleton singleton;

    /**
     * Private constructor to prevent instantiation.
     */
    private SynchronizedLazyLoadedSingleton() {}

    /**
     * Returns a thread-safe, lazily-loaded Singleton instance.
     * This method is synchronized, which may degrade performance.
     *
     * @return SynchronizedLazyLoadedSingleton instance
     */
    public static synchronized SynchronizedLazyLoadedSingleton getInstance() {
        if (singleton == null) {
            singleton = new SynchronizedLazyLoadedSingleton();
        }
        return singleton;
    }
}