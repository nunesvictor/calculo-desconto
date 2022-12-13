# calculo-desconto
## 1. Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?

Foi utilizado o `Padrão Decorador`.

## 2. Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos?

Poderíamos criar uma class `DescontoHandler` que proveria cada um dos métodos de desconto recebendo como
parâmetro o valor da venda e, no caso do desconto de aniversário os valores e data da venda bem como a
data de nascimento do cliente.

## 3. Quais os problemas que tal implementação traria?

Essa implementação violaria o SRP, pois ainda que todos sejam de descontos, cada categoria de desconto
tem a sua própria regra de negócios. Violariamos também o OCP, visto que qualquer adição de uma nova
categoria de desconto implicaria na alteração da classe já criada.