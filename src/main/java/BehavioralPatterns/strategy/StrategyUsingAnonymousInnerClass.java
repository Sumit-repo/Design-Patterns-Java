package BehavioralPatterns.strategy;

import BehavioralPatterns.strategy.Traditional.Discounter;

public class StrategyUsingAnonymousInnerClass {
    public static void main(String[] args) {
        Discounter christmasDiscounter = new Discounter() {
            @Override
            public double applyDiscount(double amount) {
                return amount * 0.9;
            }
        };
        Discounter easterDiscounter = new Discounter() {
            @Override
            public double applyDiscount(double amount) {
                return amount * 0.5;
            }
        };

        double amount = 100;
        System.out.println("Christmas discount: " + christmasDiscounter.applyDiscount(amount));
        System.out.println("Easter discount: " + easterDiscounter.applyDiscount(amount));
    }
}
