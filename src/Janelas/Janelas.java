package Janelas;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public abstract class  Janelas extends JFrame{
	protected JMenuBar menuBar;
	protected JMenu menu;
	protected ArrayList<JMenuItem> listaOpcoes = new ArrayList<JMenuItem>();
	protected Janelas janelaPrincipal;
	
	public abstract void opcoes(Janelas janela);
	
	public void setJanelaPrincipal(Janelas janela) {
		this.janelaPrincipal = janela;
	}
	
	public void adicionarNaJanela(JPanel painel, Janelas janela) {
		listaOpcoes.forEach((opcao) -> menu.add(opcao));
		menuBar.add(menu);
		painel.add(menuBar);
		add(painel);
		janela.setVisible(true);
	}
	

}
