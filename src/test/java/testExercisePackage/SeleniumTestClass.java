package testExercisePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;



public class SeleniumTestClass {

	@Test
    public void test_web_1() {
        // declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:/browser_drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebElement toto = driver.findElement(By.id("username"));
		
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);        

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Chrome
        driver.close();
       
    }

}