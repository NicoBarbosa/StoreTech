package br.com.fiap.store.crud.cliente;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.store.domain.Cliente;

public class ReadCliente {
//READ
	public static void main(String[] args) {
		EntityManager em = null;
		em = Persistence.createEntityManagerFactory("store-tech").createEntityManager();
		
		//Lista apenas uma linha de acordo com a PK
		Cliente read = em.find(Cliente.class, 2);
		
		System.out.println(read.getIdCliente() + " " + read.getNomeCliente() + " " + read.getCpf()
		+ " " + read.getEmail() + " " + read.getDataNascimento().getTime() + " | " + read.getDataCadastro().getTime() 
		+ " | " + read.getDataAlteracao().getTime());
		
		em.close();
	}
	
}
