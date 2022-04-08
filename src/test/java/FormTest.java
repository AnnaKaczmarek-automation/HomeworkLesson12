import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.FormPage;

public class FormTest extends TestBase {
    Logger log = LoggerFactory.getLogger("FormTest.class");

    @Test
    public void fillForm() {
        FormPage formPage = new FormPage(driver);
        formPage.setName(System.getProperty("firstName"));
        log.info("***** Name is correctly set *****");
        formPage.setSecondName(System.getProperty("secondName"));
        log.info("***** Second name is correctly set *****");
        formPage.setMail(System.getProperty("mail"));
        log.info("***** Mail is correctly set *****");
        formPage.selectGenderOption();
        log.info("***** Gender option is correctly selected *****");
        formPage.setAge(Integer.parseInt(System.getProperty("age")));
        log.info("***** Age is correctly set *****");
        formPage.setYearOfExperience();
        log.info("***** Year of experience is correctly selected *****");
        formPage.setAutomationTesterProfession();
        log.info("***** Profession is correctly selected *****");
        formPage.selectContinent(System.getProperty("continent"));
        log.info("***** Continent is correctly selected *****");
        formPage.selectSeleniumCommand();
        log.info("***** Selenium commands are correctly selected *****");
        formPage.selectFile();
        log.info("***** File is correctly selected *****");
        formPage.selectSignInButton();
        log.info("***** 'Sign in' button is correctly selected *****");
        formPage.varifyValidationMessage();
        log.info("***** Correct validation message is displayed *****");
    }
}
