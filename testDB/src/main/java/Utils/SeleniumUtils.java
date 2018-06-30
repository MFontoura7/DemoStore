package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.setup.TestRule;

public class SeleniumUtils {
	public static WebDriver driver;

	public SeleniumUtils() {
		driver = TestRule.getDriver();
	}

	public void esperaElemento(WebElement elemento) {
		WebDriverWait wait = new WebDriverWait(driver, 15);// original 15
		// WebElement element =
		// wait.until(ExpectedConditions.elementToBeClickable(elemento));
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

}
