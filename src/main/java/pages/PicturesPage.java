package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PicturesPage extends BasePage{
    //const

    public PicturesPage(WebDriver driver) {
        super(driver);
    }
    public void goToPicturesPage() {
        driver.get("http://www.leafground.com/pages/Image.html");
    }

    //locators

    By brokenPic = By.xpath("//img[@src='../images/abcd.jpg']");
    By hitPic = By.xpath("//img[@src='../images/keyboard.png']");
    By clickPic = By.xpath("//img[@src='../images/home.png']");


    //methods



    public String getTitle(){
        return driver.getTitle();
    }

    public void setClickPic(){
        driver.findElement(clickPic).click();

    }

    public void hitThePic(){
        driver.findElement(hitPic).sendKeys(Keys.ENTER);
    }

    public String getSRCValueOfBrokenPic() {
        return driver.findElement(brokenPic).getAttribute("src");
    }






}
