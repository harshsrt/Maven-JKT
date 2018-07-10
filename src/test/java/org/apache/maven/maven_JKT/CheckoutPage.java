package org.apache.maven.maven_JKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	private static WebElement element = null;

	
	// Returns payble amount
	public static String PaybleAmount(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[2]/div/div/div[3]/div[1]/section/div[1]/div/div[2]/div/div/div[1]/dl/dd[3]"));
		return element.getText();
	}

	// Returns payble amount
	public static String PassengerDetail(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[2]/div/div/div[3]/div[1]/section/div[1]/div[1]/div[2]/div/div/ul/li[2]/div/span"));
		return element.getText();
	}
}
