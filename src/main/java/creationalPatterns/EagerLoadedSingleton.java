package creationalPatterns;

/**
 * Eagerly-loaded Singleton class.
 * This approach is simple and thread-safe, but it may be inefficient if the instance is never used.
 */
public class EagerLoadedSingleton {
    private static final creationalPatterns.EagerLoadedSingleton SINGLETON = new creationalPatterns.EagerLoadedSingleton();

    /**
     * Private constructor to prevent instantiation.
     */
    private EagerLoadedSingleton() {}

    /**
     * Returns the eagerly-loaded Singleton instance.
     *
     * @return EagerLoadedSingleton instance
     */
    public static creationalPatterns.EagerLoadedSingleton getInstance() {
        return SINGLETON;
    }
}