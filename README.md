# Desafios de programação

# Desafio 1

## **Desafio**

Faça um programa que receba a média de um aluno e imprima o seguinte:

- Caso a média seja < 5 imprima `"REP"`;
- Caso a média seja >= 5 e < 7 imprima `"REC"`;
- Caso a média seja >7 imprima `"APR"`.

## **Entrada**

A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno. Conforme mostrado no exemplo de entrada a seguir.

## **Saída**

Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com a palavra "Reprovado" caso sua média seja < 5, "Recuperação" caso sua média seja >= 5 e < 7 e "Aprovado" caso a média seja > 7. Use o exemplo abaixo para clarear o que está sendo pedido.

-------------------------------------------------------

# Desafio 2

## **Desafio**

Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

## **Entrada**

As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

## **Saida**

As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.

-------------------------------------------------------

# Desafio 3

## **Desafio**

Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M. Cada um com seu respectivo valor:

**I : 1 V : 5 X : 10 L : 50 C : 100 D : 500 M : 1000**

Eles são geralmente escritos do maior para o menor. Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.

## **Entrada**

Você receberá uma entrada em numeral romano.

## **Saída**

Você deverá imprimir o numeral romano convertido para um número inteiro.

-------------------------------------------------------

# Desafio 4

## **Desafio**

Faça um programa que calcule e imprima o salário a ser transferido para um funcionário. Para realizar o calculo, primeiro receba o valor do salário bruto (`valorSalario`) e adicional dos benefícios **(`valorBeneficios`). Por fim, o salário a ser transferido é calculado da seguinte maneira:

`(valorSalario - valorImpostos) + valorBeneficios`

Para calcular o `valorImpostos`, seguem as aliquotas (baseadas no valor do salário bruto):

De R$ 0.00 a R$ 1100.00 = 5.00%

De R$ 1100.01 a R$ 2500.00 = 10.00%

Maior que R$ 2500.00 = 15.00%

## **Entrada**

A entrada consiste em vários arquivos de teste, que conterá o valor do salário bruto (`valorSalario`) e adicional dos benefícios ******(`valorBeneficios`). Conforme mostrado no exemplo de entrada a seguir.

## **Saída**

Para cada conjunto de Entradas (`valorSalario` e `valorBeneficios`), deverá ser calculada uma Saída. Para isso, basta imprimir uma linha com o resultado da seguinte fórmula:

**`saida = (valorSalario - valorImpostos) + valorBeneficios`**

Use o exemplo abaixo para entender melhor a formatação das Entradas e Saída.

-------------------------------------------------------

# Desafio 5

## **Desafio**

Desenvolver um programa que determine em quantos anos a população do país `A` ultrapassará ou igualará a população do país `B`. Para isso, considere as seguintes informações:

1. **População Inicial:** País `A` tem `N` habitantes e País `B` tem `M` habitantes, onde `N` é sempre menor que `M`.
2. **Taxas de Crescimento Anual:** País `A` cresce a uma taxa de 3% ao ano, enquanto País `B` cresce a uma taxa de 1.5% ao ano.
3. **Cálculo Requerido:** O programa deve calcular o número de anos necessários para que a população de `A` seja igual ou maior que a de `B`, considerando as taxas de crescimento contínuas.

**Observação:** As taxas de crescimento devem ser aplicadas anualmente a partir das populações iniciais.

## **Entrada**

A entrada consiste em dois valores inteiros, sendo `N` a população do país `A` e `M` a população do país `B`.

## **Saída**

A saída consiste em retornar o número de anos necessários para que a população do país `A` ultrapasse ou iguale a população `B`, mantidas as taxas de crescimento.