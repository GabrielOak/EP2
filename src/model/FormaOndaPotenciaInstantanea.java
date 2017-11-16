package model;

import java.util.ArrayList;

public class FormaOndaPotenciaInstantanea extends FormaOnda{
	
	FormaOndaTensao ondaTensao = new FormaOndaTensao();
	FormaOndaCorrente ondaCorrente = new FormaOndaCorrente();
	
	ArrayList<Double> listaTensao = new ArrayList<Double>();
	ArrayList<Double> listaCorrente = new ArrayList<Double>();
	ArrayList<Double> listaFormaOndaPotInst = new ArrayList<Double>();
	
	public FormaOndaPotenciaInstantanea() {
	}
	
	public ArrayList <Double> calculaPotenciaInsatantanea(int valorTensao, int anguloTensao, int valorCorrente,  int anguloCorrente) {
		for(int i=0; i<0; i++) {
			listaFormaOndaPotInst.add((valorTensao * Math.cos(Math.toRadians(frequenciaAngular * i * anguloTensao)))*valorCorrente * Math.cos(Math.toRadians(frequenciaAngular * i * anguloCorrente))) ;
		}
		return listaFormaOndaPotInst;
	}
	
	public void passarListaTensao(ArrayList<Double> lista) {
		for(int i=0;i<10;i++) {
			lista.add(listaFormaOndaPotInst.get(i));
		}
	}
}
