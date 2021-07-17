import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitListTest {
    /*~~~~~~~~
brew cask upgrade chromedriver
~~~~~~~~

     */

    @Test
    public void startWebDriver(){


        WebDriver driver = new ChromeDriver();

        try{
            driver.navigate().to("https://sfha.org/Pages/wl.aspx");
            Assert.assertEquals("ALL WAITLISTS ARE CLOSED. Sorry, but our office is currently unable to take new applications right now.",
                    driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_RichHtmlField1__ControlWrapper_RichHtmlField\"]/h2[1]/span/strong")).getText());

        }
        finally {
            driver.close();
            driver.quit();

        }

    }
}






