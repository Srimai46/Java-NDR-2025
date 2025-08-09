/*
 * 5. Customer CLass
 * IT has a "has-a" relationship with DiscountPolicy .
 * This class represents a customer with an ID, name and discountPolicy.
 */
public class Customer {

    private final int id;
    private String name;
    private DiscountPolicy discountPolicy;

    /*
     * Constructor for create Customer object.
     * @param id รหัสลูกค้าไม่ซ้ำกัน และไไม่เป็นค่าลบ
     * ๑@param name ไม่เป็นค่าว่าง
     * @param discount ส่วนลด % [0-100]
     * @throw IllegalArgumentException หาก @param ไม่ถูกต้อง
     */
    public Customer(int id, String name, DiscountPolicy discountPolicy) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be non-negative.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer Name must not be null or blank");
        }
        if (discountPolicy == null) {
            throw new IllegalArgumentException("Customer must have a DiscountPolicy");
        }

        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy getdiscountPolicy() {
        return this.discountPolicy;
    }

    public void setDiscount(DiscountPolicy policy) {
        if (policy == null) {
            throw new IllegalArgumentException("Customer must have a DiscountPolicy");
        }
        this.discountPolicy = policy;
    }

    @Override
    public String toString() {
        //TODO Auto-generated method stub
        return "Customer{" + "id= " + id + " , name= " + name + '\'' + ", discountPolicy= " + discountPolicy + "}";

    }

}
