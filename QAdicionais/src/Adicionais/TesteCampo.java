package Adicionais;

import java.util.Scanner;

public class TesteCampo {
	
	public static void MovimentoBall(CampoRetangular campo, Bola ball) {
		campo.movimentoBola();
		System.out.println(ball.toString());
	}
	public static void main (String[]args) {
		
		ParOrdenado PosCamp = new ParOrdenado(0,0);
		ParOrdenado PosBall = new ParOrdenado (0,0);
		ParOrdenado velocidadedaBola = new ParOrdenado(0,0);
		double raio = 0;
		ParOrdenado Comprimento = new ParOrdenado (0,0);
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println ("Qual a posição do eixo X no campo?");
		PosCamp.setX(entrada.nextInt());
		System.out.println ("Qual a posição do eixo Y no campo?");
		PosCamp.setX(entrada.nextInt());
		
		System.out.println("Qual a largura do campo?");
		Comprimento.setX(entrada.nextInt());
		
		System.out.println("Qual a altura do campo?");
		Comprimento.setY(entrada.nextInt());
		
		System.out.println("Em qual posição do eixo X bola está?");
		PosBall.setX(entrada.nextInt());
		System.out.println("Em qual posição do eixo Y a bola está");
		
		System.out.println("Qual a velocidade horizontal da bola?");
		velocidadedaBola.setX(entrada.nextInt());
		System.out.println("Qual a velocidade vertical da bola?");
		velocidadedaBola.setY(entrada.nextInt());
		
		Bola ball = new Bola (PosCamp.getX(), PosCamp.getY(), velocidadedaBola.getX(), velocidadedaBola.getY(), raio);

		CampoRetangular campo = new CampoRetangular (PosCamp, Comprimento.getX(), Comprimento.getY(), ball);
		
		for (int i = 0; i<30; i++) {
			MovimentoBall(campo, ball);
			
		System.out.println("A posição inicial em que a bola está é:" + ball.toString());
		}
			
		}
	}
