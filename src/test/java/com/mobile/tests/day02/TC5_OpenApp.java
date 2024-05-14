package com.mobile.tests.day02;

import com.mobile.tests.utilities.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Locale;

import static com.mobile.tests.utilities.Utils.*;

public class TC5_OpenApp implements Locator {
    AppiumDriver<MobileElement> driver;
    Device device=Device.PIXEL2;
    App app=App.CALCULATOR;
/*
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
*/


    @Before
    public void setUp() {
        driver= openApp(device,app);
    }

    @After
    public void tearDown(){
        driver.closeApp();
        Driver.stopAppium();
    }

    @Test
    public void t07_click_divide() {
        click(l_digit7);
        click(l_digit7);
        click(l_op_div);
        click(l_digit1);
        click(l_digit1);
        click(l_equal);

        Assert.assertEquals("7",getText(l_result_final));
    }

    @Test
    public void t08_click_sub() {
        getDigit(8).click();
        getDigit(9).click();
        click(l_op_sub);
        getDigit(5).click();
        getDigit(7).click();
        click(l_equal);
        Assert.assertEquals("32",getText(l_result_final));
    }
}