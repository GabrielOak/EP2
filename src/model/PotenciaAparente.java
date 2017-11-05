package model;

public class PotenciaAparente {
	float potenciaAparente;
	
	public PotenciaAparente() {
		
	}
	
	public PotenciaAparente(int tensao, int corrente) {
		
		potenciaAparente = tensao * corrente;
	}
	
	public float getPotenciaAparente() {
		return potenciaAparente;
	}
}
