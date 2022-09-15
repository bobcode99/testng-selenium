package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeTestCycle {
    String projectPath = System.getProperty("user.dir");
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.out.println("setup");
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }
    @AfterMethod
    public void teardown(){
        System.out.println("teardown");

        driver.close();
        driver.quit();
    }

    @Test
    public void testCase1() {
        System.out.println("Test case 1");
    }
    @Test
    public void testCase2() {
        System.out.println("Test case 2");
    }
}
