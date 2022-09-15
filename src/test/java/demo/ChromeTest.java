package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test()
public class ChromeTest {

    String projectPath = System.getProperty("user.dir");


    @Test
    public void openGoogle(){
        System.out.println("I am inside openGoogle test | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();
        driver.quit();
    }

    @Test
    public void openDdg(){
        System.out.println("I am inside openDdg test | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");
        driver.close();
        driver.quit();
    }
    @Test
    public void openSideex(){
        System.out.println("I am inside openSideex test | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sideex.io");
        driver.close();
        driver.quit();
    }

    @Test
    public void openGithub(){
        System.out.println("I am inside openGithub test | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        driver.close();
        driver.quit();
    }

}