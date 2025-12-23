package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Coloque o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Dados do funcionário #" + i + ": ");
            System.out.print("É tercerizado (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas: ");
            int hours = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y' ) {
                System.out.print("Taxa adicional: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

            System.out.println();
            System.out.println("Pagamentos: ");
            for (Employee emp : list) {
                System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
            }

            sc.close();
        }
    }
}
