package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utils.SeleniumUtils;

public class HomePageElements extends SeleniumUtils {

	public static WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sw_dropdown_8\"]/a/span/span[2]")
	public WebElement LABEL_CARRINHO;

	@FindBy(how = How.ID, using = "search_input")
	public WebElement TEXTFIELD_PROCURAR;
}
