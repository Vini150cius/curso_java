package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class java_exercicios_027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> students = new HashSet<>();

        System.out.print("Quantos estudantes tem o curso A? ");
        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            students.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.print("Quantos estudantes tem o curso B? ");
        q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            students.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.print("Quantos estudantes tem o curso C? ");
        q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            students.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("Total de estudantes: " + students.size());
    }
}
