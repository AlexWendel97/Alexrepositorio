package br.sceweb.modelo;


import java.util.InputMismatchException;

public class Empresa {
	String CNPJ;
	String NomeDaEmpresa;
	String NomeFantasia;
	String endereco;
	String Telefone;
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNomeDaEmpresa() {
		return NomeDaEmpresa; 
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		
		if (nomeDaEmpresa.equals("")) {
		throw new IllegalArgumentException("Nome da empresa inválido!");
		} else
		this.NomeDaEmpresa = nomeDaEmpresa;
		}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.equals("")) {
			throw new IllegalArgumentException("Nome da fantasia inválido!");
			} else
			this.NomeFantasia = nomeFantasia;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco.equals("")) {
			throw new IllegalArgumentException(" endereço inválido!");
			} else
			this.endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		if (telefone.equals("")) {
			throw new IllegalArgumentException("telefone inválido!");
			} else
			this.Telefone = telefone;
	}
	

}
