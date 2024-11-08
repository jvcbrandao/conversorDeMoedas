
# Conversor de Moedas

Este projeto é um **Conversor de Moedas** que utiliza uma API para obter taxas de câmbio em tempo real e converter valores entre diferentes moedas. Desenvolvido em Java, o programa é interativo e fácil de usar, permitindo conversões entre Real (BRL), Dólar Americano (USD), Peso Argentino (ARS) e Dólar Australiano (AUD).

## Funcionalidades

1. **Conversão de Moedas**:
    - Conversão entre as seguintes moedas: Real (BRL), Dólar Americano (USD), Peso Argentino (ARS) e Dólar Australiano (AUD).
    - Cálculo de conversão utilizando valores atualizados de câmbio fornecidos pela API.

2. **Log de Registro**:
    - Geração de um arquivo `log.txt` para registrar a criação do arquivo de log, confirmando o funcionamento do sistema.

3. **Interface de Console**:
    - Menu interativo que orienta o usuário a escolher a conversão desejada e exibe os resultados.

## Pré-requisitos

- Java 11 ou superior.
- Biblioteca externa [Gson](https://github.com/google/gson) para manipulação de dados JSON.
- Acesso à Internet para conectar-se à API de câmbio.

## Estrutura do Código

- **`Conversao.java`**: Contém a lógica principal de conversão de moedas.
- **`GeradorLog.java`**: Responsável por criar o log de execução.
- **`Moedas.java`**: Representa um objeto para as taxas de câmbio (BRL, USD, ARS, AUD) recebidas da API.
- **`RequisicaoAPI.java`**: Gerencia a conexão com a API de câmbio e a obtenção dos valores atualizados.
- **`Textos.java`**: Exibe mensagens formatadas e opções do menu para o usuário.

## Como Funciona

1. O programa exibe um menu com opções de conversão de moedas.
2. O usuário escolhe a opção de conversão desejada e insere o valor a ser convertido.
3. O sistema conecta-se à API de câmbio para obter as taxas atualizadas e calcula o valor convertido.
4. O resultado é exibido no console.

## Exemplo de Uso

A seguir, um exemplo de interação com o programa:

```plaintext
####    #####   ##   ##  ##   ##  #######  ######    #####    #####   ######
##  ##  ##   ##  ###  ##  ##   ##   ##   #   ##  ##  ##   ##  ##   ##   ##  ##
...

1- Para converter de Real para Dólar Americano
2- Para converter de Dólar Americano para Real
3- Para converter de Real para Peso Argentino
4- Para converter de Peso Argentino para Real
5- Para converter de Real para Dólar Australiano
6- Para converter de Dólar Australiano para Real
7- Sair

Escolha uma opção:
```

## Execução

Para executar o projeto, compile e rode o `main`:

```bash
javac Main.java
java Main
```

Certifique-se de que a API Key (chave de API) está configurada corretamente no código antes de executar.

## API de Câmbio

A API utilizada é a [Exchange Rate API](https://www.exchangerate-api.com/), que fornece taxas de câmbio atualizadas em tempo real. **Nota**: A chave de API está configurada diretamente no código e deve ser substituída por uma chave pessoal.

## Melhorias Futuras

- **Adicionar suporte a mais moedas**.
- **Interface gráfica** para melhorar a experiência do usuário.
- **Persistência de logs** detalhados com cada conversão realizada.

---
