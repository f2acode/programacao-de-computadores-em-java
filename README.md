# Programação de computadores em Java

:bulb: É possível compilar e executar os arquivos rapidamente [no terminal](https://github.com/felipeaugustox/programacao-de-computadores-em-java#compilando-e-executando-com-bat-apenas-para-windows---código-aqui).

:bulb: Esse repositório pode ser usado como referência para consultas rápidas (```ctrl+f```)

## Capítulos:

### 01: Introdução ao Java
### 02: [Ambiente de desenvolvimento](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo02)
### 03: [Construção de aplicativos](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo03)
* Entrada e saída de dados (input/output) com ```System.in```.
* Saída formatada com ```System.out.printf()```
* Literais
* Entrada de dados com a classe ```Scanner```
* Entrada e saída de dados com a classe ```JOptionPane```
* Exercícios
### 04: [Variáveis e constantes](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo04)
  * Tipos primitivos
  * Números inteiros e decimais
  * Conversão entre tipos numéricos
  * Conversão de texto para tipos numéricos e vice versa
  * Conversao de caractere para número e vice versa
  * Constantes
  * Formatação double para moeda com a classe```NumberFormat```
  * Exercícios

### 05: [Introdução à API do Java](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo05)

#### Códigos exemplos
* Manipulação de texto classe ```String```
* Comparação de texto com a classe ```String```
* Utilização da classe ```Math```
* Demonstração de conversões com classes ```Boolean```, ```Character```, ```Byte```, ```Short```, ```Integer```, ```Long```, ```Float``` e ```Double```.
* Utilização da classe ```Character``` para verificações e conversões de letras e números
* Geração de números aleatórios em diversos tipos de dados com a classe ```Random```.

#### Exercícios
* Manipulação de CEPs e CPFs.
* Verificação de palavras e frases.
* Exercícios com fórmulas matemáticas, como cálculos de círculo.
* Geração de números aleatórios com ```Math.Random()``` e a classe ```Random```.

### 06: [Operadores](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo06)

#### Códigos exemplos
* Operadores aritméticos 
* Operadores lógicos
* Operadores relacionais
* Operador ternário

#### Exercícios
* Cálculo de velocidade média
* Cálculo de porcentagem de impostos e juros
* Verificação de números impares e pares
* Verificações lógicas
* Cálculo de alíquota de imposto de renda

### 07: [Estruturas de decisão](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo07)

### 08: [Estruturas de repetição](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo08)

### 09: [Vetores e matrizes](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo09)

### 10: [Tratamento de exceções](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/capitulo10)


### Compilando e executando com .bat (apenas para Windows) - [Código aqui](https://gist.github.com/felipeaugustox/22dd2baa94238bf4fed4ab73d99e699f)
Foi criado um arquivo .bat para compilar e executar os exemplos de códigos, assim como os exercícios mais facilmente:
```
run_java.bat <numero_capitulo> <codigo_ou_exercicio> <nome_arquivo_java>
```
Exemplo código:
```
run_java.bat 05 c Matematica
```
Exemplo exercício:
```
run_java.bat 04 e Exercicio0401
```