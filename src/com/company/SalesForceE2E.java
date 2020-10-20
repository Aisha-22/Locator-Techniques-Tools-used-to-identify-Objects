package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForceE2E {

    public void salesforceE2e() {

        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://rediff.com");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //Css
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Im here"); //Xpath
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("My first try"); //[attribute='value'] - css
        driver.findElement(By.xpath("//input[@name='proceed']")).click(); // Xpath

    }
}
