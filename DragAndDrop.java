package MainPackage.SeleniumChromeDriver.locators.ActionsClass_ActionIntrface.mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {//DRAG AND DROP METHOD IN ACTIONS CLASS

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement we = wd.findElement(By.id("draggable"));
        WebElement we1 = wd.findElement(By.id("droppable"));
        Actions ac = new Actions(wd);
         ac.dragAndDrop(we,we1)
                 .perform();

         Thread.sleep(3000);
         wd.close();
    }
}
