import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //---Variables---
        //DriverManager instance = null;
        WebDriver driver;
        //---Variables---
        
        System.setProperty("webdriver.gecko.driver", "D:\\SourceCode\\Java\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://yandex.ru");
        //goByLinkText(linkText);
        driver.findElement(By.linkText("Маркет")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Компьютеры")).click();
        Thread.sleep(5000);
        //Ноутбуки
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[1]/div/a[2]")).click();
        //Цена от
        driver.findElement(By.xpath("//*[@id=\"glf-pricefrom-var\"]")).sendKeys("0");
        //Цена до
        driver.findElement(By.xpath("//*[@id=\"glf-priceto-var\"]")).sendKeys("30000");
        Thread.sleep(3000);
        //Применить
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[32]/div[1]/button")).click();

        //Показать по
        //"//select[@class='select__control']"
        //"//option[@class='select__option'][@value='12']"


        //Вар 7
        //driver.findElement(By.xpath(".//*[@value='12']")).click();
        //WebElement listbox = driver.findElement(By.xpath("//select[@class='select__control']"));
        //listbox.sendKeys("Показывать по 12");
        //listbox.sendKeys(Keys.DOWN);
        //listbox.sendKeys(Keys.ENTER);

        //Вар 6
        //Выводит на экран: value: 12
        //String idDocumento=driver.findElement(By.xpath("//option[@class='select__option']")).getAttribute("value");
        //System.out.println("value: "+idDocumento);

        //Вар 6
        String idDocumento=driver.findElement(By.xpath("//select[@class='select__control']")).getAttribute("autocomplete");
        System.out.println("autocomplete: "+idDocumento);

        //Вар 5
        //Отрабатывает, но ничего не происходит
        //Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='select__control']")));
        //dropdown.selectByIndex(1);

        //Вар 4
        /*List<WebElement> options = select.findElements(By.xpath("//option[@class='select__option']"));
        for (WebElement option : options) {
            if("12".equals(option.getAttribute("value")))
                System.out.println("Нажимаем...");
                option.click();
                option.
        }*/

       //Вар 1
        //Не работает: Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: Element <option class="select__option"> could not be scrolled into view
        /* WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//select[@class='select__option']")));
        driver.findElement(By.xpath("//option[@class='select__option'][@value='12']")).click();*/

       //Вар 2
        //Не работает: Exception in thread "main" org.openqa.selenium.
        // TimeoutException: Expected condition failed: waiting for element
        // to be clickable: By.xpath: //select[@class='select__option'] (tried for 10 second(s) with 500 MILLISECONDS interval)
        //WebDriverWait wait1 = new WebDriverWait(driver, 10);
        //WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='select__option']")));
        //WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@class='select__option'][@value='12']")));
        //element2.click();

        //Вар 3
        //WebElement ele = driver.findElement(By.xpath("//select[@class='select__control']"));
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", ele.getTagName());

        //driver.findElement(By.xpath("//select[@class='select__control']")).sendKeys(Keys.ARROW_DOWN);
        //driver.findElement(By.xpath("//select[@class='select__control']")).sendKeys(Keys.ENTER);

       // driver.findElement(By.xpath("//select[@class='select__control']")).click();
        //List<WebElement> options = driver.findElements(By.xpath("//select[@class='select__control']"));
        List<WebElement> options = driver.findElements(By.xpath("//option[@class='select__option']"));
        System.out.println(options.size());
       // for (WebElement option : options) {
            //if("12".equals(option.getAttribute("value")))
            //    System.out.println("Нажимаем...");
            //option.click();
            //System.out.println(option.click());
       // }


        //Вар 8
        /*((JavascriptExecutor)driver).executeScript("window.scrollTo(" + driver.findElement(By.xpath("//option[@class='select__option']")).getLocation().x
                + "," + driver.findElement(By.xpath("//option[@class='select__option']")).getLocation().y + ")");*/

        //Вар 9
        /*WebDriverWait wait = new WebDriverWait(driver, 3);
        JavascriptExecutor js = ((JavascriptExecutor) driver);

        //presence in DOM
        //wait.until(ExpectedConditions.presenceOfElement(By.id("ID")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@class='select__control']")));

        //scrolling
        WebElement element = driver.findElement(By.xpath("//option[@class='select__option']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@class='select__option'][@value='12']")));*/

        //Вар 10

        //driver.close();
    }


}
