package ScreenshottestingAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class ScreenshotList {
    //@Test(priority = 2)
    public void list3(RemoteWebDriver driver) {
        {
            //RemoteWebDriver driver = this.driver;
            System.out.println("Class start screenshotList " + driver);

            try {


                screenShotNavigation nav = new screenShotNavigation();
                nav.navigation(driver);
                Thread.sleep(5000);
                driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[1]/form/div[2]/input")).clear();

                driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[1]/form/div[2]/input")).sendKeys("https://www.amazon.com");
                System.out.println("Credentails run successfully");
                driver.manage().window().maximize();

                Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/select")));

                dropdown.selectByIndex(3);

                launchButton hitlaunch = new launchButton();
                hitlaunch.launch(driver);
                Thread.sleep(5000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

}