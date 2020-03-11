import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveElements {
    @Test
    public void elementsTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement element = browser.findElement(By.xpath("//button[text()='Add Element']"));
        element.click();
        element.click();
        WebElement element1 = browser.findElement(By.xpath("//button[text()='Delete']"));
        element1.click();
        int quantityOfDeleteButtons = browser.findElements(By.className("added-manually")).size();
        assertEquals(quantityOfDeleteButtons, 1, "One button is left");
        browser.quit();
    }
}
