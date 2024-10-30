package structuralPatterns.decorator;

/**
 * The BubbleLights class is a concrete decorator that adds bubble lights to a Christmas tree.
 */
public class BubbleLights extends TreeDecorator {
    /**
     * Constructs a BubbleLights decorator with a specified ChristmasTree instance.
     */
    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    /**
     * Decorates the tree with bubble lights and returns the corresponding description.
     *
     * @return A string indicating that the tree is decorated with bubble lights.
     */
    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
