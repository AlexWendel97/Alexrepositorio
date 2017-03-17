package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	public static Empresa empresa;
	public static EmpresaDAO empresaDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
	}
	


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC01FB_cadastar_empresa_com_sucesso() {
		
		assertEquals(1,empresaDAO.adiciona(empresa));
	}


}
