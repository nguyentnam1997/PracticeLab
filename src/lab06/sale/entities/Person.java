package lab06.sale.entities;

public class Person {
    private static int autoId;
    private int id;
    private String name;
    private int phone;
    private String address;

    public Person(String name, int phone, String address) {
        this.id = ++autoId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
