package model;

public class main {

	public static void main(String[] args) {
		
		Corrente corrente = new Corrente();
		Tensao tensao = new Tensao();
		AnguloFaseCorrente anguloCorrente= new AnguloFaseCorrente();
		AnguloFaseTensao anguloTensao = new AnguloFaseTensao();
		
		corrente.setCorrente(39);
		tensao.setTensao(220);
		anguloCorrente.setAnguloFaseCorrente(35);
		anguloTensao.setAnguloFaseTensao(0);
		
		
		PotenciaAtiva potenciaAtiva = new PotenciaAtiva(tensao.getTensao(), corrente.getCorrente(), anguloTensao.getAnguloFaseTensao(), anguloCorrente.getAnguloFaseCorrente());
		PotenciaRelativa potenciaReativa = new PotenciaRelativa(tensao.getTensao(), corrente.getCorrente(), anguloTensao.getAnguloFaseTensao(), anguloCorrente.getAnguloFaseCorrente());
		FatorPotencia fatorPotencia = new FatorPotencia(anguloTensao.getAnguloFaseTensao(), anguloCorrente.getAnguloFaseCorrente());
		
		System.out.println(potenciaAtiva.getPotenciaAtiva());
		System.out.println(potenciaReativa.getPotenciaRelativa());
		System.out.println(fatorPotencia.getFatorPotencia());
		
	}

}
