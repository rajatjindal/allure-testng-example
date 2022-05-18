package compumizer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestNgTest {
  @Test
  public void testHomePageHasAHeader() throws MalformedURLException {


    FirefoxOptions firefoxOptions = new FirefoxOptions();
    WebDriver driver = new RemoteWebDriver(new URL("http://selenium:4444"), firefoxOptions);

    driver.navigate().to("https://www.google.com");

    Assert.assertTrue("Google".equals(driver.getTitle()));

    driver.close();
  }
}
