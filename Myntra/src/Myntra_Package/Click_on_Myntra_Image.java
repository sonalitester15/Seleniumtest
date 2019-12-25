package Myntra_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_on_Myntra_Image {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.firefox.marionette",
				"C://Users//SHARMILA//Desktop//selenium-java-3.141.59//Drivers//geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
	
		Driver.get("https://www.myntra.com/");
	String Title=Driver.getTitle();
	System.out.println(Title);
Driver.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")).click();
String imagelink=Driver.getTitle();
System.out.println(imagelink);


	}

}
