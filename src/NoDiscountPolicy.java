public class NoDiscountPolicy implements DiscountPolicy {
    @Override
    public double applyDiscount(double amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative.");
        }
        return amount;
    }

    @Override
    public String toString() {
        return "No Discount";
    }
}