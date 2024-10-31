package BehavioralPatterns.strategy;

public class StrategyUsingJava8StaticMethods {
    public static void main(String[] args) {
        Discounter christmasDiscounter = Discounter.christmasDiscounter();
        Discounter easterDiscounter = Discounter.easterDiscounter();
        Discounter newYearDiscounter = Discounter.newYearDiscounter();

        double amount = 100;
        System.out.println("Christmas discount: " + christmasDiscounter.applyDiscount(amount));
        System.out.println("Easter discount: " + easterDiscounter.applyDiscount(amount));
        System.out.println("New Year discount: " + newYearDiscounter.applyDiscount(amount));
    }
}

interface Discounter {
    double applyDiscount(double amount);

    static Discounter christmasDiscounter() {
        return amount -> amount * 0.9;
    }

    static Discounter easterDiscounter() {
        return amount -> amount * 0.5;
    }

    static Discounter newYearDiscounter() {
        return amount -> amount * 0.8;
    }
}
