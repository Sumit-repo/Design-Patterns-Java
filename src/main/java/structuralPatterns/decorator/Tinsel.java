package structuralPatterns.decorator;

/**
 * The Tinsel class is a concrete decorator that adds tinsel decoration to a Christmas tree.
 * It extends the TreeDecorator to modify the tree's decoration behavior.
 */
public class Tinsel extends TreeDecorator {
    /**
     * Constructs a Tinsel decorator with a specified ChristmasTree instance.
     *
     * @param tree The ChristmasTree to be decorated with tinsel.
     */
    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTinsel();
    }

    /**
     * Decorates the tree with tinsel and returns the corresponding description.
     *
     * @return A string indicating that the tree is decorated with tinsel.
     */
    private String decorateWithTinsel() {
        return " with Tinsel";
    }
}
