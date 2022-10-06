package entities;
import enums.Category;

import java.math.BigInteger;


public class Product {
private String nameOfProduct;
private String productID;
private BigInteger price;
private int noOfProductAvailable;
private Category category;

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public int getNoOfProductAvailable() {
        return noOfProductAvailable;
    }

    public void setNoOfProductAvailable(int noOfProductAvailable) {
        noOfProductAvailable = noOfProductAvailable;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }

    public Product(String nameOfProduct, String productID, BigInteger price, int noOfProductAvailable, Category category) {
        this.nameOfProduct = nameOfProduct;
        this.productID = productID;
        this.price = price;
        this.noOfProductAvailable = noOfProductAvailable;
        this.category = category;
    }
}
