package model;

import java.util.ArrayList;

public class FormaOndaFundamental extends FormaOnda{
	
	Tensao tensao = new Tensao();
	AnguloFaseTensao anguloTensao = new AnguloFaseTensao();
	ArrayList<Double> listaFormaOndaFundamental = new ArrayList<Double>();
	
	public FormaOndaFundamental(){
		
	}
	
	public void calculaOndaFundamental(int valorTensao, int anguloTensao, float frequenciaAngular) {
		
		for(int t=0; t<10; t++) {
			listaFormaOndaFundamental.add(valorTensao * Math.cos(Math.toRadians(frequenciaAngular * t * anguloTensao)));
		}
	}
	public void passarListaOndaFundamental(ArrayList<Double> lista) {
		for(int i=0;i<10;i++) {
			lista.add(listaFormaOndaFundamental.get(i));
		}
	}
	
	
	
}
