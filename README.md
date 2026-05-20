# Trabalho Prático 03 - Classe Hora

Projeto desenvolvido em Java para a disciplina de Programação Orientada a Objetos, com o objetivo de implementar a classe Hora utilizando conceitos de encapsulamento, construtores, métodos getters/setters, validação de dados e tratamento de exceções.

## Objetivo

Criar uma classe capaz de representar um horário contendo:
- Hora
- Minutos
- Segundos

Além disso, o sistema deve:
- Validar entradas do usuário;
- Trabalhar com diferentes formatos de exibição;
- Converter horários para segundos;
- Utilizar construtores, getters e setters.

---

## Tecnologias Utilizadas

- Java
- Scanner (`java.util.Scanner`)
- Tratamento de exceções (`try/catch`)

---

## Estrutura da Classe

```java
Hora
- hora: int
- min: int
- seg: int
```

## Métodos Implementados

### Construtores
- `Hora()`
- `Hora(int h, int m, int s)`

### Setters
- `setHor(int h)`
- `setMin(int m)`
- `setSeg(int s)`
- `setHor()`
- `setMin()`
- `setSeg()`

### Getters
- `getHor()`
- `getMin()`
- `getSeg()`

### Métodos Extras
- `getHora1()` → retorna no formato `hh:mm:ss`
- `getHora2()` → retorna no formato `hh:mm:ss (AM/PM)`
- `getSegundos()` → retorna o total de segundos

---

## Funcionalidades

- Validação de hora (0–23)
- Validação de minutos (0–59)
- Validação de segundos (0–59)
- Entrada de dados pelo usuário
- Conversão para formato AM/PM
- Conversão total para segundos
- Tratamento de entradas inválidas

---

## Exemplo de Uso

```java
Hora h1 = new Hora(14, 30, 20);

System.out.println(h1.getHora1());
// 14:30:20

System.out.println(h1.getHora2());
// 02:30:20 PM

System.out.println(h1.getSegundos());
// 52220
```

---

## Conceitos Aplicados

- Programação Orientada a Objetos
- Encapsulamento
- Sobrecarga de construtores
- Métodos getters e setters
- Validação de dados
- Tratamento de exceções
- Manipulação de Strings

---Desenvolvido por Caio Victor Andrade para fins a
