package X;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testtitlegoogle {

	
	@Test
	public void getTitle() throws MalformedURLException {
		MutableCapabilities cap=new MutableCapabilities();
		
		WebDriver driver=new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),cap);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
