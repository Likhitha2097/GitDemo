package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			WebDriver a = new ChromeDriver();
			a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			a.get("https://rahulshettyacademy.com/locatorspractice/");
			a.findElement(By.id("inputUsername")).sendKeys("rahul");
			a.findElement(By.name("inputPassword")).sendKeys("12345");
			a.findElement(By.className("signInBtn")).click();
			System.out.println(a.findElement(By.cssSelector("p.error")).getText());
			a.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			a.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("johny");
			a.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@dar.com");
			a.findElement(By.xpath("//input[@type='text'][2]")).clear();
			a.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@gmail.com");
			a.findElement(By.xpath("//form/input[3]")).sendKeys("9878976659");
			//if you have the class attribute-u can use class locator or css locator
			//tagname.classname or .classname
			a.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(a.findElement(By.cssSelector("form p")).getText());
			
			
			
			System.out.println(a.findElement(By.cssSelector("form p")).getText());
			
			System.out.println(a.findElement(By.cssSelector("form p")).getText());

			System.out.println(a.findElement(By.cssSelector("form p")).getText());
			
			System.out.println(a.findElement(By.cssSelector("form p")).getText());
			
			System.out.println(a.findElement(By.cssSelector("form p")).getText());




			a.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			Thread.sleep(1000);
			a.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
			//locator using regular expression through css selector
		    a.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			a.findElement(By.id("chkboxOne")).click();
			//locator using regular expression through xpath
			a.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
			
			
			
			
			a.findElement(By.id("chkboxOne")).click();
			//locator using regular expression through xpath
			a.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


		}

	

	}


