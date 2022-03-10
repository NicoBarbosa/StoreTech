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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
//Amanda
@Entity
@Table(name = "tb_fm_produto")
public class Produto {

	@Id
	@SequenceGenerator(name="produto",sequenceName="sq_fm_produto",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="produto")
	@Column(name = "id_produto")
	private Integer idProduto;
	
	@OneToOne(mappedBy = "produto")
	private Carrinho carrinho;
	
	@Column(name = "nm_produto",nullable=false,length=100)
	private String nome;
	
	@Column(name = "vl_preco")
	private double preco;
	
	@Column(name = "qt_produto")
	private int quantidade;
	
	@Column(name = "nm_categoria")
	private String categoria;
	
	@CreationTimestamp
	@Column(name = "dt_cadastro")
	private Calendar cadastro;
	
	@UpdateTimestamp
	@Column(name = "dt_alteracao")
	private Calendar alteracao;

	public Produto() {
		super();
	}

	public Produto(Integer idProduto, String nome, double preco, int quantidade, String categoria, Calendar cadastro,
			Calendar alteracao) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.cadastro = cadastro;
		this.alteracao = alteracao;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Calendar getCadastro() {
		return cadastro;
	}

	public void setCadastro(Calendar cadastro) {
		this.cadastro = cadastro;
	}

	public Calendar getAlteracao() {
		return alteracao;
	}

	public void setAlteracao(Calendar alteracao) {
		this.alteracao = alteracao;
	}
	
}
