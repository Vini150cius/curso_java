package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Digite o endereço do arquivo .csv: ");
        String strPath = sc.nextLine();
        File sourceFile = new File(strPath);

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String line = br.readLine();
            while (line != null) {
                String[] datasStrings = line.split(",");
                String name = datasStrings[0];
                double price = Double.parseDouble(datasStrings[1]);
                int quantity = Integer.parseInt(datasStrings[2]);
                products.add(new Product(name, price, quantity));

                line = br.readLine();
            }

            String outPath = sourceFile.getParent();
            outPath = outPath + "\\out";
            File outDir = new File(outPath);

            if (!outDir.exists()) {
                boolean success = outDir.mkdirs();
                if (!success) {
                    System.out.println("Erro ao gerar diretório de saída");
                    return;
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath + "\\summary.csv"))) {
                for (Product p : products) {
                    bw.write(p.toString());
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado." + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }
    }
}
