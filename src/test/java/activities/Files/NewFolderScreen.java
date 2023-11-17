package activities.Files;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class NewFolderScreen {
    public TextBox newFolder = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"android:id/text1\"]"));
    public Button okButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));


}
