package br.com.fiap.store.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;
//Nicolas
@Entity
@Table(name = "tb_fm_pagamento")
public class Pagamento {

	@Id
	@SequenceGenerator(name="pagamento",sequenceName="sq_fm_pagamento",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pagamento")
	@Column(name = "id_pagamento")
	private Integer idPagamento;
	
	@Column(name = "vl_pedido", length = 10, nullable = false)
	private Double valorPedido;
	
	@Column(name = "vl_pix_codigo_pg", length = 200)
	private String valorPixCodigo;
	
	@Column(name = "nr_cartao", length = 40)
	private Integer numeroCartao;
	
	@Column(name = "nm_cartao", length = 40)
	private String nomeNoCartao;
	
	@Column(name = "qt_parcelas", length = 2)
	private Integer quantidadeParcelas;
	
	@Column(name = "ds_cvv", length = 3)
	private Integer descricaoCvv;
	
	@Column(name = "dt_cartao_validade")
	private Calendar dataCartaoValidade;
	
	@Column(name = "dt_boleto_vencimento")
	private Calendar dataBoletoVencimento;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_pagamento")
	private Calendar dataPagamento;
	
	@UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_alteracao", nullable = false)
	private Calendar dataAlteracao;
	
	@OneToOne(mappedBy = "pagamento")
	private Pedido pedido;

	public Pagamento() {
		super();
	}
	
	public Pagamento(Integer idPagamento, Double valorPedido, String valorPixCodigo, Integer numeroCartao,
			String nomeNoCartao, Integer quantidadeParcelas, Integer descricaoCvv, Calendar dataCartaoValidade,
			Calendar dataBoletoVencimento, Calendar dataPagamento, Calendar dataAlteracao, Pedido pedido) {
		super();
		this.idPagamento = idPagamento;
		this.valorPedido = valorPedido;
		this.valorPixCodigo = valorPixCodigo;
		this.numeroCartao = numeroCartao;
		this.nomeNoCartao = nomeNoCartao;
		this.quantidadeParcelas = quantidadeParcelas;
		this.descricaoCvv = descricaoCvv;
		this.dataCartaoValidade = dataCartaoValidade;
		this.dataBoletoVencimento = dataBoletoVencimento;
		this.dataPagamento = dataPagamento;
		this.dataAlteracao = dataAlteracao;
		this.pedido = pedido;
	}

	public Integer getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(Integer idPagamento) {
		this.idPagamento = idPagamento;
	}

	public Double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public String getValorPixCodigo() {
		return valorPixCodigo;
	}

	public void setValorPixCodigo(String valorPixCodigo) {
		this.valorPixCodigo = valorPixCodigo;
	}

	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeNoCartao() {
		return nomeNoCartao;
	}

	public void setNomeNoCartao(String nomeNoCartao) {
		this.nomeNoCartao = nomeNoCartao;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public Integer getDescricaoCvv() {
		return descricaoCvv;
	}

	public void setDescricaoCvv(Integer descricaoCvv) {
		this.descricaoCvv = descricaoCvv;
	}

	public Calendar getDataCartaoValidade() {
		return dataCartaoValidade;
	}

	public void setDataCartaoValidade(Calendar dataCartaoValidade) {
		this.dataCartaoValidade = dataCartaoValidade;
	}

	public Calendar getDataBoletoVencimento() {
		return dataBoletoVencimento;
	}

	public void setDataBoletoVencimento(Calendar dataBoletoVencimento) {
		this.dataBoletoVencimento = dataBoletoVencimento;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Calendar getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Calendar dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
