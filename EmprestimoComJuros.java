package emprestimoComJuros;

import java.util.Scanner;

public class EmprestimoComJuros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor do empréstimo em : ");
		double valorEmprestimo = scanner.nextDouble();

		System.out.print("Informe a quantidade de meses para pagamento: ");
		int meses = scanner.nextInt();

		double taxaJurosMensal = 0.02;
		double parcela = calcularParcela(valorEmprestimo, taxaJurosMensal, meses);

		System.out.printf("Valor da parcela: R$ %.2f", parcela); // o %.2f é quantos numeros aparecem depois da virgula

		scanner.close();
	}

	public static double calcularParcela(double valorEmprestimo, double taxaJurosMensal, int meses) {
		double juros = Math.pow(1 + taxaJurosMensal, meses);
		double parcela = valorEmprestimo * taxaJurosMensal * juros / (juros - 1);
		return parcela;
	}
}