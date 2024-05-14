package com.mobile.tests.utilities;

public enum App {

    CALCULATOR("com.google.android.calculator",
            "com.android.calculator2.Calculator");
    //APIDEMOS("com.touchboarder.android.api.demos","com.touchboarder.androidapidemos.MainActivity", "");

    public String appActivity;
    public String appPackage;

    App(String appPackage, String appActivity) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }

/*
    public String apk;
    App(String appPackage, String appActivity,String apk) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.apk=apk;
    }
    */

}