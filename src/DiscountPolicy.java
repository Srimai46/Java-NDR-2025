/*
 *  1.DiscountPolicy Interface
 */

public interface DiscountPolicy {
    /*
     * @parqam abount the original amount
     * @return The amount after the discount is applied
     */
    double applyDiscount(double amount);
}
