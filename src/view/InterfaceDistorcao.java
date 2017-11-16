package view;

import controller.Grafico;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfaceDistorcao {
	
	JFrame menuInicial;
	JPanel painelComponente;
	JPanel painelDist;
	JPanel painelSaida;
	
	
	public InterfaceDistorcao() {
		
		preparaInterface();
	}
	
	private void preparaInterface() {
		
		menuInicial = new JFrame("Distorção Harmômica");
		menuInicial.setSize(1300, 700);
		menuInicial.setLayout(null);
		menuInicial.setLocation(0,0);
		

		menuInicial.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		painelComponente = new JPanel(null);
		painelComponente.setBounds(860, 15, 430, 260);
		painelComponente.setBorder(BorderFactory.createTitledBorder("Componente Fundamental"));
		
		painelDist = new JPanel(null);
		painelDist.setBounds(10,15,850,665);
		painelDist.setBorder(BorderFactory.createTitledBorder("Harmônicas"));
		
		painelSaida = new JPanel(null);
		painelSaida.setBounds(860, 285, 430, 395);
		painelSaida.setBorder(BorderFactory.createTitledBorder("Saídas"));
		
		menuInicial.add(painelComponente);
		menuInicial.add(painelDist);
		menuInicial.add(painelSaida);
		
		preparaPainel();
		
		menuInicial.setVisible(true);
	}
	
	private void preparaPainel() {
		
		
		//Harmônico 
		
		//Labels 
		JLabel labelNumHarm = new JLabel("Número de Harmônicos:");
		labelNumHarm.setBounds(15, 25, 200, 20);
		
		JLabel labelAmplitude = new JLabel("Amplitude:");
		JLabel labelAngulo = new JLabel("Ângulo:");
		JLabel labelOrdem = new JLabel("Ordem:");
		
		labelAmplitude.setBounds(15, 68, 150, 20);
		labelAngulo.setBounds(150, 68, 150, 20);
		labelOrdem.setBounds(285, 68, 54, 20);
		
		JLabel labelAmplitude2 = new JLabel("Amplitude:");
		JLabel labelAngulo2 = new JLabel("Ângulo:");
		JLabel labelOrdem2 = new JLabel("Ordem:");
		
		labelAmplitude2.setBounds(15, 263, 150, 20);
		labelAngulo2.setBounds(150, 263, 150, 20);
		labelOrdem2.setBounds(285, 263, 54, 20);
		
		JLabel labelAmplitude3 = new JLabel("Amplitude:");
		JLabel labelAngulo3 = new JLabel("Ângulo:");
		JLabel labelOrdem3 = new JLabel("Ordem:");
		
		labelAmplitude3.setBounds(15, 448, 150, 20);
		labelAngulo3.setBounds(150, 448, 150, 20);
		labelOrdem3.setBounds(285, 448, 54, 20);
		
		JLabel labelAmplitude4 = new JLabel("Amplitude:");
		JLabel labelAngulo4 = new JLabel("Ângulo:");
		JLabel labelOrdem4 = new JLabel("Ordem:");
		
		labelAmplitude4.setBounds(455, 68, 150, 20);
		labelAngulo4.setBounds(590, 68, 150, 20);
		labelOrdem4.setBounds(725, 68, 54, 20);
		
		JLabel labelAmplitude5 = new JLabel("Amplitude:");
		JLabel labelAngulo5 = new JLabel("Ângulo:");
		JLabel labelOrdem5 = new JLabel("Ordem:");
		
		labelAmplitude5.setBounds(455, 263, 150, 20);
		labelAngulo5.setBounds(590, 263, 150, 20);
		labelOrdem5.setBounds(725, 263, 54, 20);
		
		JLabel labelAmplitude6 = new JLabel("Amplitude:");
		JLabel labelAngulo6 = new JLabel("Ângulo:");
		JLabel labelOrdem6 = new JLabel("Ordem:");
		
		labelAmplitude6.setBounds(455, 450, 150, 20);
		labelAngulo6.setBounds(590, 450, 150, 20);
		labelOrdem6.setBounds(725, 450, 54, 20);
		
		//JComboBoxs
		JComboBox boxNumHarm = new JComboBox();
		JComboBox boxOrdem = new JComboBox();
		JComboBox boxOrdem2 = new JComboBox();
		JComboBox boxOrdem3 = new JComboBox();
		JComboBox boxOrdem4 = new JComboBox();
		JComboBox boxOrdem5 = new JComboBox();
		JComboBox boxOrdem6 = new JComboBox();
		
		for(int i=0; i<=6; i++) {
			boxNumHarm.addItem(i);
		}
		
		for(int i=0; i<=15; i++ ) {
			
			boxOrdem.addItem(i);
			boxOrdem2.addItem(i);
			boxOrdem3.addItem(i);
			boxOrdem4.addItem(i);
			boxOrdem5.addItem(i);
			boxOrdem6.addItem(i);
		}
		boxNumHarm.setBounds(195, 25, 50, 20);
		boxOrdem.setBounds(345, 70, 50, 20);
		boxOrdem2.setBounds(345, 265, 50, 20);
		boxOrdem3.setBounds(345, 450, 50, 20);
		boxOrdem4.setBounds(785, 70, 50, 20);
		boxOrdem5.setBounds(785, 265, 50, 20);
		boxOrdem6.setBounds(785, 450, 50, 20);


		JComboBox boxAngulo = new JComboBox();
		JComboBox boxAngulo2 = new JComboBox();
		JComboBox boxAngulo3 = new JComboBox();
		JComboBox boxAngulo4 = new JComboBox();
		JComboBox boxAngulo5 = new JComboBox();
		JComboBox boxAngulo6 = new JComboBox();
		
		for(int i=-180; i<=180; i++) {
			
			boxAngulo.addItem(i);
			boxAngulo2.addItem(i);
			boxAngulo3.addItem(i);
			boxAngulo4.addItem(i);
			boxAngulo5.addItem(i);
			boxAngulo6.addItem(i);
		}
		
		boxAngulo.setBounds(210, 70, 54, 20);
		boxAngulo2.setBounds(210, 265, 54, 20);
		boxAngulo3.setBounds(210, 450, 54, 20);
		boxAngulo4.setBounds(650, 70, 54, 20);
		boxAngulo5.setBounds(650, 265, 54, 20);
		boxAngulo6.setBounds(650, 450, 54, 20);
		
		boxAngulo.setSelectedItem(0);
		boxAngulo2.setSelectedItem(0);
		boxAngulo3.setSelectedItem(0);
		boxAngulo4.setSelectedItem(0);
		boxAngulo5.setSelectedItem(0);
		boxAngulo6.setSelectedItem(0);
		
		//JTextFields
		JTextField txtAmplitude = new JTextField();
		JTextField txtAmplitude2 = new JTextField();
		JTextField txtAmplitude3 = new JTextField();
		JTextField txtAmplitude4 = new JTextField();
		JTextField txtAmplitude5 = new JTextField();
		JTextField txtAmplitude6 = new JTextField();
		
		txtAmplitude.setBounds(95, 70, 45, 22);
		txtAmplitude2.setBounds(95, 265, 45, 22);
		txtAmplitude3.setBounds(95, 450, 45, 22);
		txtAmplitude4.setBounds(535, 70, 45, 22);
		txtAmplitude5.setBounds(535, 265, 45, 22);
		txtAmplitude6.setBounds(535, 450, 45, 22);
		
		
		//Gráficos
		ArrayList<Double> lista = new ArrayList<>();
		ArrayList<Double> lista2 = new ArrayList<>();
		ArrayList<Double> lista3 = new ArrayList<>();
		ArrayList<Double> lista4 = new ArrayList<>();
		ArrayList<Double> lista5 = new ArrayList<>();
		ArrayList<Double> lista6 = new ArrayList<>();
	
		
		Grafico grafico = new Grafico(lista, false);
		Grafico grafico2 = new Grafico(lista2, false);
		Grafico grafico3 = new Grafico(lista3, false);
		Grafico grafico4 = new Grafico(lista4, false);
		Grafico grafico5 = new Grafico(lista5, false);
		Grafico grafico6 = new Grafico(lista6, false);
		
		grafico.setBounds(5, 95, 380, 140);
		grafico2.setBounds(5, 280, 380, 140);
		grafico3.setBounds(5, 465, 380, 140);
		grafico4.setBounds(455, 95, 380, 140);
		grafico5.setBounds(455, 280, 380, 140);
		grafico6.setBounds(455, 465, 380, 140);
		
		
		
		painelDist.add(boxNumHarm);
		painelDist.add(labelNumHarm);
		painelDist.add(labelAmplitude);
		painelDist.add(labelAngulo);
		painelDist.add(labelOrdem);
		painelDist.add(labelAmplitude2);
		painelDist.add(labelAngulo2);
		painelDist.add(labelOrdem2);
		painelDist.add(labelAmplitude3);
		painelDist.add(labelAngulo3);
		painelDist.add(labelOrdem3);
		painelDist.add(labelAmplitude4);
		painelDist.add(labelAngulo4);
		painelDist.add(labelOrdem4);
		painelDist.add(labelAmplitude5);
		painelDist.add(labelAngulo5);
		painelDist.add(labelOrdem5);
		painelDist.add(labelAmplitude6);
		painelDist.add(labelAngulo6);
		painelDist.add(labelOrdem6);
		painelDist.add(boxOrdem);
		painelDist.add(boxOrdem2);
		painelDist.add(boxOrdem3);
		painelDist.add(boxOrdem4);
		painelDist.add(boxOrdem5);
		painelDist.add(boxOrdem6);
		painelDist.add(boxAngulo);
		painelDist.add(boxAngulo2);
		painelDist.add(boxAngulo3);
		painelDist.add(boxAngulo4);
		painelDist.add(boxAngulo5);
		painelDist.add(boxAngulo6);
		painelDist.add(txtAmplitude);
		painelDist.add(txtAmplitude2);
		painelDist.add(txtAmplitude3);
		painelDist.add(txtAmplitude4);
		painelDist.add(txtAmplitude5);
		painelDist.add(txtAmplitude6);
		painelDist.add(grafico);
		painelDist.add(grafico2);
		painelDist.add(grafico3);
		painelDist.add(grafico4);
		painelDist.add(grafico5);
		painelDist.add(grafico6);
		
		//Componente Fundamental
		
		JLabel labelAnguloComp = new JLabel("Ângulo da Fase:");
		JLabel labelAmplitudeComp = new JLabel("Amplitude:");
		JButton okCompButton = new JButton("OK");
		JTextField txtAmplitudeComp = new JTextField();
		JComboBox boxAnguloComp = new JComboBox();
		
		for(int i=-180; i<=180; i++) {
			boxAnguloComp.addItem(i);
		}
		
		labelAnguloComp.setBounds(170, 210, 200, 20);
		labelAmplitudeComp.setBounds(20, 210, 200, 20);
		txtAmplitudeComp.setBounds(100, 210, 60, 22);
		boxAnguloComp.setBounds(290, 210, 58, 20);
		okCompButton.setBounds(355, 205, 54, 30);
		
		boxAnguloComp.setSelectedItem(0);
		
		ArrayList<Double> listaCompFundamental = new ArrayList<>();
		
		Grafico graficoCompFundamental = new Grafico(listaCompFundamental, false);
		graficoCompFundamental.setBounds(15, 30, 390, 150);
		
		
		painelComponente.add(labelAmplitudeComp);
		painelComponente.add(labelAnguloComp);
		painelComponente.add(okCompButton);
		painelComponente.add(graficoCompFundamental);
		painelComponente.add(txtAmplitudeComp);
		painelComponente.add(boxAnguloComp);
		
		//Saídas 
		
		JLabel labelInfo = new JLabel("Série de Fourrier Amplitude-Fase:");
		JLabel labelResultante = new JLabel("Resultante");
		JTextArea serieF = new JTextArea();
		
		serieF.setBounds(15, 300, 390, 70);
		serieF.setEditable(false);
		serieF.setLineWrap(true);
		serieF.setBorder(BorderFactory.createEmptyBorder());
		labelResultante.setBounds(180, 65, 120, 20);
		labelInfo.setBounds(100, 275, 250, 20);
		
		ArrayList<Double> listaOndaResultante = new ArrayList<>();
		
		Grafico ondaResultante = new Grafico(listaOndaResultante, true);
		
		ondaResultante.setBounds(15, 80, 390, 170);
		
		painelSaida.add(serieF);
		painelSaida.add(labelInfo);
		painelSaida.add(ondaResultante);
		painelSaida.add(labelResultante);
		
	}
	
	//public static void main(String[] args) {
	//	InterfaceDistorcao inter = new InterfaceDistorcao();
	//}
}
