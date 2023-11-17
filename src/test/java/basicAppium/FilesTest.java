package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class FilesTest{

    AppiumDriver mobile;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName","Diplomado");
        config.setCapability("platformVersion","9.0");
        config.setCapability("appPackage","com.android.documentsui");
        config.setCapability("appActivity","com.android.documentsui.files.FilesActivity");
        config.setCapability("platformName","Android");
        config.setCapability("automationName","uiautomator2");
        mobile = new AndroidDriver(new URL(" http://127.0.0.1:4723/wd/hub"),config);
        // implicit / explicit / fluent
        mobile.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Test
    public void createFile() throws InterruptedException {


        mobile.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]")).click();
        mobile.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"New folder\"]")).click();
        mobile.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/text1\"]")).sendKeys("Diplomado Ucb 2023");
        mobile.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();

        Assertions.assertTrue( mobile.findElement(By.xpath("//android.widget.TextView[@text=\"Diplomado Ucb 2023\"]")).isDisplayed(),
                "ERROR> La Carpeta no fue creada" );


        Thread.sleep(5000);

    }

    @AfterEach
    public void closeApp(){
        mobile.quit();
    }

}
