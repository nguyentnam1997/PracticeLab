package lab4.entities;

public class Manager extends Staff{
    private double responsibleSalary;

    public Manager(String name, double basicSalary, double finalSalary, double responsibleSalary) {
        super(name, basicSalary, finalSalary);
        this.responsibleSalary = responsibleSalary;
    }

    public double getResponsibleSalary() {
        return responsibleSalary;
    }

    public void setResponsibleSalary(double responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }
}
