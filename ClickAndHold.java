package MainPackage.SeleniumChromeDriver.locators.ActionsClass_ActionIntrface.mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {//MOUSE BASE METHOD CLICK AND HOLD

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wd =new ChromeDriver();
        wd. get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        wd.manage().window().maximize();
        WebElement we = wd.findElement(By.xpath("//ul[@id='sortable']//child:: li[text()='J']"));

        JavascriptExecutor jse = (JavascriptExecutor)wd;
        jse.executeScript("arguments[0].scrollIntoView();",we);
WebElement we1= wd.findElement(By.xpath(("//ul[@id='sortable']//child:: li[text()='A']")));
WebElement we2 = wd.findElement(By.xpath("//ul[@class='ui-sortable']//child::li[@name='H']"));
WebElement we3 = wd.findElement(By.xpath("//ul[@id = 'sortable']//child::li[@name='G']"));
        Actions ac = new Actions(wd);
        ac.clickAndHold(we)
          .moveToElement(we1)
          .release(we)
                .build();

         // Action A=ac.build();
      /*  Thread.sleep(4000);
          ac.clickAndHold(we2)
                  .moveToElement(we3)
                  .release(we2)
                  .build()
                  .perform();
          Thread.sleep(4000);
          A.perform();*/
        Thread.sleep(3000);
        wd.close();
    }
}
