package br.com.fiap.store.crud.produto;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.store.domain.Produto;

public class UpdateProduto {
//UPDATE
	public static void main(String[] args) {
		EntityManager em = null;
		em = Persistence.createEntityManagerFactory("store-tech").createEntityManager();
		
		Produto update = em.find(Produto.class, 1);
		
		try {
			
			update.setNome("Placa de video RTX2060");
			update.setPreco(2.510);
			
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
