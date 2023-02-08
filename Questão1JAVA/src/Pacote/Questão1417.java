package Pacote;

import java.util.Scanner;

public class Questão1417 {
	
	public static void main (String[] args) {
		

//14.17
		String palavra = null;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite uma palavra contendo 5 letras:");
			palavra = sc.nextLine();
			
			if (palavra.length() > 5) {
				System.out.println("Essa palavra não contém 5 letraa, insira outra corretamente!");
				
			}	
		} while (palavra.length() > 5);

		
		
		
		System.out.printf("\n Possibilidades: \n\n");
		
		System.out.print(palavra.charAt(0));
		System.out.print(palavra.charAt(1));
		System.out.print(palavra.charAt(2));
		
		System.out.printf("\n\n");
		
		System.out.print(palavra.charAt(0));
		System.out.print(palavra.charAt(2));
		System.out.print(palavra.charAt(1));
		
		System.out.printf("\n\n");
		
		System.out.print(palavra.charAt(0));
		System.out.print(palavra.charAt(1));
		System.out.print(palavra.charAt(3));
		
		System.out.printf("\n\n");
		
		System.out.print(palavra.charAt(1));
		System.out.print(palavra.charAt(3));
		System.out.print(palavra.charAt(2));
	}
}