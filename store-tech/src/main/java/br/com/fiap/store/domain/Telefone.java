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
@Table(name = "tb_fm_telefone")
public class Telefone {

	@Id
	@SequenceGenerator(name="telefone",sequenceName="sq_fm_telefone",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="telefone")
	@Column(name = "id_telefone")
	private Integer idTelefone;
	
	@Column(name="vl_ddd",nullable=false,length=3)
	private int valorDdd;
	
	@Column(name="vl_telef",nullable=false,length=9)
	private int numeroTelefone;
	
	@JoinColumn(name="id_cliente")
	@ManyToOne
	private Cliente clienteTelefone;
	
	public Telefone() {
		super();
	}

	public Telefone(Integer idTelefone, int valorDdd, int numeroTelefone, Cliente clienteTelefone) {
		super();
		this.idTelefone = idTelefone;
		this.valorDdd = valorDdd;
		this.numeroTelefone = numeroTelefone;
		this.clienteTelefone = clienteTelefone;
	}

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	public int getValorDdd() {
		return valorDdd;
	}

	public void setValorDdd(int valorDdd) {
		this.valorDdd = valorDdd;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Cliente getCliente() {
		return clienteTelefone;
	}

	public void setCliente(Cliente clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}
	
}
