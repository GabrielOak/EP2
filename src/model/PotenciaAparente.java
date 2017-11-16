package model;

public class PotenciaAparente {
	float potenciaAparente;
	
	public PotenciaAparente() {
		
	}
	
	public float calcularPotenciaAparente(int tensao, int corrente) {
		
		potenciaAparente = tensao * corrente;
		
		return potenciaAparente;
	}
	
	public float getPotenciaAparente() {
		return potenciaAparente;
	}
}
