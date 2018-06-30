package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utils.SeleniumUtils;

public class ProductPageElements extends SeleniumUtils {

	public static WebDriver driver;

	@FindAll({ @FindBy(how = How.ID, using = "button_cart_94"), @FindBy(how = How.ID, using = "button_cart_238") })
	public WebElement BUTTON_ADICIONAR;

	@FindAll({ @FindBy(how = How.XPATH, using = "/html/body/div[7]/div/div[2]/div[1]/a"),
			@FindBy(how = How.XPATH, using = "/html/body/div[8]/div/div[2]/div[1]/a") })
	public WebElement BUTTON_CONTINUAR_COMPRAS;

	@FindAll({ @FindBy(how = How.ID, using = "qty_count_94"), @FindBy(how = How.ID, using = "qty_count_238") })
	public WebElement TEXTFIELD_QUANTIDADE;

	@FindAll({ @FindBy(how = How.XPATH, using = "/html/body/div[8]/div/div[2]/div[2]/a"),
			@FindBy(how = How.CSS, using = "body > div.cm-notification-content.cm-notification-content-extended.notification-content-extended.cm-auto-hide > div > div.ty-product-notification__buttons.clearfix > div.ty-float-right > a") })
	public WebElement BUTTON_CHECKOUT;
}
