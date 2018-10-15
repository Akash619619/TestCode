package com.abc.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObjects.LogOut;
import com.abc.magentoObjects.Login;
import com.abc.magentoObjects.Main;

public class MagentoApp {

	public static void main(String[] args) {
		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Main m = new Main(driver);
		m.clickOnMyAccount();
		Login l1 = new Login(driver);
		l1.typeEmail("subramanyaraj87@gmail.com");
		l1.typePwd("Welcome123");
		l1.clickOnLogin();

		LogOut l2 = new LogOut(driver);
		l2.clickOnLogOut();
		driver.quit();

	}

}
