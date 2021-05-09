package com.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;

public class ProductPage {

    public AppiumDriver<MobileElement> driver;

    public ProductPage(AppiumDriver driver) {
        this.driver = driver;

    }

    public void urunOzellikleriniSec() throws InterruptedException {

        Thread.sleep(5000);
        List<MobileElement> els16 = driver.findElementsByXPath("//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");
        els16.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els17 = driver.findElementsById("trendyol.com:id/button_add_to_basket");
        els17.get(0).click();
    }
}
