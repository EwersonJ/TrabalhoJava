package Adicionais;

import java.util.Scanner;
import java.util.Random;
public class TesteCampo2 {

	public static void main (String[]args) {
		
		ParOrdenado PosCamp = new ParOrdenado(0,0);
		ParOrdenado Comprimento = new ParOrdenado(0,0);
		double raio;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Qual a largura do campo?");
		Comprimento.setX(entrada.nextInt());
		
		System.out.println("Qual a altura do campo?");
		Comprimento.setY(entrada.nextInt());
		
		System.out.println("Qual o raio do campo?");
		raio = entrada.nextDouble();
		
		Random aleatorio = new Random();
		
		double randomX = 5 + (int) (5 *Math.random());
		double PercentualX = (randomX / 100);
		
		double randomY = 5 + (int) (5 *Math.random());
		double PercentualY = (randomY / 100);
		
		
		Double velox = (PercentualX * PosCamp.getX());
		Double veloy = (PercentualY * PosCamp.getX());
		
		int Velocidadeh = velox.intValue();
		int velocidadev = veloy.intValue();
		
		Bola ball = new Bola (PosCamp.getX(), PosCamp.getY(), PosCamp.getX(), PosCamp.getY(), raio);
		
		CampoRetangular campo = new CampoRetangular (PosCamp, Comprimento.getX(), Comprimento.getY(), ball);
		
		
		for (int i = 0; i < 30; i++) {
			TesteCampo.MovimentoBall(campo, ball);
			
		}
		
		
	}
}
