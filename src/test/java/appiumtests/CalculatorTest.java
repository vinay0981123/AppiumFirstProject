package appiumtests;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    static AppiumDriver driver;
    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName","Moto G(10)");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11.0");
        cap.setCapability("appPackage","com.google.android.calculator");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url,cap);
        System.out.println("Hurrayyyy Working Fine");
    }
}
