package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By usarName = By.xpath("//*[@id=\"user-name\"]");

	public By passWord = By.xpath("//*[@id=\"password\"]");

	public By login = By.xpath("//*[@id=\"login-button\"]");

	public By option = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");

	public By escolhendoProduto = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");

	public By adicionarCarrinho = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

	public By checKout = By.xpath("//*[@id=\"checkout\"]");

	public By firstName = By.xpath("//*[@id=\"first-name\"]");

	public By lastName = By.xpath("//*[@id=\"last-name\"]");

	public By postalCode = By.xpath("//*[@id=\"postal-code\"]");

	public By btnSubmit = By.xpath("//*[@id=\"continue\"]");

	public By btnFinish = By.xpath("//*[@id=\"finish\"]");
    
	public By addCard = By.className("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
}
