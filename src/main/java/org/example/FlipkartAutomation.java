package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class FlipkartAutomation {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Iphone 15");
        driver.findElement(By.cssSelector("button[title='Search for Products, Brands and More']")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
        String originalWindowHandle = driver.getWindowHandle();
        switchToNewTab(driver, originalWindowHandle);
        String newTabURL = driver.getCurrentUrl();
        driver.switchTo().window(originalWindowHandle);
        driver.get(newTabURL);
        driver.findElement(By.cssSelector("button[type='button']")).click();

    }
    private static void switchToNewTab(WebDriver driver, String originalWindowHandle) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
}
