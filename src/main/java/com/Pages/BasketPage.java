package com.Pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


import java.util.List;

public class BasketPage {

    public AppiumDriver<MobileElement> driver;

    public BasketPage(AppiumDriver driver) {

        this.driver = driver;

    }

    public void urunSayisiniArttirma() throws InterruptedException {
        Thread.sleep(5000);
        List<MobileElement> els18 = driver.findElementsById("trendyol.com:id/layoutBasketItemAmountPicker");
        els18.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els19 = driver.findElementsByXPath("//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]");
        els19.get(0).click();


    }

    public void urunuSilme() throws InterruptedException {

        Thread.sleep(5000);
        List<MobileElement> els20 = driver.findElementsById("trendyol.com:id/imageViewDeleteProduct");
        els20.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els21 = driver.findElementsById("trendyol.com:id/textViewBasketRemoveAction");
        els21.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els22 = driver.findElementsById("trendyol.com:id/tab_account");
        els22.get(0).click();
    }

    public void hesaptanCıkısYapma() throws InterruptedException {

        Thread.sleep(5000);
        List<MobileElement> els23 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]");
        els23.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els24 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]");
        els24.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els25 = driver.findElementsByXPath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
        els25.get(0).click();

    }
}
