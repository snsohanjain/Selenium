package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTripTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.makemytrip.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bangalore");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@id='react-autowhatever-1-section-0-item-0'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Mumbai");
        driver.findElement(By.xpath("(//li[@id='react-autowhatever-1-section-0-item-0'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@aria-label='Thu Jan 11 2024']")).click();
        driver.findElement(By.xpath("//input[@id='travellers']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();

    }
}
