package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utils.SeleniumUtils;

public class ResultsPageElements extends SeleniumUtils {

	public static WebDriver driver;

	@FindAll({ @FindBy(how = How.ID, using = "det_img_94"), @FindBy(how = How.ID, using = "det_img_238") })
	public WebElement BUTTON_PRODUTO;

	@FindAll({ @FindBy(how = How.ID, using = "sec_discounted_price_94"),
			@FindBy(how = How.ID, using = "sec_discounted_price_238") })
	public WebElement LABEL_VALOR;
}
