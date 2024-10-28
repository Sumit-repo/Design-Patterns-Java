package creationalPatterns;

/**
 * Enum Singleton class.
 * Enum Singletons are the best way to implement Singletons in Java.
 * They are immune to reflection, serialization, and multi-threading issues.
 */
public enum EnumSingleton {
    INSTANCE("State Zero");

    private String state;

    private EnumSingleton(String state) {
        this.state = state;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
