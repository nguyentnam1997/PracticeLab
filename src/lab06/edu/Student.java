package lab06.edu;

import lab06.sale.entities.Person;

public class Student extends Person {
    private String email;
    private double avgScore;

    public Student(String name, int phone, String address, String email, double avgScore) {
        super(name, phone, address);
        this.email = email;
        this.avgScore = avgScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
}
