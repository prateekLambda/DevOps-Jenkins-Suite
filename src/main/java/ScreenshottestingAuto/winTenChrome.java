package ScreenshottestingAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class winTenChrome {


    public void winTenChrom(RemoteWebDriver driver) {
        try {
            /*ScreenshottestingAuto.Credentials chrome = new ScreenshottestingAuto.Credentials();
            chrome.crden(driver);
*/


            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[3]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[4]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[5]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[6]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[7]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[8]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[9]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[1]/div/div[10]")).click();

            launchButton hitlaunch = new launchButton();
            hitlaunch.launch(driver);

            MarkAsBug markAsBug = new MarkAsBug();
            markAsBug.mark(driver);


        } catch (Exception c) {
            System.out.println(c.getMessage());
        }
    }


}
