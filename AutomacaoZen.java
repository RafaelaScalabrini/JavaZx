package InterviewZen;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.webDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoZen {

	@Test
	public void pesquisarGoogle() {
		System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		
		navegador.get("http://www.google.com");
	}
}
