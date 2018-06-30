package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.elements.CheckoutPageElements;
import com.setup.TestRule;

public class CheckoutPage extends CheckoutPageElements {

	public CheckoutPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public String getTextoLabelTotal() {
		esperaElemento(LABEL_TOTAL);
		return LABEL_TOTAL.getText();
	}

	public String getTextoLabelProduto(int posicaoNaLista) {
		if (posicaoNaLista == 1) {
			esperaElemento(LABEL_PRODUTO_1);
			return LABEL_PRODUTO_1.getText();
		}
		if (posicaoNaLista == 2) {
			esperaElemento(LABEL_PRODUTO_2);
			return LABEL_PRODUTO_2.getText();
		}
		return "";
	}

}
