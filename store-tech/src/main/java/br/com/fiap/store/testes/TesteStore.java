package br.com.fiap.store.testes;

import javax.persistence.Persistence;

public class TesteStore {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("store-tech").createEntityManager();
	}
}
