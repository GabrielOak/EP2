package view;

import controller.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfacePotenciaFundamental {
	JFrame mainFrame;
	
	JPanel painelTensao;
	JPanel painelCorrente;
	JPanel painelSaidas;
	JPanel trianguloPot;
	JPanel painelGrafico;
	
	JLabel labelTensao;
	JLabel labelCorrente;
	JLabel labelAngTensao;
	JLabel labelAngCorrente;
	JLabel labelPotInst;
	JLabel labelPotAtiva;
	JLabel labelPotReativa;
	JLabel labelPotAparente;
	JLabel labelFatorPot;
	
	JTextField textTensao;
	JTextField textCorrente;
	JTextField textAnguloTensao;
	JTextField textAnguloCorrente;
	JTextField textPotAtiva;
	JTextField textPotReativa;
	JTextField textPotAparente;
	JTextField textFatorPot;
	
	Grafico graficoTensao;
	Grafico graficoCorrente;
	Grafico graficoPotInst;
	
	
	public InterfacePotenciaFundamental(){
		preparaInterface();
	}
	
	private void preparaInterface() {
		
		mainFrame = new JFrame("Fluxo de Potência Fundamenta");
		mainFrame.setSize(1045, 700);
		mainFrame.setLocation(0,0);
		mainFrame.setLayout(null);
		mainFrame.setResizable(false);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		
		painelTensao = new JPanel(null);
		painelTensao.setBounds(630, 15, 400 ,160);
		painelTensao.setBorder(BorderFactory.createTitledBorder("Tensão"));
		
		painelCorrente = new JPanel(null);
		painelCorrente.setBounds(630, 185, 400, 160);
		painelCorrente.setBorder(BorderFactory.createTitledBorder("Corrente"));
		
		painelSaidas = new JPanel(null);
		painelSaidas.setBounds(15, 525, 600, 160);
		painelSaidas.setBorder(BorderFactory.createTitledBorder("Saídas"));
		
		trianguloPot = new JPanel(null);
		trianguloPot.setBounds(630, 355, 400, 330);
		trianguloPot.setBorder(BorderFactory.createTitledBorder("Triângulo de Potências"));
		
		painelGrafico = new JPanel(null);
		painelGrafico.setBounds(15, 15, 600, 500);
		painelGrafico.setBorder(BorderFactory.createTitledBorder("Gráficos"));
		
		mainFrame.add(painelTensao);
		mainFrame.add(painelCorrente);
		mainFrame.add(painelGrafico);
		mainFrame.add(painelSaidas);
		mainFrame.add(trianguloPot);
		
		preparaPainel();
		
		mainFrame.setVisible(true);
		
	}
	
	private void preparaPainel() {
		
		//Tensão
		labelTensao = new JLabel("Tensão:");
		labelAngTensao = new JLabel("Angulo Fase:");
		textTensao = new JTextField("0");
		textAnguloTensao = new JTextField("0");
		JButton okTensao = new JButton("OK");
		
		labelTensao.setBounds(15, 30, 100, 20);
		labelAngTensao.setBounds(15, 65, 100, 20);
		textTensao.setBounds(120, 30, 100, 20);
		textAnguloTensao.setBounds(120, 65, 100, 20);
		okTensao.setBounds(315, 115, 70, 30);
		
		painelTensao.add(labelTensao);
		painelTensao.add(labelAngTensao);
		painelTensao.add(textTensao);
		painelTensao.add(textAnguloTensao);
		painelTensao.add(okTensao);
		
		
		//Corrente
		labelCorrente = new JLabel("Corrente:");
		labelAngCorrente = new JLabel("Angulo Fase:");
		textCorrente = new JTextField("0");
		textAnguloCorrente = new JTextField("0");
		JButton okCorrente = new JButton("OK");
		
		
		labelCorrente.setBounds(15, 30, 100, 20);
		labelAngCorrente.setBounds(15, 65, 100, 20);
		textCorrente.setBounds(120, 30, 100, 20);
		textAnguloCorrente.setBounds(120, 65, 100, 20);
		okCorrente.setBounds(315, 115, 70, 30);
		
		painelCorrente.add(labelCorrente);
		painelCorrente.add(labelAngCorrente);
		painelCorrente.add(textCorrente);
		painelCorrente.add(textAnguloCorrente);
		painelCorrente.add(okCorrente);
		
		//Saídas
		labelPotAtiva = new JLabel("Potência Ativa:");
		labelPotReativa = new JLabel("Potência Reativa:");
		labelPotAparente = new JLabel("Potência Aparente:");
		labelFatorPot = new JLabel("Fator de Potência:");
		textPotAtiva = new JTextField("0");
		textPotReativa = new JTextField("0");
		textPotAparente = new JTextField("0");
		textFatorPot = new JTextField("0");
		
		labelPotAtiva.setBounds(15, 20, 150, 20);
		labelPotReativa.setBounds(15, 55, 150, 20);
		labelPotAparente.setBounds(300, 20, 150, 20);
		labelFatorPot.setBounds(300, 55, 150, 20);
		textPotAtiva.setBounds(165, 20, 100, 20);
		textPotReativa.setBounds(165, 55, 100, 20);
		textPotAparente.setBounds(460, 20, 100, 20);
		textFatorPot.setBounds(460, 55, 100, 20);
		
		painelSaidas.add(labelPotAtiva);
		painelSaidas.add(labelPotReativa);
		painelSaidas.add(textPotAtiva);
		painelSaidas.add(textPotReativa);
		painelSaidas.add(labelPotAparente);
		painelSaidas.add(labelFatorPot);
		painelSaidas.add(textPotAparente);
		painelSaidas.add(textFatorPot);
		
		//Gráficos
		ArrayList<Double> listaGraficoTensao = new ArrayList<>();
		ArrayList<Double> lista2 = new ArrayList<>();
		ArrayList<Double> lista = new ArrayList<>();
		
		graficoTensao = new Grafico(listaGraficoTensao, false);
		graficoCorrente = new Grafico(lista, false);
		graficoPotInst = new Grafico(lista2, true);
		
		graficoTensao.setBounds(15, 25, 550, 160);
		graficoCorrente.setBounds(15, 180, 550, 160);
		graficoPotInst.setBounds(15, 350, 550, 160);
		
		painelGrafico.add(graficoTensao);
		painelGrafico.add(graficoCorrente);
		painelGrafico.add(graficoPotInst);
		
		//Triângulo de Potência
		 TrianguloPotencia triangulo = new TrianguloPotencia(-2,0);
	     triangulo.setBounds(60,35,280,280);
	     
	     trianguloPot.add(triangulo);
	     
	     JButton okSaidas = new JButton("Ok");
	     okSaidas.setBounds(500, 110, 70, 30);
	     painelSaidas.add(okSaidas);
	     
	     JButton voltaMenu = new JButton("Voltar");
	     voltaMenu.setBounds(300, 15, 80, 30);
	     painelTensao.add(voltaMenu);
	     
	     voltaMenu.setActionCommand("Voltar");
	     voltaMenu.addActionListener(new AcoesInterfacePotenciaFundamental(mainFrame));
	     
	     okCorrente.setActionCommand("Corrente");
	     okCorrente.addActionListener(new AcoesInterfacePotenciaFundamental(graficoCorrente, textCorrente, textAnguloCorrente));
	     
	     okTensao.setActionCommand("Tensao");
	     okTensao.addActionListener(new AcoesInterfacePotenciaFundamental(textTensao, textAnguloTensao, graficoTensao));
	     
	     okSaidas.setActionCommand("Saidas");
	     okSaidas.addActionListener(new AcoesInterfacePotenciaFundamental(textTensao, textCorrente, textAnguloTensao, textAnguloCorrente, textPotAtiva, textPotReativa, textPotAparente, textFatorPot,  graficoPotInst, triangulo));
	}
	
	public static void main(String[] args) {
	InterfacePotenciaFundamental interfacea = new InterfacePotenciaFundamental();
	}
}
	
