package testExercisePackage2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTestClass2 {

    String GREEN = "\u001B[32m";
    String RED = "\u001B[31m";
    String RESET = "\u001B[0m"; // Reset color to default

	@Test
    public void test_web_1() {

        // declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:/browser_drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebElement toto = driver.findElement(By.id("username"));

        driver.manage().window().maximize();
		
        String baseUrl = "https://demo.guru99.com/test/newtours/index.php";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);        

        // get the actual value of the title
        actualTitle = driver.getTitle();

        try {
            Thread.sleep(3500);
        }
        catch (InterruptedException ie) {
            System.out.println(("Some Error has occurred:" + ie));
        }

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println(GREEN + "Test Passed!" + RESET);
            //System.out.println("Test Passed!");
        } else {
            System.out.println(RED + "Test Failed!" + RESET);
            //System.out.println("Test Failed!");
        }
       
        //close Chrome
        driver.close();
       
    }

}