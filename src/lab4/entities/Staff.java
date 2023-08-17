package lab4.entities;

public class Staff {
    private static int autoId;
    protected int id;
    protected String name;
    protected double basicSalary;
    protected double finalSalary;

    public Staff(String name, double basicSalary, double finalSalary) {
        this.id = ++autoId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.finalSalary = finalSalary;
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

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }
}
