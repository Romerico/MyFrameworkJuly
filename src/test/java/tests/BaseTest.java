package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {


    WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roman Yarmolenko\\IdeaProjects\\MyFrameworkJuly\\src\\main\\chromedriver.exe");
        driver = new ChromeDriver();


    }
    public void tearDown() {
        driver.quit();
    }

}