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

## Constantes

Constantes são variáveis que não podem ter seu valor alterado durante a execução do programa. Em Java, as constantes são declaradas utilizando a palavra-chave `final` e geralmente são escritas em letras maiúsculas com palavras separadas por underscores `_`.

```Java
public static final double PI = 3.14159;
```

## Metodos Estáticos

Métodos estáticos pertencem à classe em si, e não a uma instância específica da classe. Eles podem ser chamados sem a necessidade de criar um objeto da classe.

Ou seja, são funções que estão no mesmo arquivo da classe principal e podem ser chamadas diretamente.

```Java
 public class Program {
	public static final double PI= 3.14159;

	public static void main (String[] args) {
		double c = circumference(radius);
		double v = volume(radius);
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
 }
```

Tambem é possível chamar métodos estáticos de outras classes, mas diferente de metodos de instância, não é necessário criar um objeto da classe para chamar o método estático.

```Java
 double result = Calculator.volume(25.0);
```

## Construtores

Construtores são métodos especiais usados para inicializar objetos de uma classe. Eles têm o mesmo nome da classe.

```Java
public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
```

## Sobrecarga de Construtores

A sobrecarga de construtores permite que uma classe tenha múltiplos construtores com diferentes listas de parâmetros. Isso possibilita a criação de objetos de maneiras diferentes, dependendo dos dados disponíveis no momento da instânciação.
Tambem podemos ter um construtor padrão (sem parâmetros).

## Encapsulamento

Encapsulamento é a restrição do acesso direto aos dados de um objeto, tendo que utilizar métodos específicos para acessar e modificar esses dados (getters e setters).
Primeiro temos que definir os atributos como private e depois criar os métodos `get` e `set`.

```Java
public class Product {
		private String name;
 
		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}
}
```

## Gerando Construtores, Getters e Setters Automaticamente no IntelliJ

1. Clique com o botão direito dentro da classe onde você deseja gerar o construtor, getters e setters.
2. Selecione "Generate..." ou pressione `Alt + Insert`.
3. Escolha "Constructor" para gerar o construtor, "Getter" para gerar os getters, ou "Setter" para gerar os setters.
4. Selecione os atributos que você deseja incluir e clique em "OK".

## Modificadores de Acesso

private = acessível apenas dentro da própria classe.
(nada) = acessível dentro do mesmo pacote.
protected = acessível dentro do mesmo pacote e em subclasses.
public = acessível de qualquer lugar.

## Classes não tem valor

Variaveis do tipo classe armazenam referências para objetos na memória, e não os próprios objetos.
![exemplo](imagensReadme/image2.png)

![Tipos referencia vs tipo valor](imagensReadme/image3.png)

## Vetores

### Arranjo (array) é uma estrutura de dados

Homogênea (dados do mesmo tipo)
Ordenada (elementos acessados por meio de posições)
 Alocada de uma vez só, em um bloco contíguo de memória

### Vantagens

 Acesso imediato aos elementos pela sua posição

### Desvantagens

 Tamanho fixo
 Dificuldade para se realizar inserções e deleções.

### Estrutura de criação de um vetor

```Java
tipo[] nomeDoVetor = new tipo[tamanho];
```

```Java
double[] nomeDoVetor = new double[10];
```

### Inserindo valores em um vetor

No exemplo abaixo, o usuário informa o tamanho do vetor e depois insere os valores, utilizando de um `for` para percorrer o vetor e inserir os valores.

```Java
int n =sc.nextInt();
double[] vect = new double[n];  
  for (int i=0; i<n; i++){
    vect[i] = sc.nextDouble();
  }
```

### Criação de um vetor numa classe

```Java
public class Product {

    private String name;
    private double price;
}
```

```Java
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(price, name);
        }
```
