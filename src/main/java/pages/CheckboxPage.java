package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckboxPage  extends BasePage {


    //const
    public CheckboxPage(WebDriver driver) {

        super(driver);
    }

    public void goToCheckboxPage() {
        driver.get("http://leafground.com/pages/checkbox.html");
    }


    //locators

    By checkboxChecked = By.xpath("//label[contains(text(),'Selenium')]//following-sibling::input");
    By deSelectCheckboxChecked = By.xpath("//label[contains(text(),'DeSelect')]//following-sibling::input");


    //methods
    public boolean isCheckboxChecked() {

        return driver.findElement(checkboxChecked).isEnabled();

    }

    public void deSelectChecked() {

//        List<WebElement> checkBoxes = driver.findElements(deSelectCheckboxChecked);
//        Map<Boolean, WebElement> items = new HashMap<>();
//        for (int i = 0; i < checkBoxes.size(); i++) {
//            if (checkBoxes.get(i).isSelected()) {
//                items.add(i);
            }

        }
    }
}


