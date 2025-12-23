package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numProd = sc.nextInt();

        for (int i = 0; i < numProd; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            switch (option) {
                case 'c':
                    products.add(new Product(name, price));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String dateStr = sc.next();
                    LocalDate date = LocalDate.parse(dateStr, fmt);
                    products.add(new UsedProduct(name, price, date));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

        System.out.println();
        System.out.println("Price tags: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

    }
}
