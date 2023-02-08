package UERNBet;

public class Evento {
	
	private String FaseDaCompeticao, TIME1, TIME2;
	private double TIME1VICTORY, EMPATE, TIME2VICTORY;
	private Resultado resultado;
	
	
	public Evento(String faseDaCompeticao, String tIME1, String tIME2, double tIME1VICTORY, double eMPATE,
			double tIME2VICTORY) {
		super();
		FaseDaCompeticao = faseDaCompeticao;
		TIME1 = tIME1;
		TIME2 = tIME2;
		TIME1VICTORY = tIME1VICTORY;
		EMPATE = eMPATE;
		TIME2VICTORY = tIME2VICTORY;
	
	}


	public String getFaseDaCompeticao() {
		return FaseDaCompeticao;
	}


	public void setFaseDaCompeticao(String faseDaCompeticao) {
		FaseDaCompeticao = faseDaCompeticao;
	}


	public String getTIME1() {
		return TIME1;
	}


	public void setTIME1(String tIME1) {
		TIME1 = tIME1;
	}


	public String getTIME2() {
		return TIME2;
	}


	public void setTIME2(String tIME2) {
		TIME2 = tIME2;
	}


	public double getTIME1VICTORY() {
		return TIME1VICTORY;
	}


	public void setTIME1VICTORY(double tIME1VICTORY) {
		TIME1VICTORY = tIME1VICTORY;
	}


	public double getEMPATE() {
		return EMPATE;
	}


	public void setEMPATE(double eMPATE) {
		EMPATE = eMPATE;
	}


	public double getTIME2VICTORY() {
		return TIME2VICTORY;
	}


	public void setTIME2VICTORY(double tIME2VICTORY) {
		TIME2VICTORY = tIME2VICTORY;
	}


	public Resultado getResultado() {
		return resultado;
	}


	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	
	  

	 
	 
	 
}