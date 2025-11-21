### JVM - Java Virtual Machine
Maquina Virtual do Java (JVM) é uma máquina virtual que permite que computadores executem programas Java, alem de permitir desenvolver os aplicativos em Java.

package = agrupamento lógico de classes e interfaces relacionadas.
modulo = agrupamento lógico de pacotes relacionados.
runtime = agrupamento físico (arquivos).
aplicação = conjunto de módulos relacionados.

## codigos Java Basicos:

  sysout = atalho para System.out.print

Exemplo de código Java:
```System.out.print("Olá mundo!");```
Codiigo para imprimir algo no console.

```System.out.println("Olá mundo!");```
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

### Operadores Aritméticos

Math.sqrt = raiz quadrada
Math.pow = potência
Math.abs = valor absoluto