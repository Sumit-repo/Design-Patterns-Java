package creationalPatterns.builder;

public class Test {
    public static void main(String[] args) {
        ClassicBuilderPattern classicBuilderPattern = new ClassicBuilderPattern.Builder()
                .title("Builder Pattern")
                .text("The Builder Pattern is a creational design pattern that lets you construct complex objects step by step.")
                .category("Design Patterns")
                .build();

        System.out.println("Classic Builder Pattern:" +
                "\nTitle: " + classicBuilderPattern.getTitle() +
                "\nText: " + classicBuilderPattern.getText() +
                "\nCategory: " + classicBuilderPattern.getCategory());

        GenericBuilderTest genericBuilderTest = GenericBuilderPattern.of(GenericBuilderTest::new)
                .with(GenericBuilderTest::setTitle, "Builder Pattern")
                .with(GenericBuilderTest::setText, "The Builder Pattern is a creational design pattern that lets you construct complex objects step by step.")
                .with(GenericBuilderTest::setCategory, "Design Patterns")
                .build();

        System.out.println("\nGeneric Builder Pattern:" +
                "\nTitle: " + genericBuilderTest.getTitle() +
                "\nText: " + genericBuilderTest.getText() +
                "\nCategory: " + genericBuilderTest.getCategory());
    }
}
