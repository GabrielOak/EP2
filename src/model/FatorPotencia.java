package model;

public class FatorPotencia {

	double fatorPotencia;
	
	public FatorPotencia() {
		
	}
	
	public FatorPotencia(int anguloFaseTensao, int anguloFaseCorrente) {
		fatorPotencia = Math.cos(anguloFaseTensao-anguloFaseCorrente);
	}
	
	public double getFatorPotencia() {
		return fatorPotencia;
	}
}
