package activities.Files;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button options = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
    public Button newFolderOption = new Button(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"New folder\"]"));



}
