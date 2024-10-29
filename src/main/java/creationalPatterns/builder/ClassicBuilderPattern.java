package creationalPatterns.builder;

/**
 * Classic Builder Pattern class.
 * The Classic Builder Pattern is a creational design pattern that lets you construct complex objects step by step.
 * In the classic implementation of the Builder Pattern, we create a separate Builder inner class.
 * This inner class contains methods to set each property of the constructed object.
 * This structured approach facilitates a sequential configuration process, ensuring clarity and ease of use.
 * Additionally, it enhances code organization and readability, making it easier to understand and maintain:
 */
public class ClassicBuilderPattern {
    private final String title;

    private final String text;

    private final String category;

    ClassicBuilderPattern(Builder builder) {
        this.title = builder.title;
        this.text = builder.text;
        this.category = builder.category;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }

    /**
     * Builder inner class.
     */
    public static class Builder {
        private String title;
        private String text;
        private String category;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Builds the ClassicBuilderPattern object.
         *
         * @return ClassicBuilderPattern object
         */
        public ClassicBuilderPattern build() {
            return new ClassicBuilderPattern(this);
        }
    }
}
