import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EllipsisAmount {

        @Test
        public void startWebDriver(){

            double current_price = 0.00;

            WebDriver driver = new ChromeDriver();

            try {
                driver.navigate().to("https://ellipsis.finance/stakeeps");
                /* Checking if not currently connected to the right newtwork and switch to the correct network*/
                if (driver.findElement(By.xpath("//*[@id=\"screen\"]/div[2]/button")).isDisplayed()) {
                    driver.findElement(By.xpath("//*[@id=\"screen\"]/div[2]/button")).click();
                    //might have to switch to a new window

                    driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[3]/div/div[2]/div[2]/button[2]")).click();

                    if (driver.findElement(By.xpath("//*[@id=\"screen\"]/div[6]/div[2]/fieldset[1]/button[1]")).isDisplayed()) {
                        driver.findElement(By.xpath("//*[@id=\"screen\"]/div[6]/div[2]/fieldset[1]/button[1]")).getText();

                        //now do the method to calculate the current price times the token price...
                    }




                } else {
                    if (driver.findElement(By.xpath("//*[@id=\"screen\"]/div[6]/div[2]/fieldset[1]/button[1]")).isDisplayed()) {
                        driver.findElement(By.xpath("//*[@id=\"screen\"]/div[6]/div[2]/fieldset[1]/button[1]")).getText();
                        System.out.println(driver.findElement(By.xpath("//*[@id=\"screen\"]/div[6]/div[2]/fieldset[1]/button[1]")).getText());

                        //now do the method to calculate the current price times the token price...
                    }
                }

//           System.out.println(Double.parseDouble("2.00".substring(0,4)));
//
//                if (current_price >= Double.parseDouble("2.00".substring(0,4))) {
//                    System.out.println("The price of Matic is at least $2.00");
//
//                }
            }
            finally {
                driver.close();
                driver.quit();

            }

        }
    }
