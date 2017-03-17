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
		throw new IllegalArgumentException("Nome da empresa inv�lido!");
		} else
		this.NomeDaEmpresa = nomeDaEmpresa;
		}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.equals("")) {
			throw new IllegalArgumentException("Nome da fantasia inv�lido!");
			} else
			this.NomeFantasia = nomeFantasia;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco.equals("")) {
			throw new IllegalArgumentException(" endere�o inv�lido!");
			} else
			this.endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		if (telefone.equals("")) {
			throw new IllegalArgumentException("telefone inv�lido!");
			} else
			this.Telefone = telefone;
	}
	

}
