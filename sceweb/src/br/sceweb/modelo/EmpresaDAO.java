package br.sceweb.modelo;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.sceweb.servico.FabricaDeConexoes;

public class EmpresaDAO {
	public int exclui (String cnpj) {

		java.sql.PreparedStatement ps;

		int codigoretorno = 0;

		try (Connection conn = new FabricaDeConexoes().getConnection()) {

		ps= conn.prepareStatement ("delete from empresa where cnpj = ?");

		ps.setString(1, cnpj);

		codigoretorno = ps.executeUpdate();

		}

		catch (SQLException e){

		throw new RuntimeException(e);

		}

		return codigoretorno;

		}
	
	public int adiciona(Empresa empresa){
		PreparedStatement ps;
		int codigoRetorno=0;
		try (Connection conn = new FabricaDeConexoes().getConnection()){
		ps = (PreparedStatement) conn.prepareStatement(
		"insert into empresa (cnpj, nomeDaEmpresa, nomeFantasia, endereco, telefone) values(?,?,?,?,?)");
		ps.setString(1,empresa.getCNPJ());
		ps.setString(2, empresa.getNomeDaEmpresa());
		ps.setString(3, empresa.getNomeFantasia());
		ps.setString(4, empresa.getEndereco());
		ps.setString(5, empresa.getTelefone());
		codigoRetorno = ps.executeUpdate();
		ps.close();
		} catch (SQLException e){
		throw new RuntimeException(e);
		}
		return codigoRetorno;
		}
	
	public static class UC01CadastrarEmpresa {
		
		static EmpresaDAO empresaDAO;

		static Empresa empresa;

	@BeforeClass
		

		public static void setUpBeforeClass() throws Exception {

		empresaDAO = new EmpresaDAO();

		empresa = new Empresa();

		empresa.setNomeDaEmpresa("empresa x");

		empresa.setCNPJ("89424232000180");

		empresa.setNomeFantasia("empresa x");

		empresa.setEndereco("rua taquari");

		empresa.setTelefone("2222");

		}

		/**

		* estabelece as pre-condicoes antes da execucao de cada teste

		* @throws Exception

		*/

		@After

		public void excluiEmpresa() throws Exception{

		empresaDAO.exclui("89424232000180");

		}

		/**

		* verifica o comportamento do sistema na inclusao de um cnpj valido

		*/

		@Test

		public void CT01UC01FBCadastra_com_sucesso() {
		
		assertEquals(1,empresaDAO.adiciona(empresa));

		}

		}


}


