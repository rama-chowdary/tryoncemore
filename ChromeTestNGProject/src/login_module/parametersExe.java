package login_module;

import org.openqa.selenium.chrome.ChromeDriver;

/*import java.util.concurrent.TimeUnit;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersExe {
	@Parameters({"url","expectedtitle","mailid","pwdtxt"})
  @Test (groups = "Smoke")
  public void maillog(String amazonurl,String exptitle,String mail,String pwd) {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get(amazonurl);
	  driver.manage().window().maximize();
	  
		 String exptitle1 = exptitle; 
		/* String actualtitle = driver.getTitle();*/
	  Assert.assertEquals(driver.getTitle(), exptitle1);
	  WebElement ele = driver.findElement(By.id("nav-link-accountList"));
	  ele.click();
	  WebElement mailinput = driver.findElement(By.xpath(".//input[@name='email']"));
	  mailinput.sendKeys(mail);
	  driver.findElement(By.cssSelector("[id='continue'] [class='a-button-input']")).click();
	  WebElement pwdele = driver.findElement(By.xpath(".//input[@name='password']"));
	  pwdele.sendKeys(pwd);
	  WebElement signedinele = driver.findElement(By.id("signInSubmit"));
	  signedinele.click();
  }
}
