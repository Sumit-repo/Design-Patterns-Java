package structuralPatterns.decorator;

public class Test {
    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTreeImpl();
        System.out.println(tree.decorate());

        tree = new BubbleLights(tree);
        System.out.println(tree.decorate());

        tree = new Garland(tree);
        System.out.println(tree.decorate());

        tree = new TreeTopper(tree);
        System.out.println(tree.decorate());

        tree = new Tinsel(tree);
        System.out.println(tree.decorate());
    }
}
