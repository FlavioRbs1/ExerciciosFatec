package Loja_virtual;

import java.util.Date;

public class Contato {
	private long id;
	private String Nome;
	private String usuario;
	private String Senha;
	private Date Nascimento;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		this.Senha = senha;
	}
	public Date getNascimento() {
		return Nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.Nascimento = nascimento;
	}

}
