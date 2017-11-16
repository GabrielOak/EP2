package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import view.*;


public class AcoesMenuInicial implements ActionListener{
	
	private JFrame mainFrame;
	
	public AcoesMenuInicial (JFrame mainFrame){
		this.mainFrame = mainFrame;
	}
	
	public void actionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		
		if(command.equals("okFluxoPotencia")){
			mainFrame.dispose();
			InterfacePotenciaFundamental interfacePotFundamental = new InterfacePotenciaFundamental();
		}
		if (command.equals("okDistorcaoHarmonica")){
			mainFrame.dispose();
			InterfaceDistorcao interfaceDistHarmonica = new InterfaceDistorcao();
		}
	}
}
