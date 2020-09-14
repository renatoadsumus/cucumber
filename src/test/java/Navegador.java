import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navegador {

	protected static WebDriver driver;

	public static void abrir() {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALICIA\\Documents\\projeto\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
