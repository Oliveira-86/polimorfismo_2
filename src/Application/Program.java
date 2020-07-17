package Application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Tax payer # " + i + " data:");
			System.out.print("Individual or company (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda: ");
			Double rendaAnual = sc.nextDouble();
			if(ch == 'f') {
				System.out.print("Health expenditures: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Número de Funcionarios: ");
				int func = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, func));
			}
			
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Pessoa pes : list) {
			Double imposto = pes.imposto();
			System.out.println(pes.getName() + ": $ " + String.format("%.2f", imposto));
			sum += imposto;
			
		}
		
		System.out.println();
		System.out.println(sum);
		
		
		sc.close();
		

	}



}
