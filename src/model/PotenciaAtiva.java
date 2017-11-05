package model;

public class PotenciaAtiva extends Potencia{
	double potenciaAtiva;
	
	public PotenciaAtiva(){
		
	}
	
	public PotenciaAtiva(int tensao, int corrente, int anguloFaseTensao, int anguloFaseCorrente) {
		
		potenciaAtiva = (corrente * tensao) * Math.cos(anguloFaseCorrente-anguloFaseCorrente);
	}
	
	public double getPotenciaAtiva() {
		return potenciaAtiva;
	}
	
}
