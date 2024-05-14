package com.mobile.tests.utilities;

public enum App {

    CALCULATOR("com.google.android.calculator",
            "com.android.calculator2.Calculator");

    public String appActivity;
    public String appPackage;

    App(String appPackage, String appActivity) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }
}
