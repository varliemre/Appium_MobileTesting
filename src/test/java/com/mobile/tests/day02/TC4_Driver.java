package com.mobile.tests.day02;

import com.mobile.tests.utilities.App;
import com.mobile.tests.utilities.Device;
import com.mobile.tests.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class TC4_Driver {


    Device device=Device.PIXEL2;
    App app=App.CALCULATOR;
    AppiumDriver<MobileElement> driver;


    @Before
    public void setUp() {
        Driver.runAppium();
        driver=Driver.getDriver(device,app);
    }

    @After
    public void tearDown(){
        driver.closeApp();
        Driver.stopAppium();
    }

    @Test
    public void t05_appium_localService() throws MalformedURLException {

        MobileElement digit_5 = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        MobileElement plus_Btn = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        MobileElement digit_2 = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        MobileElement eq_Btn = driver.findElement(By.id("com.google.android.calculator:id/eq"));

        digit_5.click();
        plus_Btn.click();
        digit_2.click();
        eq_Btn.click();
        MobileElement result_final = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        String actualResult=result_final.getText();
        Assert.assertEquals("7",actualResult);

    }

}
