package com.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.pages.*;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DemoStoreSteps {

	final double valorDefinidoBatman = 59.99;
	final double valorDefinidoIphone = 499.99;
	int quantidadeProduto;

	double valorCapturadoBatman;
	double valorCapturadoIphone;

	@Dado("que estou na tela inicial do Demo Store")
	public void acessarPaginaHome() {
		System.out.println("> Acessando Demo Store");
		HomePage homePage = new HomePage();
		homePage.acessarTelaInicial();
	}

	@Quando("meu carrinho esta vazio")
	public void verificarCarrinhoVazio() {
		System.out.println("> Verificando se o carrinho esta vazio");
		HomePage homePage = new HomePage();
		String carrinho = homePage.getTextoCarrinho();
		// System.out.println(carrinho);
		assertEquals("Carrinho nao esta vazio", "Carrinho vazio", carrinho);
	}

	@E("pesquiso um produto")
	public void informarProduto(DataTable produto) {
		System.out.println("> Preenchendo produto no campo de busca");
		List<Map<String, String>> data = produto.asMaps(String.class, String.class);
		HomePage homePage = new HomePage();
		homePage.preencherCampoDeProcura(data.get(0).get("produto"));
	}

	@E("clico em um produto")
	public void clicarNoProduto() {
		System.out.println("> Clicando no produto");
		ResultsPage resultsPage = new ResultsPage();

		if (valorCapturadoBatman == 0) {// para quando metodo eh chamado na primeira vez (batman)
			valorCapturadoBatman = Double.parseDouble(resultsPage.getValor());
			boolean valoresIguaisBatman = (valorDefinidoBatman == valorCapturadoBatman);
			if (!valoresIguaisBatman) {
				System.out.println(valorDefinidoBatman + "!=" + valorCapturadoBatman);
			}
			assertTrue("O valor definido para o produto Batman nao confere com o do sistema", valoresIguaisBatman);

		} else { // para quando metodo eh chamado na segunda vez (iphone)
			valorCapturadoIphone = Double.parseDouble(resultsPage.getValor());
			boolean valoresIguaisIphone = (valorDefinidoIphone == valorCapturadoIphone);
			if (!valoresIguaisIphone) {
				System.out.println(valorDefinidoIphone + "!=" + valorCapturadoIphone);
			}
			assertTrue("O valor definido para o produto iPhone nao confere com o do sistema", valoresIguaisIphone);
		}

		resultsPage.clicarProduto();

	}

	@E("clico em Adicionar ao Carrinho")
	public void clicarAdicionarAoCarrinho() {
		System.out.println("> Clicando em Adicionar ao Carrinho");
		ProductPage productPage = new ProductPage();
		productPage.clicarAdicionarAoCarrinho();
	}

	@E("clico em Continuar Compras")
	public void clicarContinuarCompras() {
		System.out.println("> Clicando em Continuar Compras");
		ProductPage productPage = new ProductPage();
		productPage.clicarContinuarCompras();
	}

	@E("aumento a quantidade do produto")
	public void aumentarQuantidade(DataTable quantidade) {
		System.out.println("> Aumentando a quantidade do produto");
		ProductPage productPage = new ProductPage();
		List<Map<String, String>> data = quantidade.asMaps(String.class, String.class);
		quantidadeProduto = Integer.parseInt(data.get(0).get("quantidade"));
		productPage.aumentarQuantidade(data.get(0).get("quantidade"));
	}

	@E("clico em Checkout")
	public void clicarCheckout() {
		System.out.println("> Clicando em Checkout");
		ProductPage productPage = new ProductPage();
		productPage.clicarCheckout();
	}

	@Entao("sistema exibe a pagina de checkout contendo todos meus produtos")
	public void exibirCarrinho() {
		System.out.println("> Exibindo pagina de checkout");
		CheckoutPage checkoutPage = new CheckoutPage();

		double totalDefinido = valorDefinidoBatman + (quantidadeProduto * valorDefinidoIphone);
		double totalCheckout = Double.parseDouble(checkoutPage.getTextoLabelTotal().replaceAll(Pattern.quote(","), ""));
		// replaceAll(Pattern.quote(","), "") tirar virgula da string;

		boolean totalEstaCerto = (totalDefinido == totalCheckout);
		if (!totalEstaCerto) {
			System.out.println(totalDefinido + "!=" + totalCheckout);
		}
		assertTrue("O valor total calculado nao esta conforme esperado", totalEstaCerto);

		ArrayList<String> produtos = new ArrayList<String>();
		produtos.add(checkoutPage.getTextoLabelProduto(1));
		produtos.add(checkoutPage.getTextoLabelProduto(2));

		boolean contemProdutoBatman = false;
		boolean contemProdutoIphone = false;

		for (String stringProduto : produtos) {
			if (stringProduto.contains("Batman")) {
				contemProdutoBatman = true;
			}

			if (stringProduto.contains("iPhone")) {
				contemProdutoIphone = true;
			}

		}

		assertTrue("Nenhum produto do carrinho contem a substring: Batman", contemProdutoBatman);
		assertTrue("Nenhum produto do carrinho contem a substring: iPhone", contemProdutoIphone);

	}

}
