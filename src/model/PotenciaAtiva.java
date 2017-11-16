package model;

public class PotenciaAtiva extends Potencia{
	
	double potenciaAtiva = 0;
	
	public PotenciaAtiva(){
		
	}
	
	public double calcularPotenciaAtiva(int tensao, int corrente, int anguloFaseTensao, int anguloFaseCorrente) {
		
		potenciaAtiva =  corrente * tensao * (Math.cos(Math.toRadians(anguloFaseTensao-anguloFaseCorrente)));
		
		return potenciaAtiva;
	}
	
	public double getPotenciaAtiva() {
		return potenciaAtiva;
	}
	
}
