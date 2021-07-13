import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolygonTokenPrice {
    @Test
    public void startWebDriver(){

        double current_price = 0.00;

        WebDriver driver = new ChromeDriver();

        try {
            driver.navigate().to("https://www.coingecko.com/en/coins/polygon");

//            String retrievePrice = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div[2]/div[2]/div/div[1]/span[1]/span")).getText();
//            System.out.println(retrievePrice);

//            String retrievePrice = driver.findElement(By.xpath("//span[@data-coin-symbol='matic'][@data-price-previous]")).getText();
//            System.out.println(retrievePrice);

            //span[@data-price-previous]

            String retrievePrice = driver.findElement(By.xpath("//span[@class='tw-text-gray-900 dark:tw-text-white']/span[@data-coin-symbol='matic'][@data-coin-id][@data-price-previous]")).getText();
            System.out.println(retrievePrice);

            //span/span[@data-coin-symbol='matic'][@data-coin-id][@data-price-previous]







            //current_price = Double.parseDouble(driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div[2]/div[2]/div/div[1]/span[1]/span")).getText().substring(1,5));

//           System.out.println(current_price);
//
//           System.out.println(Double.parseDouble("2.00".substring(0,4)));

           if (current_price >= Double.parseDouble("2.00".substring(0,4))) {
               System.out.println("The price of Matic is at least $2.00");

            }
        }
        finally {
            driver.close();
            driver.quit();

        }

    }
}




//span[@class='tw-text-gray-900 dark:tw-text-white']/span[@data-coin-symbol='matic'][@data-coin-id][@data-price-previous]