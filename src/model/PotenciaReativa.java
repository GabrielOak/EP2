package model;

public class PotenciaReativa extends Potencia{

	double potenciaReativa = 0;
	
	public PotenciaReativa() {
		
	}
	
	public double calcularPotenciaReativa(int tensao, int corrente, int anguloFaseTensao, int anguloFaseCorrente) {
		
		potenciaReativa =  tensao * corrente * Math.sin(Math.toRadians(anguloFaseTensao-anguloFaseCorrente));
		
		return potenciaReativa;
	}
	
	public double getPotenciaReativa() {
		return potenciaReativa;
	}
	
}
