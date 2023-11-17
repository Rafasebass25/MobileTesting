package testSuite;

import activities.Files.FileScreen;
import activities.Files.NewFolderScreen;
import activities.Files.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class FilesTest {
    MainScreen mainScreen = new MainScreen();
    FileScreen fileScreen = new FileScreen();

    NewFolderScreen newFolderScreen = new NewFolderScreen();

    @Test
    public void createNewTaskTest(){

        mainScreen.options.click();
        mainScreen.newFolderOption.click();
        newFolderScreen.newFolder.setText("Diplomado Ucb 2023");
        newFolderScreen.okButton.click();
        fileScreen.mameOfFile.isControlDisplayed();
        Assertions.assertTrue( fileScreen.mameOfFile.isControlDisplayed(),
                "ERROR la tarea no fue creada");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }


}
