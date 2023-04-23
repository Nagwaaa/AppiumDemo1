package Demos;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TODOListTestCase {

    AndroidDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/src/main/resources/QAcart-To-Do.apk");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.todoqacart.MainActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.todoqacart");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }

    @Test
    public void openApp()
    {

    }

    @AfterTest
    public void tearDown()
    {

    }


}
