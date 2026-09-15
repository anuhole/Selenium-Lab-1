import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCasesofDrivingLienceUIForFireFox {
    public static void main(String[] args) {
        WebDriver obj_driver=new FirefoxDriver();
        try{
            obj_driver.get("file:///C:/Users/ccst/Desktop/Web%20Automationn-Selinium/SeleniumMaterial/TestcasesClassAssignment-drivingLicenseUI.html");
            Thread.sleep(2000);

            WebElement obj_textBox=obj_driver.findElement(By.xpath("//select[@id='licenseType']"));
            obj_textBox.sendKeys("Permanent");

            Thread.sleep(2000);
            WebElement obj_fullName=obj_driver.findElement(By.id("fullname"));
            obj_fullName.sendKeys("Anushka Hole");
            Thread.sleep(2000);

            WebElement obj_Add=obj_driver.findElement(By.xpath("//input[@id='address']"));
            obj_Add.sendKeys("Pune");
            Thread.sleep(2000);

            WebElement age=obj_driver.findElement(By.id("age"));
            age.sendKeys("21");
            Thread.sleep(2000);


            WebElement birthPlace=obj_driver.findElement(By.id("placeofbirth"));
            birthPlace.sendKeys("Pune");
            Thread.sleep(2000);


            WebElement radio_buttons=obj_driver.findElement(By.cssSelector("#Male"));
            radio_buttons.click();
            Thread.sleep(2000);

            WebElement checkboxes =obj_driver.findElement(By.xpath("//input[@name='color_yes']"));
            checkboxes.click();
            Thread.sleep(2000);

            WebElement langauges=obj_driver.findElement(By.cssSelector("#languages > option:nth-child(1)"));
            langauges.click();
            Thread.sleep(2000);

            WebElement ob_button=obj_driver.findElement(By.cssSelector("button[type=submit]"));
            ob_button.click();
            Thread.sleep(2000);




        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            obj_driver.quit();
        }
    }
}
