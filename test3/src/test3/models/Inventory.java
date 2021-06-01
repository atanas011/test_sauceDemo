package test3.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Inventory {

	public static final String URL = "https://www.saucedemo.com/inventory.html";
	private static final String SORT_XPATH = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select";
	// proveri sta je iskopirao (dodaje \\) !!!
	
	public static void sortByPrice(WebDriver driver) {
		driver.findElement(By.xpath(SORT_XPATH)).click();
		Select drpSelect = new Select(driver.findElement(By.xpath(SORT_XPATH)));
		drpSelect.selectByVisibleText("Price (low to high)");
	}
}
