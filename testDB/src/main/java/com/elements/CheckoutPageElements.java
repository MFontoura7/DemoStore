package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utils.SeleniumUtils;

public class CheckoutPageElements extends SeleniumUtils {

	public static WebDriver driver;

	@FindBy(how = How.CSS, using = "#checkout_info_summary_41 > table > tbody:nth-child(1) > tr:nth-child(1) > td.ty-checkout-summary__item.ty-right > span > bdi > span")
	public WebElement LABEL_TOTAL;

	@FindBy(how = How.CSS, using = "#checkout_info_summary_41 > table > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")
	public WebElement LABEL_QUANTIDADE_PRODUTOS;

	@FindBy(how = How.CSS, using = "#checkout_info_products_42 > ul > li:nth-child(1) > bdi > a")
	public WebElement LABEL_PRODUTO_1;

	@FindBy(how = How.CSS, using = "#checkout_info_products_42 > ul > li:nth-child(2) > bdi > a")
	public WebElement LABEL_PRODUTO_2;

}
