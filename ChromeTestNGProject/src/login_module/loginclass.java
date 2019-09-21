package login_module;

/*import java.util.concurrent.TimeUnit;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
/*import org.openqa.selenium.interactions.Actions;*/
/*import org.openqa.selenium.support.ui.WebDriverWait;*/
import org.testng.annotations.Test;

public class loginclass {
	WebDriver driverobj = new ChromeDriver();

	/* public static WebDriver driverobj; */
  @Test (groups = "Smoke")
  public void loginmethod() {
	   
	   driverobj.manage().window().maximize();
	  driverobj.get("http://www.amazon.in");
  }
		/* Actions act = new Actions(driverobj); */
		/* driverobj.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS); */
  @Test (groups = "Smoke")
  public void titlecheck() {
	  
	  String actualtitles = driverobj.getTitle();
	  String expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  Assert.assertEquals(actualtitle, expectedtitle);
	  
	  
  }
  @Test  (groups= "Smoke" , dependsOnMethods = "titlecheck")
  public void nxtmtd() {
	  WebElement ele = driverobj.findElement(By.id("nav-link-accountList"));
		/* act.moveToElement(ele).perform(); */
	  ele.click();
		/*
		 * WebElement signele =
		 * driverobj.findElement(By.xpath(".//*[text()='Sign in']")); signele.click();
		 */
	  WebElement mailinput = driverobj.findElement(By.xpath(".//input[@name='email']"));
	  mailinput.sendKeys("rama.tulluri96@gmail.com");
	  driverobj.findElement(By.cssSelector("[id='continue'] [class='a-button-input']")).click();
	  WebElement pwdele = driverobj.findElement(By.xpath(".//input[@name='password']"));
	  pwdele.sendKeys("ramaamazon");
	  WebElement signedinele = driverobj.findElement(By.id("signInSubmit"));
	  signedinele.click();
  }
  }

