package br.com.fiap.store.crud.produto;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.store.domain.Produto;

public class CreateProduto {
//CREATE
	public static void main(String[] args) {
		EntityManager em = null;
		em = Persistence.createEntityManagerFactory("store-tech").createEntityManager();
		
		Produto create = new Produto();
		
		create.setNome("Mouse HyperX");
		create.setPreco(455);
		create.setQuantidade(2);
		create.setCategoria("Periferico");
		
		try {
			em.persist(create);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			System.exit(0);
		}

	}
	
}
