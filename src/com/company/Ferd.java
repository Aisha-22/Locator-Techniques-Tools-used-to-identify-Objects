package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ferd {

    public void facebook() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com"); //Opens URL in the browser
        driver.findElement(By.id("email")).sendKeys("aishah@caxton.co.za"); //The method sendKeys() is not responding


//        driver.findElements(By.name("pass")).sendKeys("123456");
//        driver.findElements(By.linkText("Forgotten account?"))


//        Xpath & CSS are two different locators
        driver.findElement(By.cssSelector("#username")).sendKeys("emailaddress"); //Xpath
        driver.findElement(By.name("pass")).sendKeys("12345");

        driver.findElement(By.xpath("//*[@id='Login']")).sendKeys("password"); //CSS


    }
}
