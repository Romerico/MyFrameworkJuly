package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends BaseTest{

    CheckboxPage checkboxesPage;

    @BeforeMethod
    public void goToTargetPage() {
        setUp();
        checkboxesPage = new CheckboxPage(driver);
        checkboxesPage.goToCheckboxPage();
    }

    @AfterMethod
    public void closingActivity() {
        tearDown();
    }


    @Test
    public void isChecked(){

        System.out.println(checkboxesPage.isCheckboxChecked());

    }

    @Test

    public void deSelect(){

    }
}
