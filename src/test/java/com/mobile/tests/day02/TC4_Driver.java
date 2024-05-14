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

    AppiumDriver<MobileElement> driver;
    Device device=Device.PIXEL2;
    App app=App.CALCULATOR;

    By l_digit1=By.id("com.google.android.calculator:id/digit_1");
    By l_digit2=By.id("com.google.android.calculator:id/digit_2");
    By l_digit3=By.id("com.google.android.calculator:id/digit_3");
    By l_digit4=By.id("com.google.android.calculator:id/digit_4");
    By l_digit5=By.id("com.google.android.calculator:id/digit_5");
    By l_digit6=By.id("com.google.android.calculator:id/digit_6");
    By l_digit7=By.id("com.google.android.calculator:id/digit_7");
    By l_digit8=By.id("com.google.android.calculator:id/digit_8");
    By l_digit9=By.id("com.google.android.calculator:id/digit_9");
    By l_digit0=By.id("com.google.android.calculator:id/digit_0");
    By l_op_add=By.id("com.google.android.calculator:id/op_add");
    By l_op_sub=By.id("com.google.android.calculator:id/op_sub");
    By l_op_mul=By.id("com.google.android.calculator:id/op_mul");
    By l_op_div=By.id("com.google.android.calculator:id/op_div");
    By l_equal=By.id("com.google.android.calculator:id/eq");
    By l_result_final=By.id("com.google.android.calculator:id/result_final");

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
    public void t05_runAppium_getDriver() throws MalformedURLException {
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

    @Test
    public void t06_click_multiply() {
        click(l_digit7);
        click(l_digit7);
        click(l_op_mul);
        click(l_digit8);
        click(l_digit8);
        click(l_equal);

        Assert.assertEquals("6776",getText(l_result_final));
    }

    void click(By locator){
        Driver.getDriver().findElement(locator).click();
    }
    String getText(By locator){
        return Driver.getDriver().findElement(locator).getText();
    }
}