package MainPackage.SeleniumChromeDriver.locators.ActionsClass_ActionIntrface.mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick { //DOUBLE CLICK METHOD IN ACTIONS CLASS
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        WebElement we = wd.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        Actions ac = new Actions(wd);
        ac.doubleClick(we)
                .perform();
        Thread.sleep(3000);
        wd.close();
    }
}
