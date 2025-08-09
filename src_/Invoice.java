/*
 * 6. Invoice Class
 * This class represents an invoice Linking customer to a total amount.
 */



//Composition Concept
// Relationship 'has-a' between classes
// รถยนต์มีเครื่องยนต์ มีล้อ มีเบาะนั่ง

public class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be non-negative.");
        }
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative.");
        }
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        this.customer = customer;
    }

    
    public void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative.");
        }
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName () {
        return customer.getName();
    }

    // public int getCustomerDiscount() {
    //     return customer.getDiscount();
    // }

    // คำนวณ ยอดเงินสุดท้ายหลังหักส่วนลด
    // Core business logic : apply the customer's discount policy
    public double getAmountAfterDiscount() {
        // คำนวณหาส่วนลดจริง
        // double discountAmount = (this.amount * customer.getDiscount()) / 100.0;
        // คำนวณหายอดเงินสึดท้ายหลังหักส่วนลด
        // return this.amount - discountAmount;

        // return this.amount * (1 - customer.getDiscount() / 100.0);
        return this.customer.getdiscountPolicy().applyDiscount(this.amount);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // return String.format("Invoice[id=%d , customer=%s , amount=%.2f]" , this.id , customer , this.amount);
        return "Invoice{ " + "id= " + id + ", customerID= " + getCustomerId() + ", customerName= " + getCustomerName() + ", originalAmount= " +
        String.format("%.2f", amount) + ", discountAmount= " + String.format("%.2f", (amount - getAmountAfterDiscount())) + 
        ", amountAfterDiscount= " + String.format("%.2f", getAmountAfterDiscount()) + " }";
    }

}
