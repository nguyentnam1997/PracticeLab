package lab2.entities;

import lab2.service.StudentService;

public class Student {
     public static int autoId = 0;
     private int id;
     private String name;
     private double scoreMath;
     private double scorePhysic;
     private double scoreChemistry;

    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id = ++autoId;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
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

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }


    public String toString(StudentService studentService) {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                ", ranked=" + classify() +
                '}';
    }
    public String classify() {
        double avg = (scoreMath + scorePhysic + scoreChemistry) / 3;
        if (avg >= 8) return "A";
        else if (avg < 8 && avg >= 6.5) return "B";
        else return "C";
    }

//    public double calculateAVG() {
//        return (scoreMath + scorePhysic + scoreChemistry) / 3;
//    }
}
