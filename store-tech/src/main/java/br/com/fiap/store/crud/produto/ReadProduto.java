package br.com.fiap.store.crud.produto;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.store.domain.Produto;

public class ReadProduto {
//READ
	public static void main(String[] args) {
		EntityManager em = null;
		em = Persistence.createEntityManagerFactory("store-tech").createEntityManager();
		
		//Lista apenas uma linha de acordo com a PK
		Produto read = em.find(Produto.class, 1);
		
		System.out.println(read.getIdProduto() + " " + read.getNome() + " " + read.getPreco()
		+ " " + read.getQuantidade() + " " + read.getCategoria() + " " + read.getCadastro().getTime() 
		+ " | " + read.getAlteracao().getTime());
		
		em.close();
	
	}

}
