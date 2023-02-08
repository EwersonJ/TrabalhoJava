package Adicionais;

public class Bola {
	
	private ParOrdenado posicaoBola;
	private ParOrdenado velocidade;
	private final double raio;
	
	public Bola (int posicaox, int posicaoy, int velocidadeh, int velocidadev, double thunder) {
		
	this.setPosicaoBola(new ParOrdenado (posicaox, posicaoy));
	this.setVelocidade(new ParOrdenado (velocidadeh, velocidadev));
	this.raio = thunder;
	}

public ParOrdenado getPosicaoBola() {
	return posicaoBola;
}

public void setPosicaoBola(ParOrdenado posicaoBola) {
	this.posicaoBola = posicaoBola;
}

public ParOrdenado getVelocidade() {
	return velocidade;
}

public void setVelocidade(ParOrdenado velocidade) {
	this.velocidade = velocidade;
}

public double getRaio() {
	return raio;
}

public String toString() {
	return "A bola está na posição:" + posicaoBola.toString() + "se movendo a uma velocidade de" + velocidade + "pixels por movimento";
	
}

public void movimenta() {

}

public void setvelocidadev(int i) {
	// TODO Auto-generated method stub
	
}

public void setVelocidadeh(int i) {
	// TODO Auto-generated method stub
	
}


	
}


