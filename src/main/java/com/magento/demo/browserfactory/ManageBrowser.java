package com.magento.demo.browserfactory;

import com.magento.demo.propertyreader.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ManageBrowser {
    public static WebDriver driver;
    String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    int implicitWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitWait"));

    String browser = "Chrome";

    public void selectBrowser(String browser){
        // Launch the Chrome Browser
        if(browser.equalsIgnoreCase("Chrome")) {

            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox"))
            driver = new FirefoxDriver();
        else if(browser.equalsIgnoreCase("Edge"))
            driver = new EdgeDriver();
        else
            System.out.println("Invalid browser name");

        // Open the URL into Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
    }

    public void closeBrowser(){
        if(driver!=null)
            driver.quit();
    }
}
