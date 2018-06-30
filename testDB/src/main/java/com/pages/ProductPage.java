package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.elements.ProductPageElements;
import com.setup.TestRule;

public class ProductPage extends ProductPageElements {

	public ProductPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void clicarAdicionarAoCarrinho() {
		esperaElemento(BUTTON_ADICIONAR);
		BUTTON_ADICIONAR.click();
	}

	public void clicarContinuarCompras() {
		esperaElemento(BUTTON_CONTINUAR_COMPRAS);
		BUTTON_CONTINUAR_COMPRAS.click();
	}

	public void aumentarQuantidade(String quantidade) {
		esperaElemento(TEXTFIELD_QUANTIDADE);
		TEXTFIELD_QUANTIDADE.clear();
		TEXTFIELD_QUANTIDADE.sendKeys(quantidade);
	}

	public void clicarCheckout() {
		esperaElemento(BUTTON_CHECKOUT);
		BUTTON_CHECKOUT.click();
	}

}
