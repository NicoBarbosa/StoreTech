package br.com.fiap.store.crud.cliente;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.store.domain.Cliente;

public class CreateCliente {
//CREATE
	public static void main(String[] args) {
		EntityManager em = null;
		em = Persistence.createEntityManagerFactory("store-tech").createEntityManager();
		
		Cliente create = new Cliente();
		//Aqui é necessário colocar a data de nascimento
		//NOTA: No Banco de dados, o mês buga e em vez de janeiro (1),
		//vai para fevereiro (2) por exemplo.
		Calendar c = Calendar.getInstance();
		c.set(2002, 1, 8);
		
		create.setNomeCliente("Amanda Ramos");
		create.setCpf("11122233344");
		create.setEmail("amanda10@hotmail.com");
		create.setDataNascimento(c);
		
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
