# Conversor de Moeda e Temperatura - README 🌐🌡️💰
Projeto proposto pela ONE - Oracle Next Education

## Visão Geral 🚀

Este projeto Java, desenvolvido como parte do desafio ONE da Alura, é um conversor simples de temperatura e moedas. A aplicação utiliza a biblioteca Swing para interfaces gráficas.

## Estrutura do Projeto 🏗️

O projeto é dividido em classes que encapsulam as funcionalidades específicas:

- **Funcao:** Solicita ao usuário a escolha entre o "Conversor de Moeda" e o "Conversor de Temperatura". Dispara métodos específicos com base na escolha.

- **ConverteMoedas:** Converte moeda de reais para uma determinada moeda escolhida pelo usuário.

- **ConverteMoedasParaReais:** Converte de uma determinada moeda para reais.

- **FuncaoTemperatura:** Solicita ao usuário a escolha das escalas térmicas para serem convertidas.

- **ConverteTemperatura:** Contém métodos para realizar conversões entre escalas térmicas.

## Utilização 🛠️

Ao executar o programa, o usuário é apresentado com um menu que permite escolher entre "Conversor de Moeda" e "Conversor de Temperatura". Posteriormente, é guiado através de prompts para inserir valores e realizar as conversões desejadas.

## Conversor de Moeda

### Classe: `Funcao`

#### Métodos

1. `converterMoeda(double valorRecebido)`: Este método recebe um valor em reais e solicita ao usuário que escolha a moeda para a qual deseja converter. Com base na escolha, chama o método apropriado da classe `ConverteMoedas` ou `ConverteMoedasParaReais` para realizar a conversão e exibe o resultado usando JOptionPane.

### Classe: `ConverteMoedas`

#### Métodos

1. `converterReaisParaDolares(double valorRecebido)`: Converte um valor em reais para dólares.
2. `converterReaisParaEuros(double valorRecebido)`: Converte um valor em reais para euros.
3. `converterReaisParaLibras(double valorRecebido)`: Converte um valor em reais para libras.
4. `converterReaisParaPesosArgentinos(double valorRecebido)`: Converte um valor em reais para pesos argentinos.
5. `converterReaisParaPesosChilenos(double valorRecebido)`: Converte um valor em reais para pesos chilenos.

### Classe: `ConverteMoedasParaReais`

#### Métodos

1. `converterDolaresParaReais(double valorRecebido)`: Converte um valor em dólares para reais.
2. `converterEurosParaReais(double valorRecebido)`: Converte um valor em euros para reais.
3. `converterLibrasParaReais(double valorRecebido)`: Converte um valor em libras para reais.
4. `converterPesosArgentinosParaReais(double valorRecebido)`: Converte um valor em pesos argentinos para reais.
5. `converterPesosChilenosParaReais(double valorRecebido)`: Converte um valor em pesos chilenos para reais.

## Conversor de Temperatura

### Classe: `FuncaoTemperatura`

#### Métodos

1. `converterTemperatura(double valorRecebido)`: Este método recebe um valor de temperatura e solicita ao usuário que escolha a operação desejada. Com base na escolha, chama o método apropriado da classe `ConverteTemperatura` para realizar a conversão e exibe o resultado usando JOptionPane.

### Classe: `ConverteTemperatura`

#### Métodos

1. `converterCelsiusParaFahrenheit(double valorRecebido)`: Converte uma temperatura de Celsius para Fahrenheit.
2. `converterCelsiusParaKelvin(double valorRecebido)`: Converte uma temperatura de Celsius para Kelvin.
3. `converterFahrenheitParaCelsius(double valorRecebido)`: Converte uma temperatura de Fahrenheit para Celsius.
4. `converterKelvinParaCelsius(double valorRecebido)`: Converte uma temperatura de Kelvin para Celsius.
5. `converterKelvinParaFahrenheit(double valorRecebido)`: Converte uma temperatura de Kelvin para Fahrenheit.


## Validação de Entrada ✅

A classe `Principal` contém um método chamado `checar(String input)` que valida se a entrada do usuário é um número válido.

## Execução 🔄

O programa é executado em um loop infinito até que o usuário escolha sair explicitamente. Em cada iteração, o usuário é apresentado com o menu principal e guiado através das conversões desejadas.

## Repositórios 📂

[Repositórios GitHub](https://github.com/GabrielFelipeS/)

## Tecnologias Utilizadas 🖥️

- **Java**
- **Swing (GUI)**

## Observações Importantes 📝

Este projeto é parte do desafio ONE da Alura, proporcionando uma oportunidade de aprimorar habilidades em Java e interfaces gráficas.

---

Espero que este README detalhado facilite a compreensão e utilização deste projeto. Caso tenha dúvidas ou sugestões, não hesite em entrar em contato com o desenvolvedor.

**#Java #Swing #ONE**


