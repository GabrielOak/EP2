package model;

import java.util.ArrayList;

public class FormaOndaPotenciaInstantanea extends FormaOnda{
	
	FormaOndaTensao ondaTensao = new FormaOndaTensao();
	FormaOndaCorrente ondaCorrente = new FormaOndaCorrente();
	
	ArrayList<Double> listaTensao = new ArrayList<Double>();
	ArrayList<Double> listaCorrente = new ArrayList<Double>();
	ArrayList<Double> listaFormaOndaPotInst = new ArrayList<Double>();
	
	public FormaOndaPotenciaInstantanea() {
		ondaTensao.passarListaTensao(listaTensao);
		ondaCorrente.passarListaCorrente(listaCorrente);
	}
	
	public void calculaPotenciaInsatantanea() {
		for(int i=0; i<0; i++) {
			listaFormaOndaPotInst.add(listaTensao.get(i)*listaCorrente.get(i));
		}
	}
	
	public void passarListaTensao(ArrayList<Double> lista) {
		for(int i=0;i<10;i++) {
			lista.add(listaFormaOndaPotInst.get(i));
		}
	}
}
