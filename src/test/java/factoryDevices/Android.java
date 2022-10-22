package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","1723133810HA07LC");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","com.agus.bolivia.calendario");
        capabilities.setCapability("appActivity","com.agus.bolivia.calendario.MainActivity");
        capabilities.setCapability("platformName","Android");

        //con AndroidDriver permite crear la ruta del Appium server con el que se va a conectar trabajamos con los datos que nos muestra el insoector"remote host,puerto,remote Path"
        AppiumDriver driver= null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        //implicit
        driver.manage().timeouts().implicitlyWait(15000L, TimeUnit.MICROSECONDS);
        return driver;
    }
}

