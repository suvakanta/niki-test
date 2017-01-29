package packone;

import java.io.File;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppNiki {

	@Test
	public void test() throws Exception {
		//File appDir=new File("src");
		File app=new File("D:/WowAppium/Works/Introduction/src/app-niki-test.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"android");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.findElementById("com.tinder:id/button_login_real").click();
		//driver.findElementById("com.tinder:id/button_login_real").click();
	    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"10");
		driver.findElementById("com.tinder:id/revised_like").click();
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"10");
		driver.findElementById("com.tinder:id/revised_like").click();
		
		driver.closeApp();

		//driver.findElementByName("suvakanta.samantray@gmail.com").click();
	}

}
