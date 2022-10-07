package service.impl;

import entities.Customer;
import entities.Product;
import entities.Receipt;
import exceptions.ServiceException;
import service.CashierService;
import utils.Store;

public class CashierServiceImpl implements CashierService {

    public String dispenseReceipt(Customer customer, Product product) {
        if (customer == null) throw new ServiceException("Who bought this product?");

        Receipt receipt = new Receipt(customer.getName(), product.getPrice());
        return receipt.toString();

    }

    @Override
    public String sellProduct(Customer customer, Product product, Store store) {
        if (customer == null || product == null) {
            throw new ServiceException("customer or product cannot be null");
        } else {
            for (Product item : store.getProductsInStore()
            ) {
                if ((customer.getCashAtHand()).compareTo(product.getPrice()) <= 0) {
                    return "Insufficient funds";
                } else if (item.equals(product)) {
                    customer.setCashAtHand(customer.getCashAtHand().subtract(product.getPrice()));
                    product.setNoOfProductAvailable(product.getNoOfProductAvailable() - 1);
                    customer.addToProductBought(new Product(product.getNameOfProduct(), product.getProductID(), product.getPrice(), 1, product.getCategory()));
                    return "Your order has been delivered";
                } else return product.getNameOfProduct() + " IS OUT OF STOCK";
            }

        }
        return "Sold";
    }
}