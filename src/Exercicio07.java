import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double x, y, parte1, parte2;

        // entrada de dados
        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        // processamento de dados
        parte1 = (Math.pow(x, 4) - 1) / (2 * Math.pow(x, 2));
        parte2 = Math.sqrt(1 + Math.pow(parte1, 2));
        y = parte2 - Math.pow(x, 2) / 2;

        // saída de dados
        System.out.println("y = " + String.format("%.3f", y));

    }
}