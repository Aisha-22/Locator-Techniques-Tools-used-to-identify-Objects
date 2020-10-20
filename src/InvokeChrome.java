import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {

    public static void main(String[] args) {
        System.out.println("Cat");

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");

//        driver.findElements(By.id("w3loginbtn")).click();
    }
}
