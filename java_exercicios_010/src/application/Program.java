package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] vector = new Rent[10];

        System.out.print("Quantos quartos deseja alocar? ");
        int numRooms = sc.nextInt();

        for(int i = 0; i < numRooms; i++){
            System.out.println();
            System.out.println("Locação #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            vector[room] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i < vector.length; i++){
            if(vector[i] != null){
                System.out.println(i + ": " + vector[i]);
            }
        }


    }
}
