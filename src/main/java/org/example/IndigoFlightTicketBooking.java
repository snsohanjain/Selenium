package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IndigoFlightTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");
//        driver.findElement(By.xpath("//input[@id='ONE_WAY']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("_1fa_Yn HQlQNF _18Y7Fu")).click();


    }
}
