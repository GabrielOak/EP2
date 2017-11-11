package model;

public class PotenciaAtiva extends Potencia{
	
	double potenciaAtiva = 0;
	
	public PotenciaAtiva(){
		
	}
	
	public PotenciaAtiva(int tensao, int corrente, int anguloFaseTensao, int anguloFaseCorrente) {
		
		potenciaAtiva = (float) corrente * tensao * (Math.cos(Math.toRadians(anguloFaseTensao-anguloFaseCorrente)));
	}
	
	public double getPotenciaAtiva() {
		return potenciaAtiva;
	}
	
}
