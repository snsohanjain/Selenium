package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJetFlightBooking {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.spicejet.com/");
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[1]")).click();
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).sendKeys("Delhi");
        //
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[1]")).click();
        //
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value='Select Destination']")).sendKeys("BLR");
        //
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[1]")).click();
        //
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).click();
        for(int i = 0; i < 5; i++) {
            driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-k8qxaj r-d9fdf6'] div:nth-child(1) div:nth-child(2) div:nth-child(3)")).click();
        }
         driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
    }
}
