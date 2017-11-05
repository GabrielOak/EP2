package model;

public class PotenciaRelativa extends Potencia{

	double potenciaRelativa;
	
	public PotenciaRelativa() {
		
	}
	
	public PotenciaRelativa(int tensao, int corrente, int anguloFaseTensao, int anguloFaseCorrente) {
		
		potenciaRelativa = tensao * corrente * Math.cos(anguloFaseTensao-anguloFaseCorrente);
	}
	
	public double getPotenciaRelativa() {
		return potenciaRelativa;
	}
	
}
