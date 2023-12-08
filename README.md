# README  - Conversor de Moeda e Temperatura
Projeto proposto pela ONE - Oracle Next Education

## Visão Geral

Este projeto em Java consiste em um aplicativo de console que oferece funcionalidades para a conversão de moeda e temperatura. Ele é composto por duas partes principais: o conversor de moeda e o conversor de temperatura.

## Estrutura do Projeto

O projeto está dividido em pacotes para organizar as funcionalidades:

- **principal:** Contém a classe Principal, responsável por iniciar o programa e apresentar um menu de opções ao usuário.

- **conversorMoedas:** Contém as classes relacionadas ao conversor de moeda.

- **conversorTemperatura:** Contém as classes relacionadas ao conversor de temperatura.

## Utilização

Ao executar o programa, o usuário é apresentado com um menu onde pode escolher entre o "Conversor de Moeda" e o "Conversor de Temperatura". Após a escolha, o usuário é guiado através de prompts para inserir valores e realizar as conversões desejadas.

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

## Validação de Entrada

### Método: `checar(String input)`

Este método está na classe `Principal` e é usado para validar se a entrada do usuário é um número válido. Retorna true se a entrada for um número, e false caso contrário.

## Execução

O programa é executado em um loop infinito até que o usuário escolha sair explicitamente. A cada iteração, o usuário é apresentado com o menu principal e guiado através das conversões desejadas.

Esperamos que este README detalhado ajude na compreensão e utilização deste projeto. Se surgirem dúvidas ou melhorias, não hesite em entrar em contato com os desenvolvedores.
