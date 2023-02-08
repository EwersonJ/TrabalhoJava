package Adicionais;

public class CampoRetangular {
	
	private ParOrdenado Sup;
	private int Comprimento;
	private int Altura;
	private Bola ball;
	
	public CampoRetangular (ParOrdenado SupEsquerdo, int Comprimento, int altura, Bola ball) {
		this.setSup(SupEsquerdo);
		this.setComprimento(Comprimento);
		this.setAltura(Altura);
		this.setball(ball);
		
		
		
	}

	public ParOrdenado getSup() {
		return Sup;
	}

	public void setSup(ParOrdenado sup) {
		Sup = sup;
	}

	public int getComprimento() {
		return Comprimento;
	}

	public void setComprimento(int comprimento) {
		Comprimento = comprimento;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}

	public Bola getBall() {
		return ball;
	}

	public void setball(Bola ball) {
		this.ball = ball;
	}
	
	public boolean bolaTocaBordaSuperior () {
		
		if (ball.getPosicaoBola().getY() <= Sup.getY()) {
			return true;
	}	
		else
			return false;
		}
	

	public boolean bolaTocaBordaInferior () {
		
		if (ball.getPosicaoBola().getY() >= Altura) {
			return true;
		}
		else
			return false;
	}
	
	public boolean bolaTocaLateralDireita () {
		if (ball.getPosicaoBola().getX() >= Comprimento) {
			return true;
		}
			return false;
	}
	
	public boolean bolaTocaLateralEsquerda (){
		if (ball.getPosicaoBola().getX() <= Comprimento) {
			return true;
		}
			return false;	
	}
	
	public void movimentoBola() {
		ball.movimenta();
		
		if (bolaTocaBordaSuperior()) {
			ball.setvelocidadev(ball.getVelocidade().getY() *-1);
		}

		else if (bolaTocaBordaInferior()) {
			ball.setvelocidadev(ball.getVelocidade().getY() *-1);
		}
		else if (bolaTocaLateralDireita()) {
			ball.setVelocidadeh(ball.getVelocidade().getX() *-1);
		}
		else if (bolaTocaLateralEsquerda()) {
			ball.setVelocidadeh(ball.getVelocidade().getX() *-1);
			
			
		}
		
	}
}

