package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenShot {
	private WebDriver driver;

	public CaptureScreenShot(WebDriver driver) {
		this.driver = driver;
	}

	public void captureScreenShot(String nameObj) throws IOException {
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("Screenshots\\" + nameObj + "" + getTimeStampValue() + ".png"));
		} catch (Exception e) {
			System.out.println("Exce��o na execu��o do screenshot: " + e.getMessage());
		}
	}

	public String getTimeStampValue() throws IOException {
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timestamp = time.toString();
		String systime = timestamp.replace(":", "-");
		return systime;
	}
}
