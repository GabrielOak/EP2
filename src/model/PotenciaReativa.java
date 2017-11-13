package model;

public class PotenciaReativa extends Potencia{

	double potenciaReativa = 0;
	
	public PotenciaReativa() {
		
	}
	
	public PotenciaReativa(int tensao, int corrente, int anguloFaseTensao, int anguloFaseCorrente) {
		
		potenciaReativa = (float) tensao * corrente * (Math.sin(Math.toRadians(anguloFaseTensao-anguloFaseCorrente)));
	}
	
	public double getPotenciaReativa() {
		return potenciaReativa;
	}
	
}
