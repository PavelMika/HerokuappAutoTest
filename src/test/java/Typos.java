import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Typos {
    @Test
    public void typosTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/typos");
        String string = browser.findElement(By.className("example")).getText();
        assertEquals(string,"Sometimes you'll see a typo, other times you won't.","Text is right" );
    }
}
