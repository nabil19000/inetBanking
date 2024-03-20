package com.inetBanking.testCases;
import com.inetBanking.utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
    ReadConfig readConfig = new ReadConfig();
    public String baseURL = readConfig.getApplicationURL();
    public String username = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static WebDriver driver ;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br){

        switch (br) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", readConfig.getfirefoxPath());
                driver = new FirefoxDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", readConfig.getedgePath());
                driver = new EdgeDriver();
                break;
        }
        driver.get(baseURL);
        driver.manage().window().maximize();

    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
