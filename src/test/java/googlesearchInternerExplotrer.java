
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Travel-user on 3/27/2017.
 */
public class googlesearchInternerExplotrer {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public static void setupClass() {

        InternetExplorerDriverManager.getInstance().version("3.3") .setup();

    }

    @Before
    public void start() {
        driver = new InternetExplorerDriver();
        wait = new WebDriverWait(driver, 10);

    }

    @Test
    public void MyTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("btnG")).click();
        wait.until(ExpectedConditions.titleIs("selenium - Пошук Google"));
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
