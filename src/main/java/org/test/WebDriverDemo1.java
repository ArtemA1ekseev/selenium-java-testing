package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        driver.get("https://www.selenium.dev/selenium/web/web-form.html"); //opens the browser and navigates to the URL


    }
}
