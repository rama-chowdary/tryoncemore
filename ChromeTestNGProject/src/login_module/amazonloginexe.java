package login_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class amazonloginexe {
	@Parameters("url")
  @Test 
  public void amazonexe(String urlnew) {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get(urlnew);
	  WebElement ele = driver.findElement(By.id("nav-link-accountList"));
	  ele.click();
	  WebElement mailinput = driver.findElement(By.xpath(".//input[@name='email']"));
	  mailinput.sendKeys("rama.tulluri96@gmail.com");
	  driver.findElement(By.cssSelector("[id='continue'] [class='a-button-input']")).click();
	  WebElement pwdele = driver.findElement(By.xpath(".//input[@name='password']"));
	  pwdele.sendKeys("ramaamazon");
	  WebElement signedinele = driver.findElement(By.id("signInSubmit"));
	  signedinele.click();
	  driver.close();
  }
}

