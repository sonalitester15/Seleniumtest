package Myntra_Package;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class TestNG_Grouping {
	
  @Test(groups={"sonali"})
  public void sonali(){
	  System.out.println("I am sonali");
  }
	  @Test (groups={"Sitansu","sonali"})
	 public void sonali_sitansu(){
		  System.out.println("I am both sonali and sitansu ");	  
  }
	  @Test (groups={"Sitansu"})
		 public void sitansu(){
			  System.out.println("I am  sitansu ");
			  
}
	  @Test ()
		 public void no(){
			  System.out.println("I am no one ");
}
}
