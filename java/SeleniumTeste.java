package Teste;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadores {

	static WebDriver driver;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver2.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://transparencia.criciuma.sc.gov.br/");
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector(".col-md-3:nth-child(2) > .lalaland")).click();
		driver.findElement(By.cssSelector("#labeldespesas0 .col-xs-7")).click();
		
		//WebElement botaoDespesa = driver.findElement(By.className("col-xs11"));
		//botaoDespesa.click();
		
	}


	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
}
