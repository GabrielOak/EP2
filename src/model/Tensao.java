package model;

public class Tensao extends Calculo{
	int tensao;
	
	public Tensao(){
		
	}
	
	public int getTensao() {
		return tensao;
	}
	
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	public float calcular(int t, int at) {
		return at * t;
	}
	
}
