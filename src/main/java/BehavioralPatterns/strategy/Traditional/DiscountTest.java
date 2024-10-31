package BehavioralPatterns.strategy.Traditional;

public class DiscountTest {
    public static void main(String[] args) {
        Discounter christmasDiscounter = new ChristmasDiscounter();
        Discounter easterDiscounter = new EasterDiscounter();

        double amount = 100;
        System.out.println("Christmas discount: " + christmasDiscounter.applyDiscount(amount));
        System.out.println("Easter discount: " + easterDiscounter.applyDiscount(amount));
    }
}
