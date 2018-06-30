$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Feature/DemoStore.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "compras",
  "description": "",
  "id": "compras",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 2660767379,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que estou na tela inicial do Demo Store",
  "keyword": "Dado "
});
formatter.match({
  "location": "DemoStoreSteps.acessarPaginaHome()"
});
formatter.result({
  "duration": 6237599202,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "adicionar produtos ao carrinho de compras",
  "description": "",
  "id": "compras;adicionar-produtos-ao-carrinho-de-compras",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@efetuarLogin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "meu carrinho esta vazio",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "pesquiso um produto",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 11
    },
    {
      "cells": [
        "Batman"
      ],
      "line": 12
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clico em um produto",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "clico em Adicionar ao Carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clico em Continuar Compras",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "pesquiso um produto",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 17
    },
    {
      "cells": [
        "iPhone"
      ],
      "line": 18
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "clico em um produto",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "aumento a quantidade do produto",
  "rows": [
    {
      "cells": [
        "quantidade"
      ],
      "line": 21
    },
    {
      "cells": [
        "2"
      ],
      "line": 22
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "clico em Adicionar ao Carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "clico em Checkout",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "sistema exibe a pagina de checkout contendo todos meus produtos",
  "keyword": "Entao "
});
formatter.match({
  "location": "DemoStoreSteps.verificarCarrinhoVazio()"
});
formatter.result({
  "duration": 45824529,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.informarProduto(DataTable)"
});
formatter.result({
  "duration": 2716446416,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.clicarNoProduto()"
});
formatter.result({
  "duration": 2592577884,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.clicarAdicionarAoCarrinho()"
});
formatter.result({
  "duration": 150229473,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.clicarContinuarCompras()"
});
formatter.result({
  "duration": 706552641,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.informarProduto(DataTable)"
});
formatter.result({
  "duration": 1266762011,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.clicarNoProduto()"
});
formatter.result({
  "duration": 1533681094,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.aumentarQuantidade(DataTable)"
});
formatter.result({
  "duration": 186340504,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.clicarAdicionarAoCarrinho()"
});
formatter.result({
  "duration": 188631887,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.clicarCheckout()"
});
formatter.result({
  "duration": 2130357139,
  "status": "passed"
});
formatter.match({
  "location": "DemoStoreSteps.exibirCarrinho()"
});
formatter.result({
  "duration": 249770527,
  "status": "passed"
});
formatter.after({
  "duration": 922044797,
  "status": "passed"
});
});