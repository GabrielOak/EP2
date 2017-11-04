package model;

public class Tensao extends Calculo{
	int v;
	
	public Tensao(){
		
	}
	
	public int getV() {
		return v;
	}
	
	public void setV(int v) {
		this.v = v;
	}
	
	public float calcular(int t, int at) {
		return at * t;
	}
	
}
