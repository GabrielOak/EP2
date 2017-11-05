package model;

abstract class Potencia {
	
	Tensao tensao = new Tensao();
	Corrente corrente = new Corrente();
	AnguloFaseTensao anguloTensao = new AnguloFaseTensao();
	AnguloFaseCorrente anguloCorrente = new AnguloFaseCorrente();
	
	public Potencia() {
		
	}
	
}
