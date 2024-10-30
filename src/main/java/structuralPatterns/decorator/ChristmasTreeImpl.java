package structuralPatterns.decorator;

/**
 * The ChristmasTreeImpl class is a concrete implementation of the ChristmasTree interface.
 * It represents a basic, undecorated Christmas tree.
 */
public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
