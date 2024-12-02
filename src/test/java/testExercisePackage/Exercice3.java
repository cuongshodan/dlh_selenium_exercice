package testExercisePackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercice3 {


    String GREEN = "\u001B[32m";
    String RED = "\u001B[31m";
    String RESET = "\u001B[0m"; // Reset color to default

    @Test
    public void test_web_1() {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:/browser_drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebElement toto = driver.findElement(By.id("username"));

        driver.manage().window().maximize();

        String baseUrl = "https://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();



        driver.findElement(By.linkText("REGISTER")).click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL is: " + currentUrl);

        Select countrySelect = new Select(driver.findElement(By.name("country")));
        countrySelect.selectByValue("LUXEMBOURG");

        driver.findElement(By.name("firstName")).sendKeys("Johnny");
        driver.findElement(By.name("lastName")).sendKeys("Quest");
        driver.findElement(By.name("phone")).sendKeys("585678");
        driver.findElement(By.name("lastName")).sendKeys("Quest");
        driver.findElement(By.name("userName")).sendKeys("JohnnyQueckeg@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("78 avenue de la liberté");
        driver.findElement(By.name("city")).sendKeys("Differdange");
        driver.findElement(By.name("state")).sendKeys("Minette");
        driver.findElement(By.name("postalCode")).sendKeys("4894");
        driver.findElement(By.name("email")).sendKeys("johnnyqueckeg");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456");
        driver.findElement(By.name("submit")).click();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println(GREEN + "Test Passed!" + RESET);
            //System.out.println("Test Passed!");
        } else {
            System.out.println(RED + "Test Failed!" + RESET);
            //System.out.println("Test Failed!");
        }

        //close Chrome
        //driver.close();
    }
}
