package br.com.fiap.view;

import java.sql.SQLException;
import br.com.fiap.controller.ClienteController;
import br.com.fiap.controller.ContatoClienteController;
import br.com.fiap.controller.ContratoController;
import br.com.fiap.controller.CorretorController;
import br.com.fiap.controller.SaudeClienteController;
import br.com.fiap.controller.SeguroVidaController;
import br.com.fiap.data.Data;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.ContatoCliente;
import br.com.fiap.model.Contrato;
import br.com.fiap.model.Corretor;
import br.com.fiap.model.SaudeCliente;
import br.com.fiap.model.SeguroVida;

public class Executavel {

	public static void main(String[] args) throws SQLException  {
		
		Data data = new Data();
		
		Cliente samuel = new Cliente("Samuca", "044.788.123-26", data.dataAlt(23, 9, 1997), "Brasileiro", "44.585.226-1", 'M', "Dentista", "Solteiro", 7200.50);
		ClienteController cliController = new ClienteController();
		
		ContatoCliente contatoCliente = new ContatoCliente("sadsadas", 1231442, "11934234", "asdsada", 134, "dsadas", "Casa", "dsadsa", "sdads", "dsadas", 2);
		ContatoClienteController contaController = new ContatoClienteController();
		
		Contrato samuelContrato = new Contrato("Samuel Boaventura", "Rafael Ryan Almeida", data.dataHoje(), null, cliController.cdPorCPF("044.788.123-26"), 1, 1);
		ContratoController conController = new ContratoController();
		
		SeguroVida seguroVida = new SeguroVida();
		SeguroVidaController segController = new SeguroVidaController();
		
		Corretor corretor = new Corretor();
		CorretorController corController = new CorretorController();
		
		SaudeCliente saudeCliente = new SaudeCliente("Samuca", "Paraquedismo", "Anemia", 'S', 2);
		SaudeClienteController sauController = new SaudeClienteController();
		
		corController.selectSalarioMenor(2000);
		
	}

}
