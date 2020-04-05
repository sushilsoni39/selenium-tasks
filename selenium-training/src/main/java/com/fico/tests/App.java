package com.fico.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class App
{
    public static void main(String[] args)
    {
        String driverPath="C:\\Users\\sushilk\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Wait wait=new WebDriverWait(driver,10);
        driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']//input[@id='ap_email']")).sendKeys("sushilsoni39@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("1805199804");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("earphones");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        driver.findElement(By.xpath("//li[2]//div[1]//div[1]//span[1]//a[1]//div[1]//img[1]")).click();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();
    }
}