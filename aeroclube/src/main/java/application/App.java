package application;


import javax.persistence.*;

import Domain.Piloto;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aeroclube");
		EntityManager em = emf.createEntityManager();
		
		Piloto p1 = new Piloto();
		p1.setNome("Emily Guidi");
		p1.setAviao_preferido("Airbus 320");
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		
		System.out.println("Prontinho!");
		em.close();
		emf.close();
		
		
	}

}
