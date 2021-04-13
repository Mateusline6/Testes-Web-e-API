package Steps;

import Pages.ApiGet;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ApiGetTest {

	ApiGet apiget = new ApiGet();

	@Dado("que eu acesse api get para consulta profissional")
	public void que_eu_acesse_api_get_para_consulta_profissional() {

		apiget.acessarApi("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a/data");

	}

	@Entao("valido o status code de retorno")
	public void valido_o_status_code_de_retorno() {
		apiget.statusCode(200);
	}

	@Entao("valido o nome {string}")
	public void valido_o_nome(String texto) {
		apiget.body(texto);
	}

}
