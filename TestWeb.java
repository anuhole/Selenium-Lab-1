import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class TestWeb {
    public static void main(String[] args) {
        //initiallize WebDriver
        WebDriver obj_driver=new ChromeDriver();
        try{
            //Navigate to the login page
           obj_driver.get("https://www.saucedemo.com");

           Thread.sleep(1000);

           //Create WebElement object
           WebElement obj_username = obj_driver.findElement(By.id("user-name"));
           WebElement obj_password = obj_driver.findElement(By.id("password"));
           WebElement obj_loginButton = obj_driver.findElement(By.id("login-button"));

           // Enter credentials
            obj_username.sendKeys("standard_user");
            obj_password.sendKeys("secret_sauce");

            Thread.sleep(1000);
            obj_loginButton.click();
            Thread.sleep(1000);


            //check if login was succeesfully by verifying URL
            if(obj_driver.getCurrentUrl().contains("inventory.html")){
                System.out.println("Login Succeesfully");
            }else {
                System.out.println("Login Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //close broweser
            obj_driver.quit();
        }
    }
}
