package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import view.MenuInicial;
import model.*;

public class AcoesInterfacePotenciaFundamental implements ActionListener{

	JFrame mainFrame;
	JTextField txtTensao;
	JTextField txtAnguloTensao;
	JTextField txtCorrente;
	JTextField txtAnguloCorrente;
	JTextField txtPotAtiva;
	JTextField txtPotReativa;
	JTextField txtPotAparente;
	JTextField txtFatorPot;
	Grafico graficoTensao;
	Grafico graficoCorrente;
	Grafico graficoPotInst;
	TrianguloPotencia triangulo;
	
	public AcoesInterfacePotenciaFundamental() {
		
	}
	public AcoesInterfacePotenciaFundamental(JTextField textTensao, JTextField textAnguloTensao, Grafico graficoTensao) {
		this.txtTensao = textTensao;
		this.txtAnguloTensao = textAnguloTensao;
		this.graficoTensao = graficoTensao;
	}
	
	public AcoesInterfacePotenciaFundamental( Grafico graficoCorrente, JTextField textCorrente, JTextField textAnguloCorrente) {
		this.txtCorrente = textCorrente;
		this.txtAnguloCorrente = textAnguloCorrente;
		this.graficoCorrente = graficoCorrente;
	}
	
	public AcoesInterfacePotenciaFundamental(JTextField textTensao,JTextField textCorrente, JTextField textAnguloTensao, JTextField textAnguloCorrente, JTextField textPotAtiva, JTextField textPotReativa, JTextField textPotAparente, JTextField textFatorPot, Grafico graficoPotInst, TrianguloPotencia triangulo) {
		this.txtTensao = textTensao;
		this.txtAnguloTensao = textAnguloTensao;
		this.txtCorrente = textCorrente;
		this.txtAnguloCorrente = textAnguloCorrente;
		this.txtPotAtiva = textPotAtiva;
		this.txtPotReativa = textPotReativa;
		this.txtFatorPot = textFatorPot;
		this.graficoPotInst = graficoPotInst;
		this.triangulo = triangulo;
		this.txtPotAparente = textPotAparente;
	}
	
	public AcoesInterfacePotenciaFundamental(JFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equals("Tensao")) {
			
			FormaOndaTensao ondaTensao = new FormaOndaTensao();
			graficoTensao.setScores(ondaTensao.calculaFormaOndaTensao(Integer.parseInt(txtTensao.getText()), ondaTensao.getFrenquenciaAngular(),Integer.parseInt(txtAnguloTensao.getText())));
		}
		if(command.equals("Corrente")) {
			FormaOndaCorrente ondaCorrente = new FormaOndaCorrente();
			graficoCorrente.setScores(ondaCorrente.calculaFormaOndaCorrente(Integer.parseInt(txtCorrente.getText()), ondaCorrente.getFrenquenciaAngular(), Integer.parseInt(txtAnguloCorrente.getText())));
		}
		if(command.equals("Saidas")) {
			
			PotenciaAtiva potAtiva = new PotenciaAtiva();
			PotenciaReativa potReativa = new PotenciaReativa();
			PotenciaAparente potAparente = new PotenciaAparente();
			FatorPotencia fatPot = new FatorPotencia();
			
			FormaOndaPotenciaInstantanea potInst = new FormaOndaPotenciaInstantanea();
			
			txtPotAtiva.setText(String.valueOf(potAtiva.calcularPotenciaAtiva(Integer.parseInt(txtTensao.getText()), Integer.parseInt(txtCorrente.getText()), Integer.parseInt (txtAnguloTensao.getText()),Integer.parseInt(txtAnguloCorrente.getText()))));
			txtPotReativa.setText(String.valueOf(potReativa.calcularPotenciaReativa(Integer.parseInt(txtTensao.getText()), Integer.parseInt(txtCorrente.getText()), Integer.parseInt (txtAnguloTensao.getText()),Integer.parseInt(txtAnguloCorrente.getText()))));
			txtPotAparente.setText(String.valueOf(potAparente.calcularPotenciaAparente(Integer.parseInt(txtTensao.getText()), Integer.parseInt(txtCorrente.getText()))));
			txtFatorPot.setText(String.valueOf(fatPot.calcularFatorPotencia(Integer.parseInt(txtAnguloTensao.getText()), Integer.parseInt(txtAnguloCorrente.getText()))));
		
			graficoPotInst.setScores(potInst.calculaPotenciaInsatantanea(Integer.parseInt(txtTensao.getText()), Integer.parseInt(txtAnguloTensao.getText()), Integer.parseInt (txtCorrente.getText()),Integer.parseInt(txtAnguloCorrente.getText())));
		}
		if(command.equals("Voltar")) {
			mainFrame.dispose();
			MenuInicial menu = new MenuInicial();
		}
	
		}
	}