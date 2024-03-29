package lab3.entities;

public class Worker {
    private static int autoId;
    private String id;
    private String name;
    private int age;
    private double salary;
    private String workPlace;

    public Worker(String name, int age, double salary, String workPlace) {
        this.id = "W " + ++autoId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workPlace = workPlace;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }



}
