package org.example;
import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.ithsdistans.se/login/index.php");
        WebElement user =driver.findElement(By.xpath("//input[@name='username']"));
        user.sendKeys("MySeleniumTest1");

        WebElement password_test =driver.findElement(By.xpath("//input[@name='password']"));
        password_test.sendKeys("Test password");
      //  password_test.click();

        WebElement checkBoxSelected = driver.findElement(By.id("rememberusername"));
         //  Checkbox - checking if its selected

    boolean isSelected = checkBoxSelected.isSelected();

    // performing click operation if element is not selected
		if(isSelected == false) {

            System.out.println("Checkbox is Not Toggled On, let toggle it");
            checkBoxSelected.click();
    }

    }
}