package core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class page {


    public WebDriver driver = null;  // Global

    public void openBrowser(String browser, String url) // Define
    {
        if(browser.equalsIgnoreCase("chrome"))
        {

            driver = new ChromeDriver();


        }

        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();

        }

        else if(browser.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();

        }

        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser()
    {
        driver.quit();
    }

}