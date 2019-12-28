package Myntra_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class click_on_Earn_cash {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C://Users//SHARMILA//Desktop//selenium-java-3.141.59//Drivers//geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
	
		Driver.get("https://www.myntra.com/");
		Driver.findElement(By.xpath("//span[@class='referrals-banner-extra-button-padding']")).click();
		Driver.findElement(By.xpath("//div[@class='copyCta']")).click();
		Driver.findElement(By.xpath("//button[@class='login-facebook login-button']")).click();
		
		/*String Title=Driver.getTitle();
		System.out.println(Title);
		Driver.findElement(By.xpath("//a[@href='https://www.myntra.com/tac']")).click();
		Driver.navigate().back();*/
		
		

	}

}
