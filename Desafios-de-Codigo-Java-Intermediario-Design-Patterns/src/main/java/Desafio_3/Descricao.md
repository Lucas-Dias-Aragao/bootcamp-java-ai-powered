# Implementando um Catálogo de Produtos com Padrão Observer

## Descrição
Você deve aprimorar o sistema de monitoramento de produtos, adicionando a capacidade de exibir uma mensagem específica para cada usuário quando um novo produto é adicionado ao catálogo. Além disso, implemente a funcionalidade de permitir que os usuários cancelem sua assinatura para deixar de receber notificações sobre novos produtos.

## Entrada
O programa deve solicitar ao usuário que insira o nome do usuário para realizar a ação desejada.

Se o usuário deseja cancelar a assinatura, ele deve digitar "cancelar". Se desejar receber notificações, deve digitar qualquer outro valor.

Se o usuário optar por adicionar um novo produto, será solicitado o nome do produto a ser adicionado.

## Saída
Após cada ação, o programa deve exibir mensagens informativas para indicar se a assinatura foi cancelada com sucesso, se o usuário ainda está assinando notificações ou se o produto foi adicionado ao catálogo.

------------------------------
### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada	| Saída        |
| --------- |--------------|
| TV        |
| Smart     |Notificacao recebida: Novo produto adicionado - TV |
| 999       |
| S	        | 

| Entrada | Saída |
| -------- | ----- |
|Smartphone |
|Apple | Notificacao recebida: Novo produto adicionado - Smartphone |
|3000  |
|S	    | 

| Entrada | Saída |
|-------- | ----- |
| Mouse |
|Sem fio |
|340    |
|N      |	Programa Encerrado. |

