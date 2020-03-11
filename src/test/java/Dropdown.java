import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    public void dropdownTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/dropdown");
        WebElement option1 = browser.findElement(By.xpath("//select[id=dropdown']/option[@value='1']"));
        option1.click();
        Assert.assertEquals(option1.isSelected(),true,"Option 1 is selected");
        WebElement option2 = browser.findElement(By.xpath("//select[id=dropdown']/option[@value='2']"));
        option2.click();
        Assert.assertEquals(option2.isSelected(),true,"Option 2 is selected");
        browser.quit();



    }
}
