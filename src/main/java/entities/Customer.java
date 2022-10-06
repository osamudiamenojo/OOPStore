package entities;

import enums.Gender;
import services.CustomerService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    private BigInteger cashAtHand;
    private List<Product> productsBought=new ArrayList();

    public BigInteger getCashAtHand() {
        return cashAtHand;
    }

    public void setCashAtHand(BigInteger cashAtHand) {
        this.cashAtHand = cashAtHand;
    }

    public List<Product> getProductsBought() {
        return productsBought;
    }

    public void setProductsBought(List<Product> productsBought) {
        this.productsBought = productsBought;
    }
    public void addToProductBought(Product product){
        this.productsBought.add(product);
    }

    public Customer(BigInteger cashAtHand) {
        this.cashAtHand = cashAtHand;
    }

    public Customer(BigInteger cashAtHand, List<Product> productsBought) {
        this.cashAtHand = cashAtHand;
        this.productsBought = productsBought;
    }

    public Customer(String name, Gender gender, BigInteger cashAtHand) {
        super(name, gender);
        this.cashAtHand = cashAtHand;
    }
}
