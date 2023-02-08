package UERNBet;

public class Aposta {
	private Evento quartasFinal1;
	private Resultado resultado;
	private double ValorApostado;

	public Aposta(Evento quartasFinal1, Resultado resultado, double valorApostado) {
		super();
		this.quartasFinal1 = quartasFinal1;
		ValorApostado = valorApostado;
		this.resultado = resultado;
	}


	public Evento getQuartasFinal1() {
		return quartasFinal1;
	}


	public void setQuartasFinal1(Evento quartasFinal1) {
		this.quartasFinal1 = quartasFinal1;
	}

	public double getValorApostado() {
		return ValorApostado;
	}


	public void setValorApostado(double valorApostado) {
		ValorApostado = valorApostado;
	}

	public Resultado getResultado() {
		return resultado;
	}


	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}


	public double calculaLucro (Evento Evento1) {
		
		double lucro = 0; 
		
		if (this.getResultado() == Evento1.getResultado()) {
		 
			if (this.getResultado() == Evento1.getResultado()) 
				lucro = ValorApostado * Evento1.getTIME1VICTORY();
	
			else if (resultado == Resultado.TIME2)
				lucro = ValorApostado * Evento1.getTIME2VICTORY();
		
			else
				lucro = ValorApostado * Evento1.getEMPATE(); 
		

		}return lucro; 	
	
}
}