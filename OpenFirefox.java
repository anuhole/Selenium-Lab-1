import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
    public static void main(String[] args) {
        WebDriver obj_driver=new FirefoxDriver();
        try{
            obj_driver.get("https://www.saucedemo.com");
            Thread.sleep(2000);
            System.out.println(obj_driver.getTitle());


            Thread.sleep(2000);

            obj_driver.get("https://google.com");
            Thread.sleep(2000);
            System.out.println(obj_driver.getTitle());


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            obj_driver.quit();
        }
    }
    }

