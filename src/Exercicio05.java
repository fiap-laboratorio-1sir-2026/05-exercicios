import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorAula, porcentagemInss;
        int horasTrabalhadas;
        double salarioBruto, salarioLiquido;
        double valorDoDesconto;

        // entrada de dados
        System.out.print("Valor da aula --> R$ ");
        valorAula = sc.nextDouble();
        System.out.print("Total de horas trabalhadas --> ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Porcentagem de desconto do INSS --> ");
        porcentagemInss = sc.nextDouble();

        // processamento de dados
        salarioBruto = horasTrabalhadas * valorAula;
        valorDoDesconto = salarioBruto * porcentagemInss / 100;
        salarioLiquido = salarioBruto - valorDoDesconto;

        // saída de dados
        System.out.println("Salário Líquido: R$ " +
                String.format("%.2f", salarioLiquido));

    }
}
