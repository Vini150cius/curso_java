# Java - Conceitos Basicos

## Introdução ao Java

### JVM - Java Virtual Machine

Maquina Virtual do Java (JVM) é uma máquina virtual que permite que computadores executem programas Java, alem de permitir desenvolver os aplicativos em Java.

package = agrupamento lógico de classes e interfaces relacionadas.
modulo = agrupamento lógico de pacotes relacionados.
runtime = agrupamento físico (arquivos).
aplicação = conjunto de módulos relacionados.

## Codigos Java Basicos

sysout = atalho para System.out.print

Exemplo de código Java:
`System.out.print("Olá mundo!");`
Codiigo para imprimir algo no console.

`System.out.println("Olá mundo!");`
Codiigo para imprimir algo no console e o "ln" faz com que tenha quebra de linha.

Exemplo de formatação de números:

```Java
 double x = 10.35784;
 System.out.println(x);
 System.out.printf("%.2f%n", x);
 System.out.printf("%.4f%n", x);
 Locales.setDefault(Locale.US);
 System.out.printf("%.4f%n", x);
```

### Casting

Caso eu tenha duas variaveis de numeros inteiros e eu queira fazer uma divisão entre elas, o resultado será um número inteiro, mesmo que o resultado da divisão seja um número decimal. Para resolver isso, eu posso fazer um "casting" de uma das variaveis para double, assim o resultado será um número decimal.

```Java
 int a, b;
 a = 5;
 b = 2;
 double resultado = (double) a / b;
 System.out.println(resultado);
```

O casting seria como se fosse o parse no C#.

### Entrada de Dados

Para ler dados do usuário em Java, utilizamos a classe Scanner.

```Java
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		sc.close();
	}
}
```

Para ler do tipo int:

```Java
int x;
x = sc.nextInt();
```

Para ler do tipo double:

```Java
double x;
		x = sc.nextDouble();
```

Para ler dados da linha inteira :

```Java
string x;
		x = sc.nextLine();
```

### Operações Matemáticas

Math.sqrt = raiz quadrada
Math.pow = potência
Math.abs = valor absoluto

## Debug

Debug é o processo de encontrar e corrigir erros no código. O processo de debug depende da IDE que você está utilizando. Vou explicar como fazer debug no IntelliJ e no Eclipse.

### Debug no IntelliJ

1. Coloque um breakpoint clicando na margem esquerda da linha onde você quer parar a execução
2. Clique no icone de debug (um bug) ou pressione Shift + F9
3. A execução do programa irá parar no breakpoint
4. Se você quiser indo avançando ao longo do codigo linha por linha, pressione F10 (Step Over)

### Debug no Eclipse

1. Coloque um toggle breakpoint clicando na margem esquerda da linha onde você quer parar a execução
2. Clique no arquivo -> Debug As -> Java Application ou pressione F11
3. A execução do programa irá parar no breakpoint
4. Se você quiser indo avançando ao longo do codigo linha por linha, pressione F6(Step Over)

## Codigos de Java

### Estrutura Repetitiva - do While

Bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.

```Java
 do {
//bloco de comandos
 } while(condição);
```

## Convenções de Nomenclatura em Java

### CamelCase: lastName

pacotes
atributos
métodos
variáveis e parâmetros

### Pascal Case: ProductService

classes

## Bitwise

Operadores bit a bit operam diretamente nos bits dos números inteiros.
![Imagem demonstrando operadores bit a bit](imagensReadme/image.png)

## Funções Strings

1. Formatar: toLowerCase(), toUpperCase(), trim()
2. Recortar: substring(inicio), substring(inicio, fim)
3. Substituir: Replace(char, char), Replace(string, string)
4. Buscar: IndexOf, LastIndexOf
5. str.Split(" ")

### Split

```Java
 String s = "potato apple lemon";
String[] vect = s.split(" ");
String word1 = vect[0];
String word2 = vect[1];
String word3 = vect[2]
```

## Funções

As funções do Java são criadas embaixo da public static void main(String[] args) {}

## Classes e Instanciação de Objeto

Na pasta entities é criada a classe com os atributos e métodos. Na pasta application é onde o programa principal é executado.

```Java
package entities;

public class Triangle {
		public double a;
		public double b;
		public double c;
}
```

```Java
package application;

import entities.Triangle;
				Triangle x, y;
				x = new Triangle();
				y = new Triangle();
```
