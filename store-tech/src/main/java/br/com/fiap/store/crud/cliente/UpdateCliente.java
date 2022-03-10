package br.com.fiap.store.crud.cliente;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.store.domain.Cliente;

public class UpdateCliente {
//UPDATE
	public static void main(String[] args) {
		EntityManager em = null;
		em = Persistence.createEntityManagerFactory("store-tech").createEntityManager();
		
		//Seleciona a linha de acordo com a PK
		Cliente update = em.find(Cliente.class, 2);
		
		try {
			update.setNomeCliente("Nicolas B. Penante");
			update.setCpf("00099922244");
			
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
