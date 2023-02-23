package SamiMika.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MikaBasics extends BaseTest {
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void AppiumTest() throws MalformedURLException, InterruptedException
	
	{
//		ConfigureAppium();
//		Xpath, id , accessibilityId, classname,androidUIAutomator
		driver.activateApp("com.fosanis.android.cancer_companion");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		//Login
		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.Button")).click();
		
		//User_name:
		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText[1]")).sendKeys("samirahimi18@gmail.com");

		//Password

		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText[2]")).sendKeys("Testing@2022");

		driver.hideKeyboard();
		
		//Click_Login

		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[1]/android.widget.Button")).click();

		
		//Overlay

		driver.findElement(AppiumBy.id("com.fosanis.android.cancer_companion:id/negativeButton")).click();

		
		// Settings
		driver.findElement(AppiumBy.id("com.fosanis.android.cancer_companion:id/settingsButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Partner code
		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
		

		//License key
		String code = driver.findElement(AppiumBy.id("com.fosanis.android.cancer_companion:id/primaryCodeView")).getText();
		System.out.println("Code is : "+ code);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(AppiumBy.id("com.fosanis.android.cancer_companion:id/upButton")).click();
	
		driver.navigate().back();
		
		driver.findElement(By.xpath("///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")).click();
		
//		tearDown(); 
	}

}
