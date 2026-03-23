# Lista 02 — Condicionais

Exercícios de lógica condicional da disciplina **Algoritmos e Programação 1**.  
Cada exercício é uma classe independente com um método `executar()` chamado pelo 
menu principal do SwissKnife.

---

## Exercícios

### Ex01 — Par, ímpar, múltiplo e divisibilidade
`Ex01ParOuImpar.java`

Peça um número inteiro e informe:
- Se ele é **par** ou **ímpar**
- Se ele é **múltiplo de 3**
- Se ele é **divisível por 5**

---

### Ex02 — Positivo, negativo ou zero
`Ex02PositivoNegativo.java`

Leia um número e informe se ele é **positivo**, **negativo** ou **zero**.

---

### Ex03 — Maior de dois números
`Ex03MaiorDeDois.java`

Peça dois números e informe qual é o **maior**.

---

### Ex04 — Maior de três números
`Ex04MaiorDeTres.java`

Solicite três números e mostre qual é o **maior**.

---

### Ex05 — Aprovação do aluno
`Ex05NotaAluno.java`

Peça a nota final do aluno e informe se foi **aprovado** (nota ≥ 7) ou **reprovado**.

---

### Ex06 — Aposentadoria
`Ex06Aposentadoria.java`

Solicite a idade de uma pessoa e diga se ela **pode se aposentar** (idade ≥ 65).

---

### Ex07 — Múltiplo de 5
`Ex07MultiploDeCinco.java`

Leia um número e informe se ele é **múltiplo de 5**.

---

### Ex08 — Divisível por 3 e por 4
`Ex08DivisivelPor3e4.java`

Verifique se um número é **divisível ao mesmo tempo por 3 e por 4**.

---

### Ex09 — Voto obrigatório
`Ex09VotoObrigatorio.java`

Peça a idade de uma pessoa e diga se o **voto é obrigatório** (entre 18 e 70 anos).

---

### Ex10 — Triângulo válido
`Ex10TrianguloValido.java`

Solicite três lados e verifique se formam um **triângulo válido**.
> A soma de dois lados deve ser maior que o terceiro.

---

### Ex11 — Tipo de triângulo
`Ex11TipoTriangulo.java`

Se os três lados formarem um triângulo válido, diga se ele é:
- **Equilátero** — os três lados iguais
- **Isósceles** — dois lados iguais
- **Escaleno** — todos os lados diferentes

---

### Ex12 — Desconto por valor de compra
`Ex12DescontoPorCompra.java`

Dado o valor da compra, aplique:
- **10% de desconto** se for maior que R$ 500
- **5% de desconto** se for entre R$ 200 e R$ 500
- **Nenhum desconto** se for abaixo de R$ 200

---

### Ex13 — Ordem crescente
`Ex13OrdemCrescente.java`

Leia três números e mostre-os em **ordem crescente**, sem usar `sort`.

---

### Ex14 — Nota para conceito
`Ex14NotaParaConceito.java`

Converta uma nota numérica (0 a 10) para conceito:
- **A** — nota ≥ 9
- **B** — nota ≥ 8
- **C** — nota ≥ 7
- **D** — nota ≥ 6
- **E** — nota < 6

---

### Ex15 — Calculadora simples
`Ex15Calculadora.java`

Peça dois números e uma operação (`+`, `-`, `*`, `/`). Execute a operação e 
exiba o resultado.

---

### Ex16 — Terceiro igual ao primeiro ou segundo
`Ex16TerceiroIgualPrimeiroOuSegundo.java`

Peça três números e informe se o **terceiro é igual ao primeiro ou ao segundo**.

---

### Ex17 — Mesma paridade
`Ex17MesmaParidade.java`

Informe se dois números têm a **mesma paridade** — ambos pares ou ambos ímpares.

---

### Ex18 — Ano bissexto
`Ex18AnoBissexto.java`

Verifique se um ano é **bissexto**:
- Divisível por 4, **mas não** por 100
- **Exceto** se for divisível por 400

---

### Ex19 — Classificação do IMC
`Ex19ClassificacaoIMC.java`

Leia peso e altura, calcule o IMC (`peso / altura²`) e classifique:
- **Abaixo do peso** — IMC < 18.5
- **Normal** — 18.5 a 24.9
- **Sobrepeso** — 25 a 29.9
- **Obesidade** — 30 ou mais

---

### Ex20 — Classificação completa de número
`Ex20ClassificacaoNumero.java`

Classifique um número em três aspectos:
- **Positivo** ou **negativo**
- **Par** ou **ímpar**
- **Inteiro** ou **decimal**

---

### Ex21 — Menu café da manhã
`Ex21CafeDaManha.java`

Exiba um menu com opções de café da manhã:
- 1 — Pão com manteiga
- 2 — Café com leite
- 3 — Suco de laranja
- 4 — Omelete

O programa deve exibir a escolha feita pelo usuário.

---

### Ex22 — Calculadora com menu
`Ex22CalculadoraComMenu.java`

Crie uma calculadora que permite ao usuário escolher entre **soma, subtração, multiplicação ou divisão**. O programa deve pedir dois números e realizar a operação escolhida.

---

### Ex23 — Tipo de transporte
`Ex23TipoDeTransporte.java`

O usuário escolhe um tipo de transporte e o programa exibe a **velocidade média**:
- 1 — Carro
- 2 — Bicicleta
- 3 — Ônibus
- 4 — Avião

---

### Ex24 — Conversor de moeda
`Ex24ConversorDeMoeda.java`

Converta um valor informado pelo usuário de uma moeda para outras:
- 1 — Dólar
- 2 — Euro
- 3 — Real

O programa deve mostrar o valor convertido com base em **cotação fixa**.

---

### Ex25 — Área de figuras geométricas
`Ex25AreaFiguras.java`

O usuário escolhe uma figura geométrica e o programa pede as medidas necessárias 
para calcular a **área**:
- 1 — Círculo
- 2 — Quadrado
- 3 — Retângulo

---

## Padrão das classes

Toda classe desta lista segue o mesmo padrão:

```java
package com.swissknife.exercicios.ap1.lista02;

public class Ex01ParOuImpar {

    public static void executar() {
        // lógica do exercício
    }

}
```

- Sem construtor, sem atributos — apenas o método estático `executar()`
- O `Scanner` é instanciado dentro do próprio método
- O `Main` do SwissKnife chama `executar()` via menu numerado

---

## Fórmulas de referência

| Exercício | Fórmula |
|-----------|---------|
| Triângulo válido | `a + b > c` && `a + c > b` && `b + c > a` |
| IMC | `peso / (altura * altura)` |
| Ano bissexto | `(ano % 4 == 0 && ano % 100 != 0) \|\| (ano % 400 == 0)` |
| Desconto 10% | `valor - (valor * 0.10)` |
| Desconto 5% | `valor - (valor * 0.05)` |