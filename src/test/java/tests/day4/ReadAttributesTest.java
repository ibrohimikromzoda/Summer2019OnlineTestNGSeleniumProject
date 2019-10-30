package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class ReadAttributesTest {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input = driver.findElement(By.name("email"));
      // to read the value of any attribute
        // name = "email" name its an attribute, email its a value of attribute
        System.out.println(input.getAttribute("pattern"));
        input.sendKeys("random_email@gmail.com");
        // how to read entered texts
        // its gonna be inside value attribute
        System.out.println(input.getAttribute("value"));
        // if button has a type "submit"
        // we can use .submit() method instead of click() as well
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        // alternative to click, only if type - "submit"
        retrievePasswordButton.submit();
        driver.close();

}
}
