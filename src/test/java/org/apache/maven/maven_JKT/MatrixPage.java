package org.apache.maven.maven_JKT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MatrixPage {

	private static WebElement element = null;

	// Click on first class ticket
	public static void CheckFirstClassTicket(WebDriver driver) {

		// element = driver.findElement(By.xpath(
		// "//*[@id=\"app\"]/div/div[1]/main/div[2]/div[1]/div/div/div[2]/div[3]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/ul/li[1]"));
		// element.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@id=\"app\"]/div/div[1]/main/div[2]/div[1]/div/div/div[2]/div[3]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/ul/li[1]")));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click().build().perform();
	}

	// Click on continue button
	public static void ClickOnQuickBuyButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@id=\"app\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/button[2]")));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click(element).build().perform();
	}

	// Click on continue button after preferences
	public static void CustomerTypeSelection(WebDriver driver) {
		element = driver.findElement(By.id("isGuest"));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click(element).build().perform();
	}

	// Click on continue button after preferences
	public static void EnterEmail(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		element.sendKeys("harsh.harsh17@gmail.com");
	}
	
	// Click on continue button after preferences
	public static void ClickContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div/div[1]/main/div[2]/div/div/div/div/div/div/form/div[4]/button"));
		Actions ob = new Actions(driver);
		ob.click(element).build().perform();
	}
	
	// Returns payble amount
	public static String PaybleAmount(WebDriver driver) {

//		element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[1]/h3/span[2]/span/span"));
//		return element.getText();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div/div[1]/main/div[2]/div[1]/div/div/div[2]/div[3]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/ul/li[1]/label/span[2]"));
		return element.getText();
	}

}
