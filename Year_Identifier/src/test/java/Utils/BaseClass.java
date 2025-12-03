package Utils;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

//public class BaseClass {
//    public static WebDriver driver;
//    public static WebDriverWait wait;
//    public static Actions actions;
//
//    public void BrowserSetUP(){
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        actions = new Actions(driver);
//    }
//
//    @AfterClass
//    public void TearDown(){
//        driver.quit();
//    }
//}
