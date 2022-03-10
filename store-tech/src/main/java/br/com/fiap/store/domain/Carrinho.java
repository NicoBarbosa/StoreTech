package br.com.fiap.store.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//Amanda
@Entity
@Table(name = "tb_fm_carrinho")
public class Carrinho {

	@Id
	@SequenceGenerator(name="carrinho",sequenceName="sq_fm_carrinho",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="carrinho")
	@Column(name = "id_carrinho")
	private Integer idCarrinho;
	
	@OneToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	
	@OneToOne(mappedBy = "carrinho")
	private Pedido pedido;
	
	public Carrinho() {
		super();
	}

	public Carrinho(Integer idCarrinho, Produto produto, Pedido pedido) {
		super();
		this.idCarrinho = idCarrinho;
		this.produto = produto;
		this.pedido = pedido;
	}

	public Integer getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(Integer idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
