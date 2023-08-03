package com.appium.training.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;


public class CapabilitiesBuilder {

    public static Capabilities build(String osVersion) {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("sessionName", "Automation session");
        capabilities.setCapability("sessionDescription", "");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        //capabilities.setCapability("app", "C:\\Users\\magnu\\IdeaProjects\\appium-screenplay-serenity\\src\\main\\java\\com\\appium\\training\\apps\\Practica5.apk");
        capabilities.setCapability("app", "C:\\Users\\magnu\\IdeaProjects\\appium-screenplay-serenity\\src\\main\\java\\com\\appium\\training\\apps\\Practica5_requireContext.apk");
        //capabilities.setCapability("app", "C:\\Users\\magnu\\IdeaProjects\\appium-screenplay-serenity\\src\\main\\java\\com\\appium\\training\\apps\\Practica5_ContextCompat.apk");
        capabilities.setCapability("deviceName", "d2349b16"); // si no encuentra un dispositivo con ese nombre se conectará al más parecido
        //capabilities.setCapability("fullReset","false");
        capabilities.setCapability("noReset","false");
        capabilities.setCapability("platformVersion", osVersion);
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("automationName", "uiautomator2"); // para Android version > 5
        //capabilities.setCapability("automationName", "uiautomator1"); // para Android version < 5
        capabilities.setCapability("appium:apksignerExecutable", "C:\\Users\\magnu\\AppData\\Local\\Android\\Sdk\\build-tools\\34.0.0-rc4\\apksigner.bat");

        return capabilities;
    }

}
