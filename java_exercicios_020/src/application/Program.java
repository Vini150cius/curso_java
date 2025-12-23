package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numPayers = sc.nextInt();
        System.out.println();

        for (int i = 0; i < numPayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + ": ");
            System.out.print("Individual or company (i/c)? ");
            char option = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (option == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                payers.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (option == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                payers.add(new Company(name, anualIncome, numberOfEmployees));
            } else {
                System.out.println("Invalid option");
            }
        }

        System.out.println("Taxes paid: ");
        double totalTaxes = 0.00;
        for (TaxPayer payer : payers) {
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
            totalTaxes += payer.tax();
            System.out.println();
            System.out.println("Total taxes: " + String.format("%.2f", totalTaxes));
        }
    }
}
