package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public  static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Quantos colaboradores você irá registrar? ");
        int numberEmployee = sc.nextInt();

        for (int i = 0; i < numberEmployee; i++) {
            System.out.println();
            System.out.println("Colaborador #" + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.print("Esse ID já foi usado. Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Coloque o ID do colaborador que terá o salário aumentado: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Esse ID não existe!");
        }
        else {
            System.out.print("Adicione a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de colaboradores:");
        for (Employee obj : employees) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
