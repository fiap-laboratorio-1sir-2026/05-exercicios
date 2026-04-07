import java.util.Scanner;

/*
A conversão de um número binário para decimal é feita multiplicando cada dígito
(0 ou 1) pela potência de 2 correspondente à sua posição.

Começando da direita para a esquerda:
- o último dígito é multiplicado por 2^0 (1)
- o penúltimo por 2^1 (2)
- o próximo por 2^2 (4)
- e assim por diante

Em seguida, somamos todos esses valores.

Exemplo: 1011 (binário)
= 1*8 + 0*4 + 1*2 + 1*1
= 11 (decimal)
*/

public class Exercicio10 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        int binario, b1, b2, b3, b4, decimal;

        // entrada de dados
        System.out.print("Digite um número binário de 4 bits: ");
        binario = sc.nextInt();

        // processamento de dados
        b1 = binario / 1000;
        b2 = (binario % 1000) / 100;
        b3 = (binario % 100) / 10;
        b4 = binario % 10;

        decimal = b1 * 8 + b2 * 4 + b3 * 2 + b4 * 1;

        // saída de dados
        System.out.println("Valor em decimal: " + decimal);
    }
}