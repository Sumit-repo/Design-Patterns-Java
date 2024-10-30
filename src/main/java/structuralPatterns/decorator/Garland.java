package structuralPatterns.decorator;

/**
 * The Garland class is a concrete decorator that adds garland decoration to a Christmas tree.
 * It extends the TreeDecorator to modify the tree's decoration behavior.
 */
public class Garland extends TreeDecorator {
    /**
     * Constructs a Garland decorator with a specified ChristmasTree instance.
     *
     * @param tree The ChristmasTree to be decorated with garland.
     */
    public Garland(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    /**
     * Decorates the tree with garland and returns the corresponding description.
     *
     * @return A string indicating that the tree is decorated with garland.
     */
    private String decorateWithGarland() {
        return " with Garland";
    }
}
