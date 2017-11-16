package model;

public class FatorPotencia {

	double fatorPotencia;
	
	public FatorPotencia() {
		
	}
	
	public double calcularFatorPotencia(int anguloFaseTensao, int anguloFaseCorrente) {
		fatorPotencia = Math.cos(Math.toRadians(anguloFaseTensao-anguloFaseCorrente));
		
		return fatorPotencia;
	}
	
	public String estadoFatorPotencia(int anguloTensao, int anguloCorrente) {
		
		fatorPotencia = anguloTensao - anguloCorrente;
		
		if(fatorPotencia == 0) {
			return "1";
		}else if(fatorPotencia <0) {
			return "Adiantado";
		}else {
			return "Atrasado" ;
		}
	}
	
	public double getFatorPotencia() {
		return fatorPotencia;
	}
}
