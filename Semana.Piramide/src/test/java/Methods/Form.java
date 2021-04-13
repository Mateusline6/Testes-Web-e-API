package Methods;



import java.io.IOException;

import Elements.Elements;

public class Form {

	Methods m = new Methods();
	Elements l = new Elements();
	public void preencherForm(String nome, String email, String msg) throws IOException {
		
		m.escrever(l.getNome(), nome);
		m.escrever(l.getEmail(), email);
		m.escrever(l.getMsg(), msg);
		
		m.screenshot("CT01 -  evidencia1");
	}
	
	
}
