import configuration.BrowserEnvironment;
import configuration.EnvironmentProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    protected static WebDriver driver;
    private static Logger log = LoggerFactory.getLogger("BaseData.BaseTest.class");
    private  static BrowserEnvironment browserEnvironment;
    private  static EnvironmentProperty environmentProperty;

    @BeforeAll
    static void beforeAll() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        driver= browserEnvironment.getDriver();
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
        log.info("***** Driver closed *****");
    }
}
