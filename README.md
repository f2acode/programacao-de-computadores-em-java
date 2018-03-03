## Programação de computadores em Java

:bulb: Esse repositório pode ser usado como referência para consultas rápidas (```ctrl+f```)

## Capítulos:

### 01: Introdução ao Java
### 02: [Ambiente de desenvolvimento](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo02)
### 03: [Construção de aplicativos](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo03)
* Entrada e saída de dados (input/output) com ```System.in``` e a classe ```JOptionPane```.
* Entrada de dados com a classe ```Scanner``` e saída formatada com ```System.out.printf()```
* Literais e Exercícios
### 04: [Variáveis e constantes](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo04)
  * Tipos primitivos, números inteiros e decimais
  * Conversões entre tipos numéricos, de caractere para número e vice versa, e de texto para tipos numéricos e vice versa
  * Constantes e formatação double para moeda com a classe```NumberFormat```
  * Exercícios

### 05: [Introdução à API do Java](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo05)

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

### 06: [Operadores](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo06)

#### Códigos exemplos
* Operadores aritméticos, lógicos, relacionaise e operador ternário

#### Exercícios
* Cálculo de velocidade média, porcentagem de impostos e juros, e cálculo de alíquota de imposto de renda
* Verificação de números impares e pares, e verificações lógicas

### 07: [Estruturas de decisão](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo07)

#### Códigos exemplos
* Estrutura ```if```, ```if-else``` e ```switch```.

#### Exercícios
* Verificação de e-mail e CEP
* Classificação de conceitos avaliativos 
* Cálculo e classificação de impostos (INSS) e cálculo de IMC

### 08: [Estruturas de repetição](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo08)

#### Códigos exemplos
* Estrutura ```while```, ```do-while``` e ```for```.
* Quebras de laço ```break``` e ```continue```.
* Laços aninhados.

#### Exercícios
* Loop enquanto nome não for válido ou cancelada inserção de nome

### 09: [Vetores e matrizes](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo09)

#### Códigos exemplos
* Vetores e matrizes dos diversos tipos de dados

### 10: [Tratamento de exceções](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo10)

#### Códigos exemplos
* Estruturas de ```try-catch``` utilizando diversos tipos de ```Exceptions``` (inclui tratamento múltiplo e personalizado)
* ```Finally```

### 11: [Conceitos de orientação a Objetos]()

Capítulo conceitual abrangendo conceitos como classes, objetos, classificação e instanciação, generalização e especialização, agregação e decomposição, etc.

### 12: [A anatomia das classes](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo12)

Construtores, atributos, métodos e conceitos relacionados às classes (aplicação do capítulo anterior).

#### Exercícios
* Validar nome e pegar iniciais, cálculo de área de círculo e IMC

### 13: [Encapsulamento](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo13)

Conceito de encapsulamento, ```gets``` e ```sets```, validações nos ```gets``` e ```sets``` e nos construtores, atributos estáticos e constantes, e métodos estáticos.

Encapsulamento tem como objetivo impedir a quebra de integridade de conteúdo, isso deve ser garantido por métodos para setar os valores nas próprias classes. Esse métodos servem tanto para garantir a integridade de tipo de dados, quanto para garantir integridade de regras de negócio em relação aos dados.

```checked exceptions```: Exceções que exigem um tratamento para compilar a classe que deve implementá-lo.
```unchecked exceptions```: Exceções que **não** exigem um tratamento para compilar a classe que deve implementá-lo.

Exceções interessantes:
  * ```NullPointerException```: Dado nulo
  * ```IllegalArgumentException```: Argumento inválido (genericamente falando)
  * ```NumberFormatException```: Formato de número inválido

Iniciar string vazia no construtor é diferente de deixá-la nula.
Podemos realizar a utilização de ```try-catch``` quando implementamos exceções nas classes, para exibir a mensagem de retorno.

Quando realizamos o output de um dado, como quando utilizamos o ```JOptionPane.showMessageDialog(null, dado)```, é chamado automaticamente o método ```toString()``` do dado a ser mostrado, podemos então sobrescrever esse método dentro da classe do mesmo dado.

É possível realizar a validação de dados no construtor.

A relação entre os atributos e os métodos de leitura e escrita (```gets-sets```) é assimétrica.

**Atributos estáticos - ```static```:** Atributos que podem ser compartilhadas por todas as instâncias de uma classe.

**Atributos constantes - ```final```:** Atributos que não podem ser modificados.

Uma boa prática pode ser usar o padrão ```is[Atributo]``` para atributos booleanos.

### 14: [Herança e polimorfismo](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo14)

TODO.

### 15: [Interfaces](https://github.com/felipeaugustox/programacao-de-computadores-em-java/tree/master/src/br/com/livro/capitulo15)

TODO.

### Extra: Compilando e executando com .bat (apenas para Windows) - [Código aqui](https://gist.github.com/felipeaugustox/22dd2baa94238bf4fed4ab73d99e699f)
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