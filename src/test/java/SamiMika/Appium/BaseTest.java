package SamiMika.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.ServerArgument;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException
	{

		service =new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).withArgument(()-> "--base-path","/wd/hub").withTimeout(Duration.ofSeconds(200)).build();
		service.start();
				
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("R9YT10L0XCH");
		//options.setCapability("appPackage", "com.fosanis.android.cancer_companion");
		//options.setCapability("noReset", true);
	//	options.setApp("//Users//msk//eclipse-workspace//Appium//src//test//java//Utils//MIKA.apk");
		 driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), options);
	}

	@AfterClass
	public void tearDown()
	{
		
		service.stop();
	}
}
