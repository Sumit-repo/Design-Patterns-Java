package structuralPatterns.decorator;

/**
 * The TreeTopper class is a concrete decorator that adds a tree topper to a Christmas tree.
 */
public class TreeTopper extends TreeDecorator {
    /**
     * Constructs a TreeTopper decorator with a specified ChristmasTree instance.
     */
    public TreeTopper(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTreeTopper();
    }

    /**
     * Decorates the tree with a tree topper and returns the corresponding description.
     *
     * @return A string indicating that the tree is decorated with a tree topper.
     */
    private String decorateWithTreeTopper() {
        return " with Tree Topper";
    }
}
