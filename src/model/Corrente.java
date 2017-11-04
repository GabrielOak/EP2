package model;

public class Corrente extends Calculo{
	int i;
	
	public Corrente(){

	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	public float calcular(int t, int at){
		return t * at;
	}
	
}
