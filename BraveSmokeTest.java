package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

class BraveTest {

    @Test
    void openBraveBrowser() {
        // Setup Brave with ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // Path to Brave browser (default Windows install path)
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver(options);

        // Open a website
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
