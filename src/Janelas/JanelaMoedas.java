package Janelas;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JanelaMoedas extends Janelas{
	
	public JanelaMoedas() {
		setSize(325, 175);
		setTitle("Conversor ONE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void opcoes(Janelas janela) {
		JPanel painel = new JPanel();
		this.menuBar = new JMenuBar();
		JLabel labelMensagemParaConverter = new JLabel("Escolha uma moeda para converter seu dinheiro: ");
		painel.add(labelMensagemParaConverter);
		
		this.menu = new JMenu("Escolha uma moeda: ");
		//menu.setText("TEstando");
		
		// Iniciando opçoes
		JMenuItem opcao01 = new JMenuItem("Converter de Reais a Dólar");
		JMenuItem opcao02 = new JMenuItem("Converter de Reais a Euro");
		JMenuItem opcao03 = new JMenuItem("Converter de Reais a Libras Esterlinas");
		JMenuItem opcao04 = new JMenuItem("Converter de Reais a Peso argentino");
		JMenuItem opcao05 = new JMenuItem("Converter de Reais a Peso Chileno");
		JMenuItem opcao06 = new JMenuItem("Converter de Dólar a Reais");
		JMenuItem opcao07 = new JMenuItem("Converter de Euro a Reais");
		JMenuItem opcao08 = new JMenuItem("Converter de Libras Esterlinas a Reais");
		JMenuItem opcao09 = new JMenuItem("Converter de Peso argentino a  Reais");
		JMenuItem opcao10 = new JMenuItem("Converter de Peso Chileno a Reais");
		
		// Colocando na lista de opções
		listaOpcoes.add(opcao01);
		listaOpcoes.add(opcao02);
		listaOpcoes.add(opcao03);
		listaOpcoes.add(opcao04);
		listaOpcoes.add(opcao05);
		listaOpcoes.add(opcao06);
		listaOpcoes.add(opcao07);
		listaOpcoes.add(opcao08);
		listaOpcoes.add(opcao09);
		listaOpcoes.add(opcao10);
		
		
		// Salvando tudo
		super.adicionarNaJanela(painel, janela);	
	}
}
