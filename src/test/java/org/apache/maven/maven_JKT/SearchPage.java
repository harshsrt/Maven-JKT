package org.apache.maven.maven_JKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	private static WebElement element = null;

	// Enter origin
	public static void EnterOrigin(WebDriver driver) {

		element = driver.findElement(By.id("from.text"));
		element.sendKeys("London");
		element.sendKeys(Keys.TAB);

	}

	// Enter destination
	public static void EnterDestination(WebDriver driver) {

		element = driver.findElement(By.id("to.text"));
		element.sendKeys("Manchester");
		element.sendKeys(Keys.ENTER);

	}

	// Click on submit button
	public static void ClickSubmitButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[1]/div/div/div[1]/section/form/div[5]/button")));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click(element).build().perform();
	}

	// Select passenger
	public static void SelectPassenger(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("passenger-summary-btn")));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click().build().perform();
		Select child = new Select(driver.findElement(By.name("children")));
		child.selectByValue("1");
	}

	// Click on done button
	public static void ClickDoneButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[1]/div/div/div[1]/section/form/div[4]/div/div/button")));
		Actions ob = new Actions(driver);
		ob.moveToElement(element).click().build().perform();
	}

}
