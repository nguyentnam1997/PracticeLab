package lab06.sale.entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static int autoId;
    private int id;
    private String name;
    private String status;
    private String des;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, String status, String des, double price, int quantity) {
        this.id = ++autoId;
        this.name = name;
        this.status = status;
        this.des = des;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(Product productOther, int productQuantity) {
        this.id = productOther.getId();
        this.name = productOther.getName();
        this.status = productOther.getStatus();
        ;
        this.des = productOther.getDes();
        this.price = productOther.getPrice();
        this.quantity = productQuantity;
    }

    public List<Product> Init() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", "1", "ABC", 50000, 1));
        products.add(new Product("Product2", "2", "ABC", 50000, 1));
        products.add(new Product("Product3", "3", "ABC", 50000, 1));
        return products;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Product.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
