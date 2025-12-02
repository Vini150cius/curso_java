package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.grade01 = sc.nextDouble();
        student.grade02 = sc.nextDouble();
        student.grade03 = sc.nextDouble();

        System.out.print(student);
    }
}
