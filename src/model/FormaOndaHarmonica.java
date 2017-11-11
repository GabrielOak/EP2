package model;

import java.util.ArrayList;

public class FormaOndaHarmonica {
	
	int numHarmonicos;
	Tensao tensao = new Tensao();
	AnguloFaseHarmonico anguloHarmonica = new AnguloFaseHarmonico();
	ArrayList<Double> listaFormaOndaHarmonica = new ArrayList<Double>();
	
	public FormaOndaHarmonica() {
		
	}
	
	public void calculaOndaHarmonica(int valorTensao, int numHarmonicos, float frequenciaAngular, int anguloFaseHarmonico) {
		for (int t=0; t<10; t++) {
			listaFormaOndaHarmonica.add(valorTensao * Math.cos(Math.toRadians((numHarmonicos * frequenciaAngular * t) + anguloFaseHarmonico)));
		}
	}
	public void passarListaOndaHarmonica(ArrayList<Double> lista) {
		for(int i=0;i<10;i++) {
			lista.add(listaFormaOndaHarmonica.get(i));
		}
	}

}
