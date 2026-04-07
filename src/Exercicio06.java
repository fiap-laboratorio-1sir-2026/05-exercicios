
// Math.sqrt() --> calcula a raiz quadrada de um número -- Square Root
// Math.cbrt() --> calcula a raiz cúbica de um número --> Cubic Root

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double x, y;

        // entrada de dados
        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        // processamento de dados
        y = Math.sqrt(Math.cbrt(x - 0.5));

        // saída de dados
        System.out.println("y = " + String.format("%.3f", y));
    }
}