package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.elements.HomePageElements;
import com.setup.TestRule;

public class HomePage extends HomePageElements {

	public HomePage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarTelaInicial() {
		String url = "http://demo.cs-cart.com/";

		System.out.println("Pagina: " + url);
		driver.navigate().to(url);
	}

	public String getTextoCarrinho() {
		return LABEL_CARRINHO.getText();
	}

	public void preencherCampoDeProcura(String produto) {
		TEXTFIELD_PROCURAR.sendKeys(produto);
		TEXTFIELD_PROCURAR.sendKeys(Keys.ENTER);
	}

	public void clicarTextoCarrinho() {
		LABEL_CARRINHO.click();
	}

}
