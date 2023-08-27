package lab06.sale.entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class FPTShop {
    private Map<Integer, Product> products;
    private Map<Integer, Orders> orders;
    private Map<Integer, Customer> customers;

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Orders> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Orders> orders) {
        this.orders = orders;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }
}
