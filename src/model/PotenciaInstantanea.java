package model;

public class PotenciaInstantanea extends Calculo{
	
	float potenciaInstantanea;
	
	public PotenciaInstantanea(){
		Corrente corrente = new Corrente();
		Tensao tensao = new Tensao();
		
		potenciaInstantanea = corrente.getCorrente() * tensao.getTensao();
	}
	
	public float getP() {
		return potenciaInstantanea;
	}
	
	public float calcular(int t, int at) {
		return t*at;
	}
}
