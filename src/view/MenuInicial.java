package view;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuInicial {

	JFrame menuInicial;
	JPanel painelBotoes;
	JLabel labelSimulacao;
	
	public MenuInicial() {
		preparaMenu();
	}
	
	private void preparaMenu() {
		menuInicial = new JFrame("Aprenda QEE");
		menuInicial.setSize(500,300);
		menuInicial.setLocationRelativeTo(null);
		menuInicial.setLayout(null);
		
		menuInicial.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		painelBotoes = new JPanel(null);
		painelBotoes.setBounds(5 ,5, 490, 290);
		menuInicial.add(painelBotoes);
		
		preparaPainel();
		
		menuInicial.setVisible(true);
		
	}
	
	private void preparaPainel() {
		labelSimulacao = new JLabel("Escolha a simulação que deseja fazer");
		labelSimulacao.setBounds(85, 50, 300, 30);
		Font f = new Font("SansSerif", Font.BOLD, 14);
		labelSimulacao.setFont(f);
		
		JButton fluxoPotButton = new JButton("Fluxo de Potência");
		fluxoPotButton.setBounds(20, 130, 200, 50);
		
		JButton distorcaoHarButton = new JButton("Distorção Harmônica");
		distorcaoHarButton.setBounds(265, 130, 200, 50);
		
		painelBotoes.add(labelSimulacao);
		painelBotoes.add(fluxoPotButton);
		painelBotoes.add(distorcaoHarButton);
	}
	
	public static void main(String[] args) {
		MenuInicial menu = new MenuInicial();
	}
	
}
