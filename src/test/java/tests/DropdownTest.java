package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.Collections;

public class DropdownTest extends BaseTest{

    DropDownPage dropDownPage;

    @BeforeMethod
    public void goToTargetPage(){
        setUp();
        dropDownPage = new DropDownPage(driver);
        dropDownPage.goToDropDownPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

@Test
    public void selectAnOptionUsingTextTest(){

        dropDownPage.selectAnOptionUsingText("Selenium");
}

@Test
    public void selectAnOptionUsingValueTest(){

        dropDownPage.selectAnOptionUsingValue(1);
}



}
