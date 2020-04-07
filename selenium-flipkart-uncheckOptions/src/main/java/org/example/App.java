package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.interactions.Actions;
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
        driver.get("https://www.flipkart.com");
        System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("please enter your email");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("enter your password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button ")).click();
        driver.manage().window().maximize();
        Wait wait=new WebDriverWait(driver,30);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div"));
        action.moveToElement(we).build().perform();
        System.out.println("hover done");
        driver.findElement(By.xpath("//div[contains(@class, '_1Q5BxB') and text()='Notification Preferences']")).click();
        try { Thread.sleep(3000); }
        catch (Exception e) {}
        driver.findElement(By.xpath("//li[contains(text(),'Email')]")).click();
        driver.findElement(By.xpath(" //*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/section/div/div/ul/li[2]/section/div[1]/label/div")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/section/div/div/ul/li[2]/section/div[1]/label/div")).click();
        
    }
}