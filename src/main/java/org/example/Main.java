package org.example;
import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.ithsdistans.se/login/index.php");
        WebElement element=driver.findElement(By.xpath("//input[@name='username']"));
        element.sendKeys("MySeleniumTest1");

        WebElement button=driver.findElement(By.xpath("//input[@name='password']"));

        button.click();
    }

}