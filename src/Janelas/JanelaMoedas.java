package Janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import org.json.JSONObject;

public class JanelaMoedas extends Janelas{
	
	public JanelaMoedas(Janelas janela) {
		super.setJanelaPrincipal(janela);
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
		//janelaPrincipal.setVisible(true);
		
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
		
		opcao01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais a Dólar");
				apiMoeda("USD-BRL");
			}
		});

		opcao02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais a Euro");
				apiMoeda("EUR-BRL");
			}
		});
		
		opcao03.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais a Libras Esterlinas");
				apiMoeda("GBP-BRL");
			}
		});
		
		opcao04.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais a Peso argentino");
				apiMoeda("ARS-BRL");
			}
		});
		
		opcao05.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais a Peso Chileno");
				apiMoeda("CLP-BRL");
			}
		});
		
		opcao06.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Dólar a Reais");
				apiMoeda("BRL-USD");
			}
		});
		
		opcao07.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Euro a Reais");
				apiMoeda("BRL-EUR");
			}
		});
		
		opcao08.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Libras Esterlinas a Reais");
				apiMoeda("BRL-GBP");
			}
		});
		
		opcao09.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Peso argentino a  Reais");
				apiMoeda("BRL-ARS");
			}
		});
		
		opcao10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Peso Chileno a Reais");
				apiMoeda("BRL-CLP");
			}
		});
		
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
		
		
		
		//janela.clos
		// Salvando tudo
		super.adicionarNaJanela(painel, janela);	
	}
	
	public double apiMoeda(String moeda) {
		String urlDaMoeda = "https://economia.awesomeapi.com.br/last/" + moeda;
		try {
			URL url = new URL(urlDaMoeda);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
			String jsonEmString = JanelaMoedas.converteJSON(resposta);
			double resultado = 0;	
			
			//extrair dados
	        JSONObject jsonObject = new JSONObject(jsonEmString);
	        
	        // Obter o objeto JSON para a moeda USDBRL
	        JSONObject valorObject = jsonObject.getJSONObject(moeda.replace("-", ""));
	        
	        // Obter o valor do "bid" para a moeda USDBRL
	        double bidValue = valorObject.getDouble("bid");
	        
	        // Printanod valores pra testar
	        System.out.println(jsonEmString);
	        System.out.println(jsonObject);
	        System.out.println(valorObject);
	        System.out.println(bidValue);
		} catch(Exception e) {
			System.out.println("Erro: " + e);
		}
//		
		
		return 0;
	}
	
	public static String converteJSON(BufferedReader buffereReader) throws IOException {
		String resposta, jsonEmString = "";
		while((resposta = buffereReader.readLine()) != null) {
			jsonEmString += resposta;
		}
		
		return jsonEmString;
	}
}

