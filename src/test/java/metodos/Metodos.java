package metodos;

import org.openqa.selenium.By;

import conexao.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

}
