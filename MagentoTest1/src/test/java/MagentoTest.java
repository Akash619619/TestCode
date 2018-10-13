import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MagentoTest {

public void posCredentials() throws Exception {

		String url = "http://www.magento.com";

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Main m = new Main(driver);
		m.clickOnMyAcc();
		Thread.sleep(3000);

		Login login = new Login(driver);
		Thread.sleep(3000);
		login.typeEmail("sucheendra.abc@gmail.com");
		Thread.sleep(3000);
		login.typePwd("Welcome123");
		Thread.sleep(3000);
		login.clickOnLogin();

		LogOut logout = new LogOut(driver);
		logout.clickOnLogOut();
		Thread.sleep(3000);

	}

}
