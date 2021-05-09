package com.Pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


import java.util.List;



public class LoginPage  {


        public AppiumDriver<MobileElement> driver;

        public LoginPage(AppiumDriver driver) {
            this.driver = driver;

        }



        public void hesabımaTıkla() throws InterruptedException {

            Thread.sleep(8000);
            List<MobileElement> els1 = driver.findElementsById("trendyol.com:id/buttonSelectGenderMan");
            els1.get(0).click();

            Thread.sleep(5000);
            List<MobileElement> els2 = driver.findElementsById("trendyol.com:id/tab_account");
            els2.get(0).click();
        }

        public void hesapBilgileriniGir() throws InterruptedException {
            Thread.sleep(5000);
            List<MobileElement> els4 = driver.findElementsById("trendyol.com:id/editTextEmail");
            els4.get(0).sendKeys("denemetesttest5@gmail.com");


            List<MobileElement> els5 = driver.findElementsById("trendyol.com:id/editTextPassword");
            els5.get(0).sendKeys("denemedeneme555");


            List<MobileElement> els6 = driver.findElementsById("trendyol.com:id/buttonLogin");
            els6.get(0).click();
        }

}
