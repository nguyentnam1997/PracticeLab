package lab06.edu;

import lab06.sale.entities.Person;

public class Teacher extends Person {
    private String email;
    private String major;

    public Teacher(String name, int phone, String address, String email, String major) {
        super(name, phone, address);
        this.email = email;
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
