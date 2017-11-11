package model;

public class PotenciaRelativa extends Potencia{

	double potenciaRelativa = 0;
	
	public PotenciaRelativa() {
		
	}
	
	public PotenciaRelativa(int tensao, int corrente, int anguloFaseTensao, int anguloFaseCorrente) {
		
		potenciaRelativa = (float) tensao * corrente * (Math.sin(Math.toRadians(anguloFaseTensao-anguloFaseCorrente)));
	}
	
	public double getPotenciaRelativa() {
		return potenciaRelativa;
	}
	
}
