package com.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;

public class HomePage {

    public AppiumDriver<MobileElement> driver;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;

    }

    public void kategorilereTıkla() throws InterruptedException {
        Thread.sleep(5000);
        List<MobileElement> els10 = driver.findElementsByXPath("//android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout");
        els10.get(0).click();

        List<MobileElement> els11 = driver.findElementsById("trendyol.com:id/tab_search");
        els11.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els13 = driver.findElementsByXPath("//android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[7]");
        els13.get(0).click();
    }

    public void BilgisayarSec() throws InterruptedException {
        Thread.sleep(5000);
        List<MobileElement> els14 = driver.findElementsByXPath("//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
        els14.get(0).click();

        Thread.sleep(5000);
        List<MobileElement> els15 = driver.findElementsByXPath("//android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
        els15.get(0).click();


    }




}
