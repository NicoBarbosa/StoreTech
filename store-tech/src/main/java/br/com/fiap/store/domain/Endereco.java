package br.com.fiap.store.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//Mizack
@Entity
@Table(name = "tb_fm_endereco")
public class Endereco {

	@Id
	@SequenceGenerator(name="endereco",sequenceName="sq_fm_endereco",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="endereco")
	@Column(name = "id_endereco")
	private Integer idEndereco;
	
	@Column(name="nm_rua",nullable=false,length=40)
	private String nomeRua;
	
	@Column(name="nm_bairro",nullable=false,length=40)
	private String nomeBairro;
	
	@Column(name="nr_endereco",nullable=false,length=6)
	private int numeroEnd;
	
	@Column(name="nm_estado",nullable=false,length=20)
	private String nomeEstado;
	
	@Column(name="nm_cidade",nullable=false,length=30)
	private String nomeCidade;
	
	@Column(name="nr_cep",nullable=false,length=8)
	private int numeroCep;
	
	@Column(name="ds_complemento",length=70)
	private String complemento;
	
	@JoinColumn(name="id_cliente")
	@ManyToOne
	private Cliente clienteEndereco;

	public Endereco() {
		super();
	}

	public Endereco(Integer idEndereco, String nomeRua, String nomeBairro, int numeroEnd, String nomeEstado,
			String nomeCidade, int numeroCep, String complemento, Cliente clienteEndereco) {
		super();
		this.idEndereco = idEndereco;
		this.nomeRua = nomeRua;
		this.nomeBairro = nomeBairro;
		this.numeroEnd = numeroEnd;
		this.nomeEstado = nomeEstado;
		this.nomeCidade = nomeCidade;
		this.numeroCep = numeroCep;
		this.complemento = complemento;
		this.clienteEndereco = clienteEndereco;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public int getNumeroEnd() {
		return numeroEnd;
	}

	public void setNumeroEnd(int numeroEnd) {
		this.numeroEnd = numeroEnd;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public int getNumeroCep() {
		return numeroCep;
	}

	public void setNumeroCep(int numeroCep) {
		this.numeroCep = numeroCep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Cliente getCliente() {
		return clienteEndereco;
	}

	public void setCliente(Cliente clienteEndereco) {
		this.clienteEndereco = clienteEndereco;
	}
	
}
