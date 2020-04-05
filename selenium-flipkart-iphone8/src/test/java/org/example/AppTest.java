package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class AppTest
{

    @BeforeClass
    public void beforeClass()
    {
       System.out.println("beforeClass");
    }

    @Test( dataProvider = "productName")
    public void TestCase1(String product)
    {
        String driverPath="C:\\Users\\sushilk\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
        action.moveToElement(we).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[7]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div/div[1]/a")).click();
        try{
            String path="//*[text()='"+product+"']";
            WebElement textDemo = driver.findElement(By.xpath(path));
            if(textDemo.isDisplayed())
                System.out.println("Product found on the flipkart");}
        catch (Exception e)
        {System.out.println("Product not found");}
    }
    @DataProvider(name="productName")
    public static Object[] ProductName()
    {
        return new Object[] {"Apple iPhone 8 Plus (PRODUCT)RED (Red, 64 GB)"};
    }

}



