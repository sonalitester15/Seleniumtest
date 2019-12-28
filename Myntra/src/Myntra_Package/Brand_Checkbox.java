package Myntra_Package;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brand_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette",
				"C://Users//SHARMILA//Desktop//selenium-java-3.141.59//Drivers//geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.myntra.com/men-tshirts");
		WebElement Brand_checkbox=Driver.findElement(By.xpath("//ul[@class='brand-list']"));
		List<WebElement> allbrandmenu=Driver.findElements(By.xpath("//ul[@class='brand-list']//li//label[@class='vertical-filters-label common-customCheckbox']//input[@type='checkbox']"));
	for (int i =0;i<allbrandmenu.size();i++)
		{
			WebElement element=allbrandmenu.get(i);
			String inrhtml=element.getAttribute("innerHTML");
			System.out.println(inrhtml);
			if(inrhtml.contentEquals("WROGN"))
			{
				element.click();
				break;
		
	}
			Thread.sleep(10000);

		}
	}
}
