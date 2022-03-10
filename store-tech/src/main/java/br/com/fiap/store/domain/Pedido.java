package br.com.fiap.store.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
//Nicolas
@Entity
@Table(name = "tb_fm_pedido")
public class Pedido {
	
	@Id
	@SequenceGenerator(name="pedido",sequenceName="sq_fm_pedido",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pedido")
	@Column(name = "id_pedido")
	private Integer idPedido;
	
	@Column(name = "ds_status", length = 20, nullable = false)
	private String status;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_pedido")
	private Calendar dataPedido;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_atualizacao")
	private Calendar dataAtualizacao;

	//Chaves Estrangeiras...
	
	@OneToOne
	@JoinColumn(name = "id_carrinho")
	private Carrinho carrinho;
	
	@OneToOne
	@JoinColumn(name = "id_pagamento")
	private Pagamento pagamento;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	public Pedido() {
		super();
	}

	public Pedido(Integer idPedido, String status, Calendar dataPedido, Calendar dataAtualizacao, Carrinho carrinho,
			Pagamento pagamento, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.status = status;
		this.dataPedido = dataPedido;
		this.dataAtualizacao = dataAtualizacao;
		this.carrinho = carrinho;
		this.pagamento = pagamento;
		this.cliente = cliente;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Calendar getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
