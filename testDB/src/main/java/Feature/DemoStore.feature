# language: pt
Funcionalidade: compras

  Contexto: 
    Dado que estou na tela inicial do Demo Store

  @efetuarLogin
  Cenario: adicionar produtos ao carrinho de compras
    Quando meu carrinho esta vazio
    E pesquiso um produto
      | produto |
      | Batman  |
    E clico em um produto
    E clico em Adicionar ao Carrinho
    E clico em Continuar Compras
    E pesquiso um produto
      | produto |
      | iPhone  |
    E clico em um produto
    E aumento a quantidade do produto
      | quantidade |
      |          2 |
    E clico em Adicionar ao Carrinho
    E clico em Checkout
    Entao sistema exibe a pagina de checkout contendo todos meus produtos
