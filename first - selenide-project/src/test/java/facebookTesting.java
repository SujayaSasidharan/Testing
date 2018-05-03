
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selectors.*;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;
    public class facebookTesting {

        @Rule
        public ScreenShooter photos = ScreenShooter.failedTests().succeededTests();


        @Before
        public void openThePageToTheTest() {
            Configuration.browser = "chrome";
            System.setProperty("selenide.browser", "Chrome");
            System.setProperty("webdriver.chrome.driver", "D:\\selenium Browsers\\chromedriver_win32\\chromedriver.exe");
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void testFacebookPage() {

            // launching  facebook page

            open("http://facebook.com");

            SelenideElement emilid = $(By.name("email"));

            if (emilid==null) {
                // testing of username and password
                $(By.name("email")).setValue("suja@gmail.com");
                $(By.name("pass")).setValue("12345678");
                $(By.id("loginbutton")).click();
            } else {
                // creating new account
                $(By.name("firstname")).setValue("XYZ");
                $(By.name("lastname")).setValue("PQR");
                $(By.name("reg_email__")).setValue("12345");
                $(By.name("reg_passwd__")).setValue("XXXXX");

                $(By.id("day")).selectOptionByValue("4");

                $(By.id("month")).selectOptionByValue("12");

                $(By.id("year")).selectOptionByValue("2012");

                $(By.name("sex")).selectRadio("2");
                $(By.name("websubmit")).click();






            }

        }
    }


