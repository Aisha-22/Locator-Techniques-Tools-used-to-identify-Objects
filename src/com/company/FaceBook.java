package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

    public void runFacebook() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");

        driver.findElement(By.cssSelector("#email")).sendKeys("aishah@caxton.co.za");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id='u_0_a']/div[3]/a")).click();


    }
}
