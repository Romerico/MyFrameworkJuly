package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PicturesPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class PicturesTest extends BaseTest {

    PicturesPage picturesPage;
    @BeforeMethod
    public void goToTargetPage() {
        setUp();
        picturesPage = new PicturesPage(driver);
        picturesPage.goToPicturesPage();

    }
    @AfterMethod
    public void stopActivity() {
       tearDown();
    }

    @Test
    public void clickTheLink(){
        picturesPage.setClickPic();
        System.out.println(picturesPage.getTitle());
        String actualPage = picturesPage.getTitle();
        Assert.assertEquals(actualPage, "TestLeaf - Selenium Playground");

    }



//    @Test
//    public void hitPicTest(){
//        picturesPage.hitThePic();
//        }


    @Test
    public void brokenPicTest() {

        String hrefInStringFormat = picturesPage.getSRCValueOfBrokenPic();
        URL urlInURLFormat = null;
        try {
            urlInURLFormat = new URL(hrefInStringFormat);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection)urlInURLFormat.openConnection();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            httpURLConnection.setRequestMethod("HEAD");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
        try {
            httpURLConnection.connect();
            Assert.assertTrue(httpURLConnection.getResponseCode() >= 400);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }




}
