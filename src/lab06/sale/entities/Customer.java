package lab06.sale.entities;

public class Customer extends Person {
    private double balance;
    private Cart cart;

    public Customer(String name, int phone, String address, double balance) {
        super(name, phone, address);
        this.balance = balance;
        this.cart = new Cart();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
