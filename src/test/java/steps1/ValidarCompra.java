package steps1;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.ExecutaRealizarCompra;

public class ValidarCompra {
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

	@Dado("Que usuario possa acessar o site")
	public void queUsuarioPossaAcessarOSite() {
		metodos.escrever(el.usarName, "problem_user");
		metodos.escrever(el.passWord, "secret_sauce");
		metodos.clicar(el.login);
		metodos.clicar(el.option);
	}

	@Quando("Preencher formulario")
	public void preencherFormulario() {
		metodos.clicar(el.escolhendoProduto);
		metodos.clicar(el.adicionarCarrinho);
		metodos.clicar(el.checKout);

		metodos.escrever(el.firstName, "Vinicius");
		metodos.escrever(el.lastName, "Silva");
		metodos.escrever(el.postalCode, "06140000");

	}

	@Entao("Validamos a compra")
	public void validamosACompra() {
		metodos.clicar(el.btnSubmit);
		metodos.clicar(el.btnFinish);
	}

}
