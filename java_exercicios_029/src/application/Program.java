package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                emp.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Digite o salário: ");
        double sal = sc.nextDouble();

        List<String> email = emp.stream().filter(x -> x.getSalary() > sal).map(Employee::getEmail).sorted().toList();
        System.out.println("Email das pessoas que tem salário maior do que " + String.format("%.2f", sal) + ":");
        email.forEach(System.out::println);

        double sum = emp.stream().filter(x -> x.getName().charAt(0) == 'M').mapToDouble(Employee::getSalary).sum();
        System.out.println("Soma dos salários que o nome começa com M: " + String.format("%.2f", sum));
    }
}
