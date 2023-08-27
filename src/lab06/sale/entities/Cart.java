package lab06.sale.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static  int autoId;
    private int id;
    private List<Product> products;

    public Cart(List<Product> products) {
        this.id = ++autoId;
        this.products = products;
    }

    public Cart() {
        this.id = ++autoId;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
