package services.impl;

import entities.Customer;
import entities.Product;
import entities.Receipt;
import exceptions.ServiceException;
import services.CashierService;

public class CashierServiceImpl implements CashierService {

    public String dispenseReceipt(Customer customer, Product product) {
        if(customer==null) throw new ServiceException("Who bought this product?");

        Receipt receipt= new Receipt(customer.getName(), product.getPrice());
        return receipt.toString();

    }
    @Override
    public String sellProduct(Customer customer, Product product){
            if(product.getNoOfProductAvailable()>0 && (customer.getCashAtHand()).compareTo(product.getPrice())<=0){
                customer.setCashAtHand(customer.getCashAtHand().subtract(product.getPrice()));
                product.setNoOfProductAvailable(product.getNoOfProductAvailable()-1);
                customer.addToProductBought(new Product(product.getNameOfProduct(),product.getProductID(), product.getPrice(), 1, product.getCategory()));
                return "Your order has been delivered";
            }
            return product.getNameOfProduct() +" not available or insufficient fund";
        }

}
