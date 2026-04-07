import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double tempo, velocidade, distancia, litros;

        // entrada de dados
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        tempo = sc.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        velocidade = sc.nextDouble();

        // processamento de dados
        distancia = tempo * velocidade;
        litros = distancia / 10.5;

        // saída de dados
        System.out.println("Quantidade de litros de combustível gasta: " + litros);
    }
}