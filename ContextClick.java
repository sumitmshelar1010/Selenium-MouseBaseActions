package MainPackage.SeleniumChromeDriver.locators.ActionsClass_ActionIntrface.mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {//CONTEXT CLICK METHOD IN ACTIONS CLASS
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement we = wd.findElement(By.xpath("//span[@Class ='context-menu-one btn btn-neutral']"));
        Actions ac = new Actions(wd);
        ac.contextClick(we)
                .perform();
        Thread.sleep(3000);
        wd.close();
    }
}
