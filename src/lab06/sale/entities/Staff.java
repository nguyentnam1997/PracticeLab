package lab06.sale.entities;

public class Staff extends Person {
    private String email;

    public Staff(String name, int phone, String address) {
        super(name, phone, address);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
