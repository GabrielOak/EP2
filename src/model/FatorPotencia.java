package model;

public class FatorPotencia {

	double fatorPotencia;
	
	public FatorPotencia() {
		
	}
	
	public FatorPotencia(int anguloFaseTensao, int anguloFaseCorrente) {
		fatorPotencia = Math.cos(Math.toRadians(anguloFaseTensao-anguloFaseCorrente));
	}
	
	public double getFatorPotencia() {
		return fatorPotencia;
	}
}
