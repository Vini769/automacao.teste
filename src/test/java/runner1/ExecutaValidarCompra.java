package runner1;



import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conexao.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps1", tags = "@ValidarCompra", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE

)
public class ExecutaValidarCompra extends DriversFactory {

	public static void abrirNavegador() {

		String url = "https://www.saucedemo.com/";
		String navegador = "Chrome";

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Digite Chrome ou Firefox");
		}

		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void fecharNavegador() {
     driver.quit();
	}

}

