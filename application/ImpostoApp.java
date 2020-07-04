package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class ImpostoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int num = sc.nextInt();

		List<Contribuinte> list = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or Company (i / c)? ");
			String type = sc.next();

			if (type.equalsIgnoreCase("I")) {

				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual Income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double gastosSaude = sc.nextDouble();

				Contribuinte individual = new PessoaFisica(name, rendaAnual, gastosSaude);
				list.add(individual);

			} else if (type.equalsIgnoreCase("C")) {

				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual Income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numFuncionarios = sc.nextInt();

				Contribuinte company = new PessoaJuridica(name, rendaAnual, numFuncionarios);
				list.add(company);

			} else {
				System.out.println("Invalid type! Try again!");
				i--;
			}
		}

		double sum = 0.0;
		System.out.println("TAXES PAID: ");

		for (Contribuinte c : list) {
			System.out.printf(c.getName() + " $ %.2f%n", c.calcularImposto());
			sum += c.calcularImposto();
		}

		System.out.printf("TOTAL TAXES: $ %.2f ", sum);
		sc.close();
	}

}
