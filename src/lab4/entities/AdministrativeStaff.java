package lab4.entities;

public class AdministrativeStaff extends Staff{
    public AdministrativeStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getBasicSalary() {
        return super.getBasicSalary();
    }

    @Override
    public void setBasicSalary(double basicSalary) {
        super.setBasicSalary(basicSalary);
    }
}
