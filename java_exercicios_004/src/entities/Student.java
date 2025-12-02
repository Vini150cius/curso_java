package entities;

public class Student {
    public String name;
    public double grade01;
    public double grade02;
    public double grade03;

    public double finalGrade() {
        return grade01 + grade02 + grade03;
    }

    public String situation(double grade) {
        if (grade >= 60) {
            return "PASS";
        } else {
            return "FAILED\nMISSING " + String.format("%.2f", 60.0 - grade) + " POINTS";
        }
    }

    public String toString() {
        double finalGrade = finalGrade();
        return String.format("FINAL GRADE = %.2f%n%s", finalGrade, situation(finalGrade));
    }
}
