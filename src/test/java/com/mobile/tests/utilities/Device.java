package com.mobile.tests.utilities;

public enum Device {


    PIXEL2("emulator-5554",
            "11.0",
            "Pixel_2",
            "Android"),
    PIXEL3("emulator-5554",
            "12.0",
            "Pixel_3",
            "Android"),
    SAMSUNG_A53("RZCT45588MY",
            "13.0",
            "My Phone",
            "Android");
    public String udid;
    public String version;
    public String deviceName;
    public String platformName;
    Device(String udid, String version, String deviceName, String platformName) {
        this.udid=udid;
        this.version=version;
        this.deviceName=deviceName;
        this.platformName=platformName;
    }
}
