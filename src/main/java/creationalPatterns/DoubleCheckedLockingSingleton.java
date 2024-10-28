package creationalPatterns;

/**
 * Double-checked locking Singleton class.
 * This approach is efficient as it synchronizes only during the first access.
 */
public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton singleton;

    /**
     * Private constructor to prevent instantiation.
     */
    private DoubleCheckedLockingSingleton() {}

    /**
     * Returns a thread-safe Singleton instance using double-checked locking.
     * This approach is efficient as it synchronizes only during the first access.
     *
     * @return DoubleCheckedLockingSingleton instance
     */
    public static DoubleCheckedLockingSingleton getInstance() {
        if (singleton == null) {  // First check (without synchronization)
            synchronized (DoubleCheckedLockingSingleton.class) {  // Locking the class object
                if (singleton == null) {  // Second check (with synchronization)
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
