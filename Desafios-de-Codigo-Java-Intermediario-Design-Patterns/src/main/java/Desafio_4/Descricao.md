# Implementando um Carrinho de Compras com Padrão Strategy

## Descrição
Você está desenvolvendo um sistema simples de carrinho de compras. 
O desafio é implementar a funcionalidade de calcular o total da compra, permitindo que o usuário escolha entre diferentes estratégias de desconto, utilizando o padrão de projeto Strategy.

## Entrada
O programa deve permitir que o usuário adicione produtos ao carrinho, informando o nome e o preço de cada produto. 
Em seguida, o usuário deve escolher a estratégia de desconto desejada entre duas opções: 10% de desconto ou frete grátis.

## Saída
O programa deve calcular e exibir o total da compra com base na estratégia de desconto escolhida.

### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada	| Saída |
|-----------| ------|
|Livro | |
| 45 | |
|1	| Total da compra: R$40.5 |

|Entrada | Saída |
| ------- |-------|
| Air Fryer |          
| 200 | Frete gratis aplicado |
|2	| Total da compra: R$200.0 |

|Entrada | Saída                    |
| ------- |--------------------------|
| Celular |
| 1000|
|1	| Total da compra: R$900.0 |