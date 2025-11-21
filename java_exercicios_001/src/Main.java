import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte option;

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Bem-vindo a interface de escolha dos exercicios projetados.\nDigite o número da opção desejada e dê enter para iniciar.");
        System.out.println("1. Soma");
        System.out.println("2. Área de um círculo");
        System.out.println("3. Diferença de dois pares.");
        System.out.println("4. Salário do funcionário. ");
        System.out.println("5. Valor da compra de peças. ");
        System.out.println("6. Áreas de figuras geométricas. ");
        System.out.println("-------------------------------------------------------------------------------------------------");

        option = sc.nextByte();

        if (option == 1) {

            int valor2, valor1, resultado;

            System.out.println("----- Soma -----");
            System.out.println("Valor 1: ");
            valor1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Valor 2: ");
            valor2 = sc.nextInt();
            sc.nextLine();
            resultado = valor1 + valor2;
            System.out.println("O valor da soma dos valores é: " + resultado);

        } else if (option == 2) {

            double valor, resultado;
            double pi = 3.14159;

            System.out.println("----- Área do círculo -----");
            System.out.println("Digite o raio do círculo: ");
            valor = sc.nextDouble();
            sc.nextLine();
            resultado = pi * (Math.pow(valor, 2));
            System.out.printf("O valor da área desse círculo é: %.4f%n", resultado);

        } else if (option == 3) {

            int valor1, valor2, valor3, valor4, resultado;

            System.out.println("----- Diferença de dois pares -----");
            System.out.println("Valor 1: ");
            valor1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Valor 2: ");
            valor2 = sc.nextInt();
            sc.nextLine();

            System.out.println("Valor 3: ");
            valor3 = sc.nextInt();
            sc.nextLine();

            System.out.println("Valor 4: ");
            valor4 = sc.nextInt();
            sc.nextLine();

            resultado = (valor1 * valor2 - valor3 * valor4);
            System.out.println("A diferença do produto de A e B pelo produto de C e D é:" + resultado);

        } else if (option == 4) {

            int numFuncionario, horasTrabalhadas;
            double valorPorHora, resultado;

            System.out.println("----- Salário do funcionário -----");

            System.out.println("Digite o número do funcionário: ");
            numFuncionario = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite as horas trabalhadas: ");
            horasTrabalhadas = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o valor que recebe por cada hora: ");
            valorPorHora = sc.nextDouble();
            sc.nextLine();

            resultado = (double) valorPorHora * horasTrabalhadas;
            System.out.printf("O funcionário do Nº " + numFuncionario + " e o salário dele será de: %.2f%n", resultado);

        } else if (option == 5) {

            int codPeca1, numPeca1, codPeca2, numPeca2;
            double valorPeca1, valorPeca2, resultado;

            System.out.println("----- Valor da compra de peças -----");

            System.out.println("Digite os detalhes do primeiro produto, escreva o código da peça, o número de peças, o valor unitário de cada peça em sequencia: ");
            codPeca1 = sc.nextInt();
            numPeca1 = sc.nextInt();
            valorPeca1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite os detalhes do segundo produto, escreva o código da peça, o número de peças, o valor unitário de cada peça em sequencia: ");
            codPeca2 = sc.nextInt();
            numPeca2 = sc.nextInt();
            valorPeca2 = sc.nextDouble();
            sc.nextLine();

            resultado = (double) (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
            System.out.printf("Valor a pagar: R$%.2f%n", resultado);

        } else if (option == 6) {

            double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

            System.out.println("----- Áreas de figuras geométricas -----");

            System.out.println("Digite três valores para calcular a área: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            triangulo = a * c / 2.0;
            circulo = 3.14159 * c * c;
            trapezio = (a + b) / 2.0 * c;
            quadrado = b * b;
            retangulo = a * b;

            System.out.printf("Triângulo: %.3f%n", triangulo);
            System.out.printf("Círculo: %.3f%n", circulo);
            System.out.printf("Trapézio: %.3f%n", trapezio);
            System.out.printf("Quadrado: %.3f%n", quadrado);
            System.out.printf("Retângulo: %.3f%n", retangulo);

        } else {
            System.out.println("Valor não permitido!! Você escreveu " + option);
        }

        System.out.println("-------------------------------------------------------------------------------------------------");
        sc.close();
    }

}
