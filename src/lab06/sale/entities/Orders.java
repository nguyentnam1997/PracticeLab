package lab06.sale.entities;

import java.time.LocalDate;

public class Orders {
    private static int autoId;
    private int id;
    private LocalDate orderDate;
    private Customer customer;
    private String status;
    private double total;

    public int getId() {
        return id;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
