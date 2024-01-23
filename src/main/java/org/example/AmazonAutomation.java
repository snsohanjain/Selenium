package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple Macbook");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
