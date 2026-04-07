import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        int numero, centena, dezena, unidade, invertido;

        // entrada de dados
        System.out.print("Digite um número de três dígitos: ");
        numero = sc.nextInt();

        // processamento de dados
        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = numero % 10;

        invertido = unidade * 100 + dezena * 10 + centena;

        // saída de dados
        System.out.println("Número invertido: " + invertido);
    }
}