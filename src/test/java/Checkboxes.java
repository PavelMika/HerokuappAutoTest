
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Checkboxes {
    @Test
    public void checkboxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = (List<WebElement>) browser.findElement(By.tagName("input"));
        assertEquals(checkboxes.get(0).isSelected(), false, "1st checkbox is not selected");
        checkboxes.get(0).click();
        assertEquals(checkboxes.get(0).isSelected(), true, "1st checkbox is selected");
        assertEquals(checkboxes.get(1).isSelected(), true, "2nd checkbox is selected");
        checkboxes.get(1).click();
        assertEquals(checkboxes.get(1).isSelected(), false, "2nd checkbox is not selected");
        browser.quit();


    }
}
