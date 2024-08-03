# Desafio de Padrões de Projeto

## Descrição do Desafio

Este projeto foi desenvolvido como parte do curso **"Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework"** da plataforma DIO. O 
objetivo é explorar o conceito de Padrões de Projeto na prática, aplicando os padrões aprendidos durante as aulas ou desenvolvendo uma nova solução 
do zero.

## Padrão de Projeto Utilizado: Observer

O padrão Observer é utilizado para definir uma dependência de um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os 
seus dependentes são notificados e atualizados automaticamente.

### Estrutura do Projeto

O projeto consiste nas seguintes classes principais:

1. `Observer` - Interface que define o método `update` que todos os observadores devem implementar.
2. `Subject` - Interface que define os métodos para registrar, remover e notificar observadores.
3. `WeatherStation` - Classe que implementa `Subject` e gerencia os observadores.
4. `PhoneDisplay` e `WindowDisplay` - Classes que implementam `Observer` e representam dispositivos que serão notificados sobre mudanças na 
temperatura.

### Funcionamento

1. A classe `WeatherStation` gerencia uma lista de observadores e os notifica quando a temperatura muda.
2. As classes `PhoneDisplay` e `WindowDisplay` são observadores que implementam a interface `Observer` e são notificados das mudanças de temperatura 
pela `WeatherStation`.

## Como Executar

1. Navegue até a pasta `src`:

 ```bash
 cd src
 ```
2. Compile as classes Java com o comando:

```bash
javac Observer.java Subject.java WeatherStation.java PhoneDisplay.java WindowDisplay.java Main.java
```

3. Execute o programa com o comando:

```bash
java Main
```

Ao executar o programa, você verá a saída no console mostrando como os dispositivos são notificados sobre as mudanças de temperatura.