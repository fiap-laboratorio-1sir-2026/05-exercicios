import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        // entrada de dados
        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = sc.nextDouble();

        // processamento de dados
        fahrenheit = celsius * 9/5 + 32;

        // saída de dados
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}