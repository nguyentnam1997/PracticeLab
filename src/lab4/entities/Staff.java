package lab4.entities;

public class Staff {
    private static int autoId;
    private int id;
    private String name;
    private double basicSalary;

    public Staff(String name, double basicSalary) {
        this.id = ++autoId;
        this.name = name;
        this.basicSalary = basicSalary;
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

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
