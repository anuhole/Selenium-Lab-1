import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCasesForDrivingLienceUI {
    public static void main(String[] args) {
        WebDriver obj_driver=new ChromeDriver();
        try{
            obj_driver.get("file:///C:/Users/ccst/Desktop/Web%20Automationn-Selinium/SeleniumMaterial/TestcasesClassAssignment-drivingLicenseUI.html");
            Thread.sleep(2000);

            WebElement obj_textBox=obj_driver.findElement(By.xpath("//select[@id='licenseType']"));
            Select lineceType=new Select(obj_textBox);
             //option1
            lineceType.selectByVisibleText("Permanent");
            //option2
            lineceType.selectByValue("permanent");
            //option 3
            lineceType.selectByIndex(1);


            Thread.sleep(2000);
            WebElement obj_fullName=obj_driver.findElement(By.id("fullname"));
            obj_fullName.sendKeys("Anushka Hole");
            Thread.sleep(2000);

            WebElement obj_Add=obj_driver.findElement(By.xpath("//input[@id='address']"));
            obj_Add.sendKeys("Pune");
            Thread.sleep(2000);

            WebElement age=obj_driver.findElement(By.xpath("//*[@id='age']"));
            age.sendKeys("21");
            Thread.sleep(2000);

            WebElement birthPlace=obj_driver.findElement(By.id("placeofbirth"));
            birthPlace.sendKeys("Pune");
            Thread.sleep(2000);


            WebElement radio_buttons=obj_driver.findElement(By.cssSelector("#Female"));
            radio_buttons.click();
            Thread.sleep(2000);

            WebElement checkboxes =obj_driver.findElement(By.xpath("//input[@name='color_yes']"));
            checkboxes.click();
            Thread.sleep(2000);

            WebElement langauges=obj_driver.findElement(By.cssSelector("#languages"));
            Select langaugeType=new Select(langauges);
            //option1:
            langaugeType.selectByValue("english");

            //option2:
            langaugeType.selectByVisibleText("Hindi");

            //option3:
            langaugeType.selectByIndex(3);
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
