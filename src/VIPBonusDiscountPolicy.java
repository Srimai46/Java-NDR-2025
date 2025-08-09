/*
 * 4. VIPBonusDiscountPolicy Class
 * This class applies a bonus discount for VIP customers.
 */

public class VIPBonusDiscountPolicy implements DiscountPolicy {

    private int basePercent; // ส่วนลดพื้นฐานที่ได้รับเสมอ
    private int bonusPercent; // ส่วนลดพิเศษที่จะได้รับเพิ่ม จาก basePercent
    // เงื่อนไขโดยยอดเงิน (amount) ที่จากมากกว่า bonusThreshold 
    // ส่วนลดพิเศษจะถูกเพิ่มเข้าไปในส่วนลดพื้นฐาน
    private double bonusThreshold; 

    public VIPBonusDiscountPolicy(int basePercent , int bonusPercent, double bonusThreshold) {
        if (basePercent < 0 || basePercent > 100) {
            throw new IllegalArgumentException("Base Discount Percentage must be between 0 and 100");
        }
        if (bonusPercent < 0 || bonusPercent > 100) {
            throw new IllegalArgumentException("Bonus Discount Percentage must be between 0 and 100");
        }
        if (bonusThreshold < 0) {
            throw new IllegalArgumentException("Bonus Threshold must be non-negative.");
        }
        this.basePercent = basePercent;
        this.bonusPercent = bonusPercent;
        this.bonusThreshold = bonusThreshold;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative.");
        }
        int totalPercent = basePercent;
        if (amount > bonusPercent){
            totalPercent += bonusPercent;
        }
        // Cap the total discount at 100% to prevent negative price
        if (totalPercent > 100) {
            totalPercent = 100;
        }
        return amount * (1 - totalPercent / 100.0);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%d%% base + %d bonus over %.2f", basePercent, bonusPercent, bonusThreshold);
    }

    
}
