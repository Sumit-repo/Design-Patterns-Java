package creationalPatterns.builder;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * Generic Builder Pattern class.
 * This class provides a generic way to build objects using a builder pattern.
 * The GenericBuilder offers flexibility and readability, allowing us to construct every object concisely while ensuring type safety.
 * This pattern showcases Java 8’s expressive power and is an elegant solution for complex construction tasks.
 * <p>
 * This class demonstrates a solution based on class setters.
 * <p>
 * <b>Note:</b> This approach implies that attributes can no longer be {@code final},
 * thus sacrificing the immutability offered by the Builder Pattern.
 * </p>
 *
 * @param <T> the type of object to build
 * @implNote This design choice allows for flexible attribute modification via setters,
 * but differs from the Builder Pattern, which ensures immutability.
 */
public class GenericBuilderPattern<T> {
    private final Supplier<T> supplier;

    private GenericBuilderPattern(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    /**
     * Creates a new GenericBuilderPattern instance with the specified supplier.
     *
     * @param supplier the supplier to use
     * @param <T>      the type of object to build
     * @return GenericBuilderPattern instance
     */
    public static <T> GenericBuilderPattern<T> of(Supplier<T> supplier) {
        return new GenericBuilderPattern<>(supplier);
    }

    /**
     * Adds a property to the object being built.
     *
     * @param consumer the consumer to use
     * @param value    the value to set
     * @param <P>      the type of the property
     * @return GenericBuilderPattern instance
     */
    public <P> GenericBuilderPattern<T> with(BiConsumer<T, P> consumer, P value) {
        return new GenericBuilderPattern<>(() -> {
            T object = supplier.get();
            consumer.accept(object, value);
            return object;
        });
    }

    /**
     * Builds the object.
     *
     * @return the built object
     */
    public T build() {
        return supplier.get();
    }
}
