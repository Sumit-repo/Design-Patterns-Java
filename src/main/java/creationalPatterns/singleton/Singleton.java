package creationalPatterns.singleton;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

/**
 * Singleton class that ensures only one instance of the class is created.
 * This implementation uses the Bill Pugh Singleton pattern, which is a thread-safe and efficient way to create a Singleton.
 */
public class Singleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    /**
     * Safe from reflection attacks when combined with the private constructor check.
     * Ensures only one instance of the class is created by throwing an exception if an instance already exists.
     */
    private Singleton() {
        if (Holder.SINGLETON != null) {
            throw new RuntimeException("This is a Singleton class. Use getInstance() method to create an object.");
        }
    }

    /**
     * Holder class for creating a Singleton instance.
     * Uses the Bill Pugh Singleton pattern, which is a thread-safe and efficient way to create a Singleton.
     *
     * @see <a href="https://www.baeldung.com/java-bill-pugh-singleton-implementation">Bill Pugh Singleton</a>
     */
    private static final class Holder {
        private static final Singleton SINGLETON = new Singleton();
    }

    /**
     * Returns the single instance of the Singleton class.
     *
     * @return Singleton instance
     */
    public static Singleton getInstance() {
        return Holder.SINGLETON;
    }

    /**
     * Prevents cloning of the Singleton instance to ensure only one instance exists.
     *
     * @return Singleton instance if cloning is attempted
     * @throws CloneNotSupportedException if clone method is not supported
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        if (Holder.SINGLETON != null) {
//             Uncomment to throw exception if clone is attempted
//             throw new RuntimeException("This is a Singleton class. Use getInstance() method to create an object.");
        }
        System.out.println("Clone method executed");
        return getInstance();
    }

    /**
     * To prevent breaking the Singleton pattern by using serialization/deserialization.
     * Ensures only one instance is created after deserialization.
     *
     * @return Singleton instance
     */
    @Serialization
    public Object readResolve() {
        System.out.println("Read Resolve executed");
        return getInstance();
    }
}

