package Janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.JSONObject;

public class JanelaMoedas extends Janelas{
	private double valorMoeda;
	
	public JanelaMoedas(Janelas janela) {
		super.setJanelaPrincipal(janela);
		setSize(325, 175);
		setTitle("Conversor ONE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void opcoes(Janelas janela) {
		boolean BRLemPrimeiro = false;
		JPanel painel = new JPanel();
		this.menuBar = new JMenuBar();
		JLabel labelMensagemParaConverter = new JLabel("Escolha uma moeda para converter seu dinheiro: ");
		painel.add(labelMensagemParaConverter);
		
		this.menu = new JMenu("Escolha uma moeda: ");
		//menu.setText("TEstando");
		
		// Iniciando opçoes
		JMenuItem opcao01 = new JMenuItem("Converter de Reais para Dólar");
		JMenuItem opcao02 = new JMenuItem("Converter de Reais para Euro");
		JMenuItem opcao03 = new JMenuItem("Converter de Reais para Libras Esterlinas");
		JMenuItem opcao04 = new JMenuItem("Converter de Reais para Peso argentino");
		JMenuItem opcao05 = new JMenuItem("Converter de Reais para Peso Chileno");
		JMenuItem opcao06 = new JMenuItem("Converter de Dólar para Reais");
		JMenuItem opcao07 = new JMenuItem("Converter de Euro para Reais");
		JMenuItem opcao08 = new JMenuItem("Converter de Libras Esterlinas para Reais");
		JMenuItem opcao09 = new JMenuItem("Converter de Peso argentino para Reais");
		JMenuItem opcao10 = new JMenuItem("Converter de Peso Chileno para Reais");
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
				menu.setText("Converter de Reais para Dólar");
				valorMoeda = apiMoeda("USD-BRL");
				
			}
		});

		opcao02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais para Euro");
				valorMoeda = apiMoeda("EUR-BRL");
			}
		});
		
		opcao03.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais para Libras Esterlinas");
				valorMoeda = apiMoeda("GBP-BRL");

			}
		});
		
		opcao04.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais para Peso argentino");
				valorMoeda = apiMoeda("ARS-BRL");
			}
		});
		
		opcao05.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Reais para Peso Chileno");
				valorMoeda = apiMoeda("CLP-BRL");
			}
		});
		
		opcao06.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Dólar para Reais");
				valorMoeda = apiMoeda("BRL-USD");
			}
		});
		
		opcao07.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Euro para Reais");
				valorMoeda = apiMoeda("BRL-EUR");
			}
		});
		
		opcao08.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Libras Esterlinas para Reais");
				valorMoeda = apiMoeda("BRL-GBP");
			}
		});
		
		opcao09.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Peso argentino para  Reais");
				valorMoeda = apiMoeda("BRL-ARS");
			}
		});
		
		opcao10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText("Converter de Peso Chileno para Reais");
				valorMoeda = apiMoeda("BRL-CLP");
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
		
		super.adicionarNaJanela(painel, janela);
		
		JLabel labelValor = new JLabel("Insria um valor: ");
		painel.add(labelValor);
		
		this.inputNumParaConverter = new JTextField(20);
		painel.add(this.inputNumParaConverter);
		
		JButton converter = new JButton("Converter");
		painel.add(converter);
		converter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double inputValor = 0, resultado = 0;
				
				if(valorMoeda <= 0) {
					JOptionPane.showInternalMessageDialog(null, "Por favor insira uma moeda para conversão",
				             "AVISO", JOptionPane.INFORMATION_MESSAGE);
					throw new RuntimeException("Por favor insira uma moeda para conversão");
				}
				
				
				try {
					inputValor = getTextField();
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					resultado = Double.parseDouble(decimalFormat.format(inputValor / valorMoeda).replace(",", "."));
					
					JOptionPane.showInternalMessageDialog(null, "O valor da conversão é " + resultado, "Message", JOptionPane.INFORMATION_MESSAGE);
					int a = JOptionPane.showConfirmDialog(janelaPrincipal, "Deseja Continuar?");
					
					if(a == JOptionPane.YES_OPTION) {
						System.out.println("SIM");
						janelaAtual.dispose();
						janelaPrincipal.setVisible(true);
					} else if(a == JOptionPane.NO_OPTION) {
						JOptionPane.showInternalMessageDialog(null, "Programa finalizado");
						System.exit(0);
					} else {
						JOptionPane.showInternalMessageDialog(null, "Programa concluído");
					}
					
					System.out.println(resultado);
				} catch(Exception exept) {
					System.out.println("Erro: " + exept);
				}
			}
		});
	}
	
	public double apiMoeda(String moeda) {
		String urlDaMoeda = "https://economia.awesomeapi.com.br/last/" + moeda;
		double valorMoeda = 0;
		try {
			URL url = new URL(urlDaMoeda);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
			String jsonEmString = JanelaMoedas.converteJSON(resposta);
			
			
			//extrair dados
			JSONObject jsonObject = new JSONObject(jsonEmString);
			
			// Obter o objeto JSON para a moeda USDBRL
			JSONObject valorObject = jsonObject.getJSONObject(moeda.replace("-", ""));
			
			// Obter o valor do "bid" para a moeda USDBRL
			double valorSemTratamento = valorObject.getDouble("bid");
			
			// Fazendo um pequeno tratamento de dados
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
			valorMoeda = Double.parseDouble(decimalFormat.format(valorSemTratamento).replace(",", "."));
			
			// Printanod valores pra testar
			System.out.println(jsonEmString);
			System.out.println(jsonObject);
			System.out.println(valorObject);
			System.out.println(valorMoeda);
			
		} catch(Exception e) {
			System.out.println("Erro: " + e);
		}	
		return valorMoeda;
		
	}
	
	public static String converteJSON(BufferedReader buffereReader) throws IOException {
		String resposta, jsonEmString = "";
		while((resposta = buffereReader.readLine()) != null) {
			jsonEmString += resposta;
		}
		
		return jsonEmString;
	}
	
	public double getTextField() throws Exception {
		String texto = inputNumParaConverter.getText();
		String textoComPonto = texto.replace(",", ".");
		
		if(texto.isEmpty()) {
			JOptionPane.showInternalMessageDialog(null, "Valor inválido.\nPor favor insira um número para converter",
		             "AVISO", JOptionPane.INFORMATION_MESSAGE);
			throw new Exception("Input vazios");
		}
		
		for(char c : textoComPonto.toCharArray()) {
			// Impede a entrade de qualquer valor que não seja número e ponto final
			if( (Character.isLetter(c) || !Character.isLetterOrDigit(c)) && !Character.toString(c).equals(".")) {
				JOptionPane.showInternalMessageDialog(null, "Valor inválido.\nLetra ou carácter especial encontrado",
			             "AVISO", JOptionPane.INFORMATION_MESSAGE);
				throw new Exception("Letra ou caracter especial encontrado");
			} 
		}
		
		return Double.parseDouble(textoComPonto);
	}
}



