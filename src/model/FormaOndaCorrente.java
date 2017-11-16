package model;

import java.util.ArrayList;

public class FormaOndaCorrente extends FormaOnda{
	
	Corrente corrente = new Corrente();
	AnguloFaseCorrente anguloCorrente = new AnguloFaseCorrente();
	ArrayList<Double> listaFormaOndaCorrente = new ArrayList<Double>();
	
	public FormaOndaCorrente() {
	}
	
	public ArrayList<Double> calculaFormaOndaCorrente(int valorCorrente, float frequenciaAngular, int anguloFaseCorrente) {
		
		corrente.setCorrente(valorCorrente);
		anguloCorrente.setAnguloFaseCorrente(anguloFaseCorrente);
		
		for (int t =0; t<100; t++) {
			listaFormaOndaCorrente.add(valorCorrente * Math.cos(Math.toRadians(frequenciaAngular * t * anguloFaseCorrente)));
		}
		return listaFormaOndaCorrente;
	}
	
}
