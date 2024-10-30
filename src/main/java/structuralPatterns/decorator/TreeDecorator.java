package structuralPatterns.decorator;

/**
 * The TreeDecorator abstract class serves as a base for all tree decorators.
 * It implements the ChristmasTree interface and wraps a ChristmasTree instance,
 * allowing decorators to add their functionality.
 */
public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    /**
     * Constructs a TreeDecorator with a specified ChristmasTree instance.
     *
     * @param tree The ChristmasTree to be decorated.
     */
    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
