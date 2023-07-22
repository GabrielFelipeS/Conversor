package Janelas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Janelas.JanelaMoedas;

public class JanelaCentral extends Janelas{
	
	
	public JanelaCentral() {
		setSize(300,150);
		setTitle("Conversor ONE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void opcoes(Janelas janela) {
		JPanel painel = new JPanel();
		this.menuBar = new JMenuBar();
		this.menu = new JMenu("Escolha uma opção: ");
		
		//Cria as opçoes
		JMenuItem opcao1 = new JMenuItem("Convertersor de  Moedas");
		JMenuItem opcao2 = new JMenuItem("Convertersor de Temperatura");
		JMenuItem opcao3 = new JMenuItem("Convertersor de  Medidas");
		


		opcao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janela.setVisible(false);
				JanelaMoedas janelaMoedas = new JanelaMoedas();
				janelaMoedas.opcoes(janelaMoedas);
			}
		});	
		
		opcao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//janela.setVisible(false);
				
			}
		});	
		
		opcao3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//janela.setVisible(false);
				
			}
		});	
		
		//Adiciona as opçoes na lista de opcoes
		listaOpcoes.add(opcao1);
		listaOpcoes.add(opcao2);
		listaOpcoes.add(opcao3);
		
		super.adicionarNaJanela(painel, janela);

		super.setJanelaPrincipal(janela);
	}
	
}
