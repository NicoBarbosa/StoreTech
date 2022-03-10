package br.com.fiap.store.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_fm_cliente")
public class Cliente {
	
	@Id
    @SequenceGenerator(name="cliente",sequenceName="sq_fm_cliente",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cliente")
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "nm_cliente", length = 80, nullable = false)
	private String nomeCliente;
	
	@Column(name = "nr_cpf", length = 11, nullable = false)
	private String cpf;
	
	@Column(name = "nm_email", length = 40, nullable = false)
	private String email;
	
	@Column(name = "dt_nascimento", nullable = false)
	private Calendar dataNascimento;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cadastro", nullable = false)
    private Calendar dataCadastro;
	
	@UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_alteracao")
    private Calendar dataAlteracao;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedido;
	
	@OneToMany(mappedBy = "clienteTelefone")
	private List<Telefone> telefone;
	
	@OneToMany(mappedBy = "clienteEndereco")
	private List<Endereco> endereco;

	public Cliente() {
		super();
	}

	public Cliente(Integer idCliente, String nomeCliente, String cpf, String email, Calendar dataNascimento,
			Calendar dataCadastro, Calendar dataAlteracao, List<Pedido> pedido, List<Telefone> telefone,
			List<Endereco> endereco) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.dataAlteracao = dataAlteracao;
		this.pedido = pedido;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Calendar dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	public List<Pedido> getPedido() {
		return pedido;
	}
	
	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
}
