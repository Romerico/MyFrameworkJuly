package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {
    //const
    public DropDownPage(WebDriver driver){
        super(driver);
    }
    public void goToDropDownPage(){
        driver.get("http://www.leafground.com/pages/Dropdown.html");
    }

    //locators
    By textDropdownLocator = By.xpath(("(//select/option[text() = 'Selenium'])[2]//parent::select"));
    By valueDropdownLocator = By.xpath("//select[@id='dropdown3']");


    //methods
    public void selectAnOptionUsingText(String text){
        WebElement optionDropdownLocator = driver.findElement(textDropdownLocator);
        Select select = new Select(optionDropdownLocator);
        select.selectByVisibleText(text);

    }

    public void selectAnOptionUsingValue(int option){
        WebElement selectDropdownLocator = driver.findElement(valueDropdownLocator);
        Select select = new Select(selectDropdownLocator);
        select.selectByValue("1");
    }



}
