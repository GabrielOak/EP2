package model;

public class Corrente extends Calculo{
	int corrente;
	
	public Corrente(){

	}
	
	public int getCorrente() {
		return corrente;
	}
	public void setCorrente(int corrente) {
		this.corrente = corrente;
	}
	
	public float calcular(int t, int at){
		return t * at;
	}
	
}
