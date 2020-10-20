package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.company.Ferd;
import com.company.SalesForce;
import com.company.FaceBook;
import com.company.FacebookXpath;
import com.company.SalesForceE2E;

public class Main {

//    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Aisha");

        Ferd ferd = new Ferd();

//        ferd.facebook();

        SalesForce salesForce = new SalesForce();

//        salesForce.sales();

        FaceBook faceBook = new FaceBook();

//        faceBook.runFacebook();

        FacebookXpath facebookXpath = new FacebookXpath();

//        facebookXpath.facebookPaths();

        SalesForceE2E salesForceE2E = new SalesForceE2E();

        salesForceE2E.salesforceE2e();

    }
}
