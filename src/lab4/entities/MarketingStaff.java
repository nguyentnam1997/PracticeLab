package lab4.entities;

public class MarketingStaff extends Staff{
    private double sales;
    private double commissionRate;

    public MarketingStaff(String name, double basicSalary, double sales, double commissionRate) {
        super(name, basicSalary);
        this.sales = sales;
        this.commissionRate = commissionRate;
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

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


}
