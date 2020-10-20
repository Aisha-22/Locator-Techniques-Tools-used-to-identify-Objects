package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SalesForce {

//    static WebDriver driver = new ChromeDriver();

    public void sales() {
        // write your code here


//        chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        These are the actions
        driver.get("https://login.salesforce.com/"); //Opens URL in the browser
        driver.findElement(By.id("username")).sendKeys("Aisha_22");
        driver.findElement(By.name("pw")).sendKeys("2323");
//        driver.findElement(By.className("button r4 wide primary")).click(); // If there is space in the class: Compound class names not permitted in Selenium.
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

    }
}
