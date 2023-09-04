package com.andrino.model;

import java.util.Objects;

public class Telefone {
	
	private Long id;
	private String ddd;
	private String numero;
	
	private TipoTelefone tipoTelefone;
	
	private Pessoa pessoa;
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(ddd, id, numero, pessoa, tipoTelefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(ddd, other.ddd) && Objects.equals(id, other.id) && Objects.equals(numero, other.numero)
				&& Objects.equals(pessoa, other.pessoa) && tipoTelefone == other.tipoTelefone;
	}

	public Telefone(String ddd, String numero, TipoTelefone tipoTelefone) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.tipoTelefone = tipoTelefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
