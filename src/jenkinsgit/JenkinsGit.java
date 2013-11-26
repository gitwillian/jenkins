/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkinsgit;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class JenkinsGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String testJenkins = "testeJnekins";
        float test = 0;
        
        System.out.println(testJenkins + test + "testando");
//        WebDriver driver = null;
//        FirefoxProfile profile = new FirefoxProfile();
//        profile.setPreference("network.proxy.type", 0);
//        driver = new FirefoxDriver(profile);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("https://www.google.com.br/");
//        driver.findElement(By.id("gbqfq")).sendKeys("jenkins git");
//        driver.findElement(By.id("gbqfb")).click();
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        FileUtils.copyFile(scrFile, new File("C:\\Users\\willian\\Automation-Test\\Server\\Evidencias\\screenshot.png"));
//        Quit quit = new Quit();
//        quit.tearDown(driver);
    }

    public static class Quit {

        public void tearDown(WebDriver driver) {
            driver.close();
            driver.quit();
            System.exit(0);
        }
    }
}
