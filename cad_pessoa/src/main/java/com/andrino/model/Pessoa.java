package com.andrino.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Pessoa {
	private Long id;
	private String nome;
	private Date dataNascimento;
	private String genero;
	
	private Endereco endereco;
	
	private List<Telefone> telefones = new ArrayList<>();

	public Pessoa(String nome, String genero, Endereco endereco, List<Telefone> telefones) {
		super();
		this.nome = nome;
		
		this.genero = genero;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, endereco, genero, id, nome, telefones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(genero, other.genero) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefones, other.telefones);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	



}
