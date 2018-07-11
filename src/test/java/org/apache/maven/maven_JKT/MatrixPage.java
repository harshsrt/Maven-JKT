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
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@id=\"app\"]/div/div[1]/main/div[2]/div[1]/div/div/div[2]/div[3]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/ul/li[1]")));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click().build().perform();
	}

	// Click on quick buy button
	public static void ClickOnQuickBuyButton(WebDriver driver) {
		String buttonText = "Quick buy ticket";
		String string = String.format("//button[contains(.,'%s')]", buttonText);
		element = driver.findElement(By.xpath(string));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elementWait = wait.until(ExpectedConditions.elementToBeClickable(element));
		Actions ob = new Actions(driver);
		ob.moveToElement(elementWait).click().build().perform();
	}

	// Click on customer selection
	public static void CustomerTypeSelection(WebDriver driver) {
		element = driver.findElement(By.id("isGuest"));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click(element).build().perform();
	}

	// Enter email
	public static void EnterEmail(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		element.sendKeys("harsh.harsh17@gmail.com");
	}
	
	// Click on continue button after preferences
	public static void ClickContinue(WebDriver driver) {
		String buttonText = "Continue";
		String string = String.format("//button[contains(.,'%s')]", buttonText);
		element = driver.findElement(By.xpath(string));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elementWait = wait.until(ExpectedConditions.elementToBeClickable(element));
		Actions ob = new Actions(driver);
		ob.moveToElement(elementWait).click().build().perform();
	}
	
	// Returns payable amount
	public static String PayableAmount(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div/div[1]/main/div[2]/div[1]/div/div/div[2]/div[3]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/ul/li[1]/label/span[2]"));
		return element.getText();
	}

}
