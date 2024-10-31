package BehavioralPatterns.strategy;

import BehavioralPatterns.strategy.Traditional.Discounter;

public class StrategyUsingJava8Lambda {
    public static void main(String[] args) {
        Discounter christmasDiscounter = amount -> amount * 0.9;
        Discounter easterDiscounter = amount -> amount * 0.5;

        double amount = 100;
        System.out.println("Christmas discount: " + christmasDiscounter.applyDiscount(amount));
        System.out.println("Easter discount: " + easterDiscounter.applyDiscount(amount));
    }
}
