package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.ExecutaRealizarCompra;

public class RealizarCompra {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		ExecutaRealizarCompra.abrirNavegador();
	}
    @After
	public void finalizarTeste() {
		ExecutaRealizarCompra.fecharNavegador();
	}
	
	@Dado("Realizando o login")
	public void realizandoOLogin() {

		metodos.escrever(el.usarName, "performance_glitch_user");
		metodos.escrever(el.passWord, "secret_sauce");
		metodos.clicar(el.login);
		metodos.clicar(el.option);
	}

	@Quando("escolher produto")
	public void escolherProduto() {

		metodos.clicar(el.escolhendoProduto);
		metodos.clicar(el.adicionarCarrinho);
		metodos.clicar(el.checKout);
	}

	@Quando("Preencher minhas informa�oes")
	public void preencherMinhasInformaOes() {

		metodos.escrever(el.firstName, "Vinicius");
		metodos.escrever(el.lastName, "Silva");
		metodos.escrever(el.postalCode, "06140000");
	}

	@Entao("Validamos a compra com sucesso")
	public void validamosACompraComSucesso() {

		metodos.clicar(el.btnSubmit);
		metodos.clicar(el.btnFinish);
	}
   
	
}
