package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.elements.ResultsPageElements;
import com.setup.TestRule;

public class ResultsPage extends ResultsPageElements {

	public ResultsPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void clicarProduto() {
		esperaElemento(BUTTON_PRODUTO);
		BUTTON_PRODUTO.click();
	}

	public String getValor() {
		esperaElemento(LABEL_VALOR);
		return LABEL_VALOR.getText();
	}

}
