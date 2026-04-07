import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double base, altura;
        double area, perimetro;

        // entrada de dados
        System.out.print("Digite o valor da base: ");
        base = sc.nextDouble();

        System.out.print("Digite o valor da altura: ");
        altura = sc.nextDouble();

        // processamento de dados
        area = base * altura;
        perimetro = 2 * (base + altura);

        // saída de dados
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}