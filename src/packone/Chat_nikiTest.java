package packone;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Chat_nikiTest {
AndroidDriver driver;
DesiredCapabilities cap;
    @BeforeClass
  public void setUp() throws MalformedURLException {
	  File app=new File("D:/WowAppium/Works/Chat/src/app-niki-test.apk");
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"android");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
@Test (priority=1)
public void loginChat() throws Exception{
	WebElement e1=driver.findElement(By.id("com.nikiapp:id/login_username"));
	//e1.click();
	e1.sendKeys("Nik");//enter name
	driver.findElement(By.id("com.nikiapp:id/startChatBtn")).click();//button click
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
}
@Test (priority=2)
public void startChat() throws Exception{
	driver.findElement(By.id("com.nikiapp:id/chatIcon")).click();//select a chat from chat screen
	driver.findElement(By.id("com.nikiapp:id/message_et")).sendKeys("Hello..2");//writting message
	driver.findElement(By.id("com.nikiapp:id/sendMessage")).click();//clicking send button
	driver.findElement(By.className("android.widget.ImageButton")).click();//clicking back button
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
}
@Test(priority=3)
public void groupChat() throws Exception{
	
	//WebElement e2=driver.findElement(By.id("com.nikiapp:id/login_username"));
	//e2.sendKeys("Sagar");//enter name
	//driver.findElement(By.id("com.nikiapp:id/startChatBtn")).click();//button click
	driver.findElement(By.id("com.nikiapp:id/groupChat")).click();//selecting groupchat option
	driver.findElement(By.id("com.nikiapp:id/editTextDialogUserInput")).sendKeys("Hii...group");
	driver.findElement(By.id("android:id/button1")).click();//clicking OK Button
	//driver.findElement(By.id("candroid:id/button2")).click();//clicking CANCEL button
	driver.findElement(By.id("com.nikiapp:id/message_et")).sendKeys("Hello 4");//Entering message
	driver.findElement(By.id("com.nikiapp:id/sendMessage")).click();//Clicking send button
	driver.findElement(By.className("android.widget.ImageButton")).click();//Clicking back arrow button
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

}  
@Test (priority=4)
public void chatScreen() throws Exception{
	//WebElement e2=driver.findElement(By.id("com.nikiapp:id/login_username"));
	//e2.sendKeys("Sagar");//enter name
	//driver.findElement(By.id("com.nikiapp:id/startChatBtn")).click();//button click
	driver.findElement(By.className("android.widget.ImageButton")).click();//clicking back button
	driver.findElement(By.id("com.nikiapp:id/createNewChat")).click();//tapping the + button
	driver.findElement(By.id("com.nikiapp:id/groupChat")).click();//selecting groupchat option
	//driver.findElement(By.id("com.nikiapp:id/privateChat")).click();//selecting private chat option
	driver.findElement(By.id("com.nikiapp:id/editTextDialogUserInput")).sendKeys("Hello 3");
	driver.findElement(By.id("android:id/button1")).click();//clicking OK Button
	//driver.findElement(By.id("candroid:id/button2")).click();//clicking CANCEL button
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
}  
@AfterClass
  public void tearDown() {
	  driver.closeApp();
  }

}
