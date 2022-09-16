package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

public class EightTestChrome {

    String projectPath = System.getProperty("user.dir");

    @Test(invocationCount = 4, threadPoolSize = 4)
    public void yellowTest() throws Exception {
        System.out.println("I am inside yellowTest | " +
                Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath +
                "/selenium-server/chromedriver");
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

        // Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

    @Test(invocationCount = 4, threadPoolSize = 4)
    public void testClickOk() {
        System.out.println("I am inside testClickOk | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://24h.pchome.com.tw/");
        driver.manage().window().setSize(new Dimension(1440, 821));
        {
            WebElement element = driver.findElement(By.linkText("NB"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("3C")).click();
        {
            WebElement element = driver.findElement(By.linkText("周邊"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("周邊")).click();
        Assert.assertEquals(driver.getTitle(), "周邊 - PChome 24h購物");
        Assert.assertEquals(driver.findElement(By.cssSelector(".shipping")).getText(), "購物滿$490免運費");
        driver.findElement(By.linkText("PChome線上購物 - 24h到貨")).click();
        {
            WebElement element = driver.findElement(By.linkText("日用"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("3C"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("NB"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#b002_bn_a_01_01 > .c-adCampaign__head > img"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        Assert.assertEquals(driver.getTitle(), "PChome 24h購物");
        driver.close();
        driver.quit();
    }

    @Test
    public void test1searchkeyboard() {
        System.out.println("I am inside test1searchkeyboard | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://24h.pchome.com.tw/");
        driver.manage().window().setSize(new Dimension(1440, 821));
        driver.findElement(By.cssSelector(".l-header__siteSearchInput")).click();
        driver.findElement(By.cssSelector(".l-header__siteSearchInput")).sendKeys("鍵盤");
        driver.findElement(By.cssSelector(".l-header__siteSearchInput")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("廠商出貨")).click();
        driver.findElement(By.cssSelector("#cate_DCAH > a")).click();
        Assert.assertEquals(driver.getTitle(), "鍵盤 - PChome線上購物");
        driver.findElement(By.linkText("PChome線上購物")).click();
        Assert.assertEquals(driver.getTitle(), "PChome 24h購物");
        driver.close();
        driver.quit();
    }

    @Test
    public void test2searchmouse() {
        System.out.println("I am inside test1searchkeyboard | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://24h.pchome.com.tw/");
        driver.manage().window().setSize(new Dimension(1440, 821));
        driver.findElement(By.cssSelector(".l-header__siteSearchInput")).click();
        driver.findElement(By.cssSelector(".l-header__siteSearchInput")).sendKeys("滑鼠");
        driver.findElement(By.cssSelector(".l-header__siteSearchInput")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".Scope:nth-child(3) > a")).click();
        driver.findElement(By.xpath("//dd/ul/li/ul/li/a")).click();
        Assert.assertEquals(driver.getTitle(), "滑鼠 - PChome線上購物");
        driver.findElement(By.linkText("PChome線上購物")).click();
        Assert.assertEquals(driver.getTitle(), "PChome 24h購物");
        driver.close();
        driver.quit();
    }

}