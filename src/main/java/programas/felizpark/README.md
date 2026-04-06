# Prova — Estruturas de Decisão e Validação de Dados

## Exercício 1 — Estacionamento FelizPark

O estacionamento **FelizPark** precisa automatizar a cobrança pelos veículos estacionados em sua garagem. Elabore um programa que registre os dados do veículo, calcule o valor a pagar e emita um recibo.

### Entrada de dados

- Placa do veículo
- Hora e minuto de entrada
- Hora e minuto de saída
- Tipo de vaga: coberta ou descoberta

### Regras de negócio

- O valor cobrado por hora estacionada é **R$ 7,00**
- A cobrança é feita **por minuto** (ex: 1h20min = 80 minutos)
- Para **vagas cobertas**, há acréscimo de **20%** sobre o valor total
- Permanência **inferior a 10 minutos**: **sem cobrança**
- O valor mínimo cobrado equivale a **1 hora**, independentemente do tempo
- O valor máximo cobrado equivale a **5 horas**, independentemente do tempo
- O horário de funcionamento é das **06:00 às 22:00**

### Saída esperada (recibo)

```
========== RECIBO FELIZPARK ==========
Placa:        ABC-1234
Entrada:      08:15
Saída:        10:45
Tempo:        2 hora(s) e 30 minuto(s)
Tipo de vaga: Coberta
Valor a pagar: R$ 21,00
======================================
```

### Critérios de avaliação

| Critério | Peso |
|---|---|
| Identificação e declaração das variáveis | 10% |
| Validação de dados | 25% |
| Acréscimo por vaga coberta | 20% |
| Cálculo do valor pelo período estacionado | 25% |
| Exibição das informações no recibo | 20% |

---

## Exercício 2 — Transportadora

Uma transportadora precisa disponibilizar um aplicativo para cálculo rápido de frete de encomendas com um único tipo de produto por envio. Elabore um programa que receba as informações do frete e calcule o valor estimado.

### Produtos disponíveis

| Código | Produto | Preço Unitário |
|---|---|---|
| 001 | Mouse Óptico USB | R$ 35,00 |
| 002 | SSD 240GB | R$ 200,00 |
| 003 | Adaptador Wireless USB | R$ 75,00 |
| 004 | Pen Drive 16GB | R$ 20,00 |
| 005 | Webcam | R$ 159,00 |

### Regiões e taxas de frete

| Região | Taxa |
|---|---|
| Sul | 7% |
| Sudeste | 5% |
| Centro-Oeste | 9% |
| Nordeste | 12% |
| Norte | 15% |

### Tipos de embalagem

| Embalagem | Valor |
|---|---|
| Caixa de papelão grande comum | R$ 10,00 |
| Caixa de papelão grande triplex | R$ 20,00 |
| Plástico bolha | R$ 12,00 |
| Saco plástico | R$ 5,00 |

### Adicionais (opcionais)

| Adicional | Taxa |
|---|---|
| Seguro | 5% |
| Rastreamento | 3% |
| Escolta armada | 10% |

> Pode ser escolhido mais de um adicional. Os percentuais são calculados sobre o valor total do produto.

### Regras de negócio

- A quantidade não pode ser superior a **10 unidades**
- A embalagem é **única**, independentemente da quantidade
- Os adicionais são **opcionais**

### Saída esperada

```
===== RESUMO DO FRETE =====
Valor total do produto:  R$ xxx,xx
Valor do frete (região): R$ xxx,xx
Valor da embalagem:      R$ xxx,xx
Valor dos adicionais:    R$ xxx,xx
--------------------------
Valor final:             R$ xxx,xx
===========================
```

### Critérios de avaliação

| Critério | Peso |
|---|---|
| Identificação e declaração das variáveis | 10% |
| Validação de dados | 25% |
| Cálculo do valor | 45% |
| Exibição das informações | 20% |
