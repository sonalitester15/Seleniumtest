package Myntra_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seccion_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette",
				"C://Users//SHARMILA//Desktop//selenium-java-3.141.59//Drivers//geckodriver.exe");
		WebDriver Driver1 = new FirefoxDriver();
		Driver1.get("https://www.myntra.com/men-tshirts");
		Thread.sleep(1000);
		WebDriver Driver2 = new FirefoxDriver();
		System.setProperty("webdriver.firefox.marionette",
				"C://Users//SHARMILA//Desktop//selenium-java-3.141.59//Drivers//geckodriver.exe");
		Driver2.get("https://www.facebook.com");
		

	}

}
