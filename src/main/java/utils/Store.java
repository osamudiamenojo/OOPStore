package utils;

import entities.Product;
import enums.Category;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private  List<Product> productsInStore = new ArrayList<>();


    public List<Product> getProductsInStore() {
        return productsInStore;
    }

    public void setProductsInStore(List<Product> productsInStore) {
        this.productsInStore = productsInStore;
    }




    public String csvReader(){

        String path = "/Users/mac/Documents/Decagontask/week-two-sq012-osamudiamenojo/src/main/resources/Products in a Store - Sheet1.csv";
        String line ="";
        try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader(path));
            while ((line=bufferedReader.readLine())!=null){
                String [] values=line.split(",");
                Product product = new Product();
                product.setProductID(values[0]);
                product.setNameOfProduct(values[1]);
                product.setPrice(BigInteger.valueOf(Long.parseLong(values[2])));
                product.setNoOfProductAvailable(Integer.parseInt(values[3]));
                product.setCategory(Category.valueOf(values[4].toUpperCase()));
                productsInStore.add(product);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "Store is open";
    }

}
