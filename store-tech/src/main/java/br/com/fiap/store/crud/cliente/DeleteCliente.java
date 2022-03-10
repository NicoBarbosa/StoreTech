package br.com.fiap.store.crud.cliente;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.store.domain.Cliente;

public class DeleteCliente {
//DELETE
	public static void main(String[] args) {
		EntityManager em = null;
		em = Persistence.createEntityManagerFactory("store-tech").createEntityManager();
		
		try {
			Cliente delete = em.find(Cliente.class, 3);
			
			em.remove(delete);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

}
