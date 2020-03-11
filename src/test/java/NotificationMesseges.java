import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMesseges {
    @Test
    public void notificationMessegesTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/notification_message_rendered");
        browser.findElement(By.xpath("//*[@href='/notification_message']")).click();
        String element = browser.findElement(By.xpath("//*[@class='flash notice']")).getText();
        assertEquals(element,"Action successful\n" + "x","Сообщение верное");
        browser.quit();




    }
}
