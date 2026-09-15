import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebWithInvalidCrendials {
    public static void main(String[] args) {
        WebDriver obj_driver=new ChromeDriver();
        try{
            obj_driver.get("https://www.saucedemo.com");

            Thread.sleep(1000);


            WebElement obj_username = obj_driver.findElement(By.id("user-name"));
            WebElement obj_password = obj_driver.findElement(By.id("password"));
            WebElement obj_loginButton = obj_driver.findElement(By.id("login-button"));


            obj_username.sendKeys("Admin");
            obj_password.sendKeys("password");

            Thread.sleep(1000);
            obj_loginButton.click();
            Thread.sleep(1000);

            WebElement errorButton=obj_driver.findElement(By.xpath("//button[@class='error-button']"));
            System.out.println("Error Message is Displayed "+ errorButton.isDisplayed());


            WebElement error=obj_driver.findElement(By.xpath("//h3[@data-test='error']"));
            String errorMessage="Epic sadface: Username and password do not match any user in this service";
            if(error.getText().equals(errorMessage)){
                System.out.println(errorMessage);
            }
            else {
                System.out.println("Error Not Displayed");
            }





        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            obj_driver.quit();
        }
    }
}
