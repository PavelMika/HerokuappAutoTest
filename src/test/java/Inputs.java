import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Inputs {
    @Test
    public void inputsTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/inputs");
        browser.findElement(By.cssSelector("input")).sendKeys(Keys.ARROW_UP);
        String inputTest1 = browser.findElement(By.cssSelector("input")).getAttribute("value");
        assertEquals(inputTest1,1,1);
        browser.findElement(By.cssSelector("input")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        String inputTest2 = browser.findElement(By.cssSelector("input")).getAttribute("value");
        assertEquals(inputTest1,-1,-1);
        browser.quit();
    }
}
