package model;

import java.util.ArrayList;

public class FormaOndaTensao extends FormaOnda{
	
	ArrayList<Double> listaFormaOndaTensao= new ArrayList<Double>();
	Tensao tensao = new Tensao();
	AnguloFaseTensao anguloTensao = new AnguloFaseTensao();
	
	public FormaOndaTensao() {
	
	}
	
	public ArrayList<Double> calculaFormaOndaTensao(int valorTensao, float frequenciaAngular, int anguloTensao) {
		
		for(int t=0; t<100; t++) {
			
			listaFormaOndaTensao.add(valorTensao * Math.cos(Math.toRadians(frequenciaAngular * t * anguloTensao)));
		}
		
		return listaFormaOndaTensao;
	}
	
	public void passarListaTensao(ArrayList<Double> lista) {
		for(int i=0;i<10;i++) {
			lista.add(listaFormaOndaTensao.get(i));
		}
	}
	
	
}
