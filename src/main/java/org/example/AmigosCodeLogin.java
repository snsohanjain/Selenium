package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AmigosCodeLogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://textbook.amigoscode.com/");
        WebElement triggerButton = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.id("trigger_button_id")));
        triggerButton.click();
        // implicitly waite
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Explicitly wait
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("123454")));

        // Thread Sleep

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.sendKeys("your_username");
        alert.sendKeys("your_password");

        alert.accept();


    }
}
