package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testReservasVuelos {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpulido\\Documents\\2020\\Automatizaciones\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.despegar.com.co/"); // acceder a la url pagina de vuelos (Despegar)
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline']")).sendKeys("BERL");;
		Thread.sleep(2000);
		
		WebElement destino = driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[1]/span"));
		destino.click();
		
		
		
		
		
		Thread.sleep(2000);
		
		WebElement seleccionarFecha = driver.findElement(By.xpath("//div[@class='input-container sbox-bind-event-click-start-date']/i"));
		seleccionarFecha.click();
		
		WebElement seleccionDia = driver.findElement(By.xpath("//div[2]/div[4]/span[7]/span[1]"));
		seleccionDia.click();
		
		WebElement seleccionMes = driver.findElement(By.xpath("//div[@class='_dpmg2--controls-next']/i"));
		seleccionMes.click();
		
		WebElement nextMonth = driver.findElement(By.xpath("//div[@class='_dpmg2--controls-next']/i"));
		nextMonth.click();
		Thread.sleep(1000);
		
		WebElement nextMonth2 = driver.findElement(By.xpath("//div[@class='_dpmg2--controls-next']/i"));
		nextMonth2.click();
		Thread.sleep(1000);
		
		WebElement nextMonth3 = driver.findElement(By.xpath("//div[@class='_dpmg2--controls-next']/i"));
		nextMonth3.click();
		Thread.sleep(1000);
		
		WebElement nextMonth4 = driver.findElement(By.xpath("//div[@class='_dpmg2--controls-next']/i"));
		nextMonth4.click();
		Thread.sleep(1000);
		
		WebElement nextMonth5 = driver.findElement(By.xpath("//div[@class='_dpmg2--controls-next']/i"));
		nextMonth5.click();
		Thread.sleep(1000);
		
		WebElement nextMonth6 = driver.findElement(By.xpath("//div[@class='_dpmg2--controls-next']/i"));
		nextMonth6.click();
		Thread.sleep(1000);
		
		WebElement returnDay = driver.findElement(By.xpath("//div[10]/div[4]/span[11]/span[1]"));
		returnDay.click();
		Thread.sleep(2000);
		
		WebElement aplicar = driver.findElement(By.xpath("//em[@class='_dpmg2--desktopFooter-button-apply-text btn-text']"));
		aplicar.click();
		
		WebElement buscar = driver.findElement(By.xpath("//a[@class='sbox-3-btn -primary -md sbox-search']"));
		buscar.click();
		
		
		//Seleccion filtro búsqueda
		WebElement filtro = driver.findElement(By.xpath("//div[@id='order']/div/div/select"));
		filtro.click();
		Thread.sleep(5000);
		
		
		
		
		/// Ordenar por Duracion
		
		WebElement ordenarDuracion = driver.findElement(By.xpath("//*[@id='eva-select']/option[3]"));
		ordenarDuracion.click();
		Thread.sleep(5000);
		
		
		WebElement filtro2 = driver.findElement(By.xpath("//div[@id='order']/div/div/select"));
		filtro2.click();
		Thread.sleep(5000);
		
		
		//Ordenar por precio
		
		WebElement ordenarPrecio = driver.findElement(By.xpath("//*[@id='eva-select']/option[1]"));
		ordenarPrecio.click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
	}

}
