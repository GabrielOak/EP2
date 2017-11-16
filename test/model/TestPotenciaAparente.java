package model;

import model.PotenciaAparente;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestPotenciaAparente {

	
	@Test
	public void test() {
		int tensao = 220;
		int corrente = 39;
		
		PotenciaAparente potAparente = new PotenciaAparente();
		
		assertEquals(8580, potAparente.calcularPotenciaAparente(tensao, corrente), 10e-5);
	}

}
