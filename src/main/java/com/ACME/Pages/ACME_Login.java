package com.ACME.Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ACME_Login {
	@Test

	public void LoginAuth() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		String baseURL = "https://acme-test.uipath.com/login";
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testotest2025@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@2025");

		driver.findElement(By.xpath("//body//button//following::div[5]//button")).click();

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg dropdown-toggle'])[4]")).click();
		driver.findElement(By.linkText("Add Vendor")).click();
		
		driver.findElement(By.id("vendorTaxId")).sendKeys("RO212121");
		driver.findElement(By.id("name")).sendKeys("Krishna");
		
		driver.findElement(By.id("address")).sendKeys("Chennai");
		driver.findElement(By.id("city")).sendKeys("Medavakkam");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("addVendor")).click();
		
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		    System.out.println("alert was not present");
		else
		    System.out.println("alert was present");
		    Alert alt = driver.switchTo().alert();
		    alt.accept();
		
	    
		
	}

}
