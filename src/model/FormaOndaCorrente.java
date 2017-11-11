package model;

import java.util.ArrayList;

public class FormaOndaCorrente extends FormaOnda{
	
	Corrente corrente = new Corrente();
	AnguloFaseCorrente anguloCorrente = new AnguloFaseCorrente();
	ArrayList<Double> listaFormaOndaCorrente = new ArrayList<Double>();
	
	public FormaOndaCorrente() {
	}
	
	public void calculaFormaOndaCorrente(int valorCorrente, float frequenciaAngular, int anguloFaseCorrente) {
		
		for (int t =0; t<10; t++) {
			listaFormaOndaCorrente.add(valorCorrente * Math.cos(frequenciaAngular * t * anguloFaseCorrente));
		}
	}
	public void passarListaCorrente(ArrayList<Double> lista) {
		for(int i=0;i<10;i++) {
			lista.add(listaFormaOndaCorrente.get(i));
		}
	}
	
}
