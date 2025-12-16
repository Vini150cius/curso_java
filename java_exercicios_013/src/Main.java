import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A matrix terá quantas linhas? ");
        int m =  sc.nextInt();

        System.out.print("A matrix terá quantas colunas? ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Qual número deseja saber os dados? ");
        int x = sc.nextInt();

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matrix[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Em cima : " + matrix[i-1][j]);
                    }
                    if (j < matrix[i].length-1) {
                        System.out.println("Direita: " + matrix[i][j+1]);
                    }
                    if (i < matrix.length-1) {
                        System.out.println("Baixo: " + matrix[i+1][j]);
                    }
                }
            }
        }
    }
}