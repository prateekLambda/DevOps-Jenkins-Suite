package ScreenshottestingAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WinEight_one_opera {
    public void win8_1Opera(RemoteWebDriver driver){

        screenShotNavigation chromeWinEight = new screenShotNavigation();
        chromeWinEight.navigation(driver);
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[8]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[9]")).click();
        driver.findElement(By.xpath("//*[@id=\"OSV100021498719908609\"]/div[2]/div[3]/div/div[10]")).click();
        launchButton hitlaunch = new launchButton();
        hitlaunch.launch(driver);
        MarkAsBug chromeeightpoint = new MarkAsBug();
        chromeeightpoint.mark(driver);

    }
}
