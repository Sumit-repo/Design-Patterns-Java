package BehavioralPatterns.strategy.Traditional;

public class ChristmasDiscounter implements Discounter {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
