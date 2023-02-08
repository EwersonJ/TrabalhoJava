package Pacote;

import java.util.Scanner;

public class Questão1419 {
	
	public static void main (String[] args) {
			
		Scanner inserir = new Scanner(System.in);
		
		int dia, mês, ano;
		
		do {
		System.out.println("Digite o dia:");
		dia = inserir.nextInt();
		
		if (dia > 31) {
		System.out.println("Esse dia não existe, insira outro!");
		}
		} while (dia > 31);
		
		do {
			System.out.println("Digite o mês:");
			mês = inserir.nextInt();
			
			if (mês > 12) {
			System.out.println("Esse mês não existe, digite outro!");
			}
			} while (mês> 12);
			
			System.out.println("Digite o ano:");
			ano = inserir.nextInt();	
		
			if (mês == 1) {
				System.out.print("Janeiro");
				}
				if (mês == 2){
				System.out.print("Fevereiro");
				}
				if (mês == 3) {
					System.out.print("Março");
				}
				if (mês == 4) {
					System.out.print("abril");
				}
				if (mês == 5) {
					System.out.print("maio");
				}
				if (mês == 6) {
					System.out.print("junho");
				}
				if (mês == 7) {
					System.out.print("julho");
				}
				if (mês == 8) {
					System.out.print("agosto");
				}
				if (mês == 9) {
					System.out.print("setembro");
				}
				if (mês == 10) {
					System.out.print("outubro");
				}
				if (mês == 11) {
					System.out.print("novembro");
				}
				if (mês == 12) {
					System.out.print("dezembro");
				}
			
			System.out.print("/");
			System.out.print(dia);
			System.out.print("/");
			System.out.print(ano);
			
			
			
			
			
}
}
