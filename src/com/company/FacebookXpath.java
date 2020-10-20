package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

    public void facebookPaths() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");

//        Syntax for Xpath: //input[@type='text'] or //*[@type='text']
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("My first xpath");
//        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
//        driver.findElement(By.xpath("//*[@name='login']")).click();

//        Syntax for Css: input[type='text'] or *[type='text'] or tagName#id(only if the element has an id) or tagName.classname
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("My own css");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("[name='login']")).click();



    }
}
