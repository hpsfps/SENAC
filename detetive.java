package detetive;

import java.util.Scanner;

public class detetive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Responda 'sim' ou 'não' para as seguintes perguntas:");

		System.out.print("Telefonou para a vítima? ");
		String resposta1 = scanner.nextLine().toLowerCase();

		System.out.print("Esteve no local do crime? ");
		String resposta2 = scanner.nextLine().toLowerCase();

		System.out.print("Mora perto da vítima? ");
		String resposta3 = scanner.nextLine().toLowerCase();

		System.out.print("Devia para a vítima? ");
		String resposta4 = scanner.nextLine().toLowerCase();

		System.out.print("Já trabalhou com a vítima? ");
		String resposta5 = scanner.nextLine().toLowerCase();

		int totalSim = 0;

		if (resposta1.equals("sim"))
			totalSim++;
		if (resposta2.equals("sim"))
			totalSim++;
		if (resposta3.equals("sim"))
			totalSim++;
		if (resposta4.equals("sim"))
			totalSim++;
		if (resposta5.equals("sim"))
			totalSim++;

		if (totalSim == 2) {
			System.out.println("Você é considerado suspeito.");
		} else if (totalSim >= 3 && totalSim <= 4) {
			System.out.println("Você é considerado cúmplice.");
		} else if (totalSim == 5) {
			System.out.println("Você é o assassino!");
		} else {
			System.out.println("Você é considerado inocente.");
		}

		scanner.close();
	}
}