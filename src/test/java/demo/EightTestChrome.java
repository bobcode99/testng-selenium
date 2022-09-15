package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EightTestChrome {

    String projectPath = System.getProperty("user.dir");

    @Test(invocationCount = 8, threadPoolSize = 8)
    public void yellowTest() throws Exception {
        System.out.println("I am inside Test 1 | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sideex.github.io/example/webpage_under_test/input-form-for-date-range-color.html");
        driver.findElement(By.cssSelector(".demoDiv > div")).click();
        driver.findElement(By.id("color")).click();
        driver.findElement(By.id("color")).sendKeys("#eeff00");
        driver.findElement(By.id("date")).click();
        driver.findElement(By.id("date")).click();
        driver.findElement(By.id("date")).sendKeys("2022-09-21");
        driver.findElement(By.id("datetime-local")).click();
        driver.findElement(By.id("datetime-local")).sendKeys("2022-09-12T01:04");
        driver.findElement(By.id("month")).click();
        driver.findElement(By.id("month")).sendKeys("2022-07");

        driver.findElement(By.id("range")).sendKeys("7");
        driver.findElement(By.id("range")).click();
        driver.findElement(By.id("time")).click();
        driver.findElement(By.id("time")).sendKeys("01:07");
        driver.findElement(By.id("week")).click();
        driver.findElement(By.id("week")).sendKeys("2022-W37");

        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

}