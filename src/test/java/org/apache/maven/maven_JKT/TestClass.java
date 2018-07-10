package org.apache.maven.maven_JKT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.maven.maven_JKT.SearchPage;
import org.apache.maven.maven_JKT.CheckoutPage;
import org.apache.maven.maven_JKT.MatrixPage;

public class TestClass {
	private WebDriver driver;

	@Test(priority = 0)

	public void VerifyPaybleAmount() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.thetrainline.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SearchPage.EnterOrigin(driver);
		SearchPage.EnterDestination(driver);
		SearchPage.ClickSubmitButton(driver);

		MatrixPage.CheckFirstClassTicket(driver);
		String s = MatrixPage.PaybleAmount(driver);
		MatrixPage.ClickOnQuickBuyButton(driver);
		MatrixPage.CustomerTypeSelection(driver);
		MatrixPage.EnterEmail(driver);
		MatrixPage.ClickContinue(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(s, CheckoutPage.PaybleAmount(driver));
		driver.close();
	}

	@Test(priority = 2)

	public static void VerifyChildTicket() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.thetrainline.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SearchPage.EnterOrigin(driver);
		SearchPage.EnterDestination(driver);
		SearchPage.SelectPassenger(driver);
		SearchPage.ClickDoneButton(driver);
		SearchPage.ClickSubmitButton(driver);

		MatrixPage.CheckFirstClassTicket(driver);
		String s = MatrixPage.PaybleAmount(driver);
		MatrixPage.ClickOnQuickBuyButton(driver);
		MatrixPage.CustomerTypeSelection(driver);
		MatrixPage.EnterEmail(driver);
		MatrixPage.ClickContinue(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(s, CheckoutPage.PaybleAmount(driver));
		String t = CheckoutPage.PassengerDetail(driver);
		Assert.assertTrue(CheckoutPage.PassengerDetail(driver).contains("child"));
		driver.close();
	}
}
