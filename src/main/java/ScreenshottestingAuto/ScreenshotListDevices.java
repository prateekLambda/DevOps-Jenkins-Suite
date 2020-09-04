package ScreenshottestingAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenshotListDevices {
    public void list2(RemoteWebDriver driver) {
        {
            //RemoteWebDriver driver = this.driver;
            System.out.println("Class start screenshotList " + driver);

            try {
                screenShotNavigation nav = new screenShotNavigation();
                nav.navigation(driver);
                driver.findElement(By.xpath("//*[@id=\'simple-screenshot\']/app-launcher-detail/section/div[1]/div[1]/div/div[2]/input")).clear();
                driver.findElement(By.xpath("//*[@id=\'simple-screenshot\']/app-launcher-detail/section/div[1]/div[1]/div/div[2]/input")).sendKeys("https://www.amazon.com");
                System.out.println("Credentails run successfully");
                driver.manage().window().maximize();

                Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/select")));

                dropdown.selectByIndex(2);

                launchButton hitlaunch = new launchButton();
                hitlaunch.launch(driver);
                MarkAsBug chromeeightpoint = new MarkAsBug();
                chromeeightpoint.mark(driver);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
