# DemoStore
Projeto construído por Marlon Fontoura, como solução para o desafio de automação para o cenário abaixo:

### Caso de teste: adicionar produtos ao carrinho de compras.
1.            Acessar o site: http://demo.cs-cart.com/.
2.            No campo “Procurar Produtos” pesquise usando o valor “Batman”.
3.            No resultado da pesquisa clique em um dos resultados apresentados.
4.            Na tela do produto pressione o botão “Adicionar ao carrinho”.
5.            Busque novamente por um produto, dessa vez por um “iPhone” e insira também no carrinho, com quantidade maior do que 1.
6.            Valide no carrinho de compras se os produtos foram adicionados com sucesso e o valor total da compra.

### Desenvolvimento:
Trata-se de um projeto Maven, elaborado na IDE Eclipse, escrito em Java, utilizando Selenium WebDriver com integração ao Cucumber.

### Instruções:
Para rodar o caso de teste automatizado, basta importar o mesmo no Eclipse, aguardar o build do projeto por parte do Maven e executar o método Main, localizado em: testDB > src/tst/java > com.test > Test.java
