# SwissKnife

Um canivete suíço não é a melhor ferramenta para nenhuma tarefa 
específica — mas resolve quase tudo com uma coisa só. O nome 
reflete exatamente isso: um repositório que concentra tudo que 
está sendo aprendido em Java, de exercícios fundamentais a um 
programa funcional, em um lugar só. Cada novo conceito vira mais 
uma lâmina no canivete.

Dividido em duas partes: exercícios organizados por matéria e um 
programa CLI final que agrupa funcionalidades derivadas desses 
exercícios.

---

## Estrutura

```
src/main/java/
├── exercicios/
│   ├── ap1/        # Algoritmos e Programação 1
│   └── pi/         # Projeto Integrador
└── Main.java       # Programa CLI principal
```

### `exercicios/`
Exercícios resolvidos, separados por matéria:

- **`ap1/`** — Algoritmos e Programação 1
- **`pi/`** — Projeto Integrador

### `Main.java`
Programa CLI que reúne funcionalidades construídas a partir dos exercícios. 
Roda direto no terminal, sem interface gráfica.

---

## Stack

- Java 21 (Microsoft Build of OpenJDK)
- Maven

---

## Decisões técnicas

**Java 21 em vez do Java 23**
A universidade adota o Java 23, mas a escolha aqui foi pelo Java 21 por ser a 
versão LTS (Long-Term Support) mais consolidada atualmente — suporte garantido, 
ecossistema estável e compatibilidade ampla. O objetivo é que o projeto rode em 
qualquer ambiente sem surpresas, independente de qual versão está instalada na 
máquina de quem for rodar.

**Maven em vez do Ant**
O professor de PI sugeriu o Ant, mas ele é um build tool de 2000 que exige 
configuração manual de quase tudo. O Maven já gerencia dependências, estrutura 
de projeto e ciclo de build de forma padronizada e automatizada. É o que o mercado 
usa.