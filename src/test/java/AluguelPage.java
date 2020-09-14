package page.logon;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;

import logon.Navegador;

public class AluguelPage extends Navegador {

	public void abrirPagina() throws IOException {

		System.out.println("Abrindo Pagina do Teste");

		// String url = Configuracoes.lerConfiguracao("pagina-pesquisa");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.get("http://10.24.88.121/webview/showroom/#/login");
		driver.get("https://www.movida.com.br/");
		driver.manage().window().maximize();
	}

	public String getTituloPagina() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String tituloPagina = driver.getTitle().toString();

		return tituloPagina;
	}

	
	public String getRetornoErro() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("warning-info"));
		return element.getText();

	}

	public void preencherLocalRetirada(String origem) {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement frame = driver.findElement(By.id("formSearchEngine"));

		frame.findElement(By.xpath("//*[@id=\"formSearchEngine\"]/div/div[1]/input[1]"))
				.sendKeys(origem);
		
		frame.findElement(By.xpath("//*[@id=\"formSearchEngine\"]/div/div[1]/input[1]")).click();

	}	
	
	public void preencherLocalDevolucao(String devolucao) {

		WebElement frame = driver.findElement(By.id("formSearchEngine"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		frame.findElement(By.xpath("//*[@id=\"formSearchEngine\"]/div/div[2]/input[1]"))
				.sendKeys(devolucao);
	}

	public void preencherCodigoPromocional(String codigo) {

		WebElement frame = driver.findElement(By.id("formSearchEngine"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		frame.findElement(By.xpath("//*[@id=\"cupom\"]"))
				.sendKeys(codigo);

	}
	
	
	public void clicarCodigoPromocional() {
		WebElement frame = driver.findElement(By.id("formSearchEngine"));
		frame.findElement(By.xpath("*[@id=\"formSearchEngine\"]/div/div[5]/div/input")).click();	
		
	}
	
	public void clicarDevolverEmOutraLoja() {
		WebElement frame = driver.findElement(By.id("formSearchEngine"));
		frame.findElement(By.xpath("//*[@id=\"formSearchEngine\"]/div/span/div/input")).click();
	}
}
