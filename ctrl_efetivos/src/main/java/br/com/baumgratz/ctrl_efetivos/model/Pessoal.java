package br.com.baumgratz.ctrl_efetivos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoal {
	
	// ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String nomeGuerra;
	private String postoGrad;
	private String arma;
	private String especialidade;
	private String idtMil;
	private String segmento;
	private String situacao;
	private String formacao;
	private String dataApres;
	private String dataPraca;
	private int pnr;
	private String setor;
	
	
	// GETTERS & SETTERS
	
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
	public String getNomeGuerra() {
		return nomeGuerra;
	}
	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}
	public String getPostoGrad() {
		return postoGrad;
	}
	public void setPostoGrad(String postoGrad) {
		this.postoGrad = postoGrad;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getIdtMil() {
		return idtMil;
	}
	public void setIdtMil(String idtMil) {
		this.idtMil = idtMil;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getDataApres() {
		return dataApres;
	}
	public void setDataApres(String dataApres) {
		this.dataApres = dataApres;
	}
	public String getDataPraca() {
		return dataPraca;
	}
	public void setDataPraca(String dataPraca) {
		this.dataPraca = dataPraca;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

	
	
}
