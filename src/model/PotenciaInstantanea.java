package model;

public class PotenciaInstantanea extends Calculo{
	
	float p;
	
	public PotenciaInstantanea(int t, int v){
		p = v * t;
	}
	
	public float getP() {
		return p;
	}
	
	public float calcular(int t, int at) {
		return t*at;
	}
}
