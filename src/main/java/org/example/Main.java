package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class Main {
    public static void main(String[] args){


        @Test
            FirefoxDriver driver= new FirefoxDriver();
            driver.get("https://www.ithsdistans.se/login/index.php");
            WebElement user = driver.findElement(By.xpath("//input[@name='username']"));// Test of username field
            String Expected_username_is_empty = " ";
            Assert.assertEquals(Expected_username_is_empty;user)
            ;// Test if the username is empty when the login page is loaded

        @Test


                user.sendKeys("MySeleniumTest1");
        WebElement user_new =driver.findElement(By.xpath("//input[@name='username']"))
        Assert.assertEquals(user; user_new);//Test if the username is MySeleniumTest1


        @Test

        WebElement password_test =driver.findElement(By.xpath("//input[@name='password']"));// Test of password field
        String Expected_password_is_empty = " ";
        Assert.assertEquals(Expected_password_is_empty; password_test); Test if the password is empty when the login page is loaded


        @Test

        password_test.sendKeys("Test password");
        WebElement password_test_new =driver.findElement(By.xpath("//input[@name='password']"));
        Assert.assertEquals(password_test; password_test_new); //Test if the new password is in the Password field is Test password

        @Test

        WebElement checkBoxSelected = driver.findElement(By.id("rememberusername"));
        Boolean isSelected = checkBoxSelected.isSelected();
        Assert.assertEquals(checkBoxSelected; isSelected); //  Checkbox - checking if its selected

        @Test

        if(!isSelected) {

            System.out.println("Checkbox is Not Toggled On, let toggle it");
            checkBoxSelected.click();
        }
        Assert.assertEquals(checkBoxSelected; isSelected); //  Checkbox - after toggling the checkbox, checking if its selected


        @Test

        String actualUrl="https://www.ithsdistans.se/login/index.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);


      }
    }
}