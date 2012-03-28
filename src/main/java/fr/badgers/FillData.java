package fr.badgers;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.badgers.model.Proprietaire;

public class FillData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("GP");
				EntityManager em = emf.createEntityManager();
		
		/*em.getTransaction().begin();
		Proprietaire p = new Proprietaire();
		p.setAdresse("Volrundd");
		p.setNom("Draugr");
		p.setTelephone(null);
		em.persist(p);
		em.getTransaction().commit();*/
		
		String[] names1 = {"Jean", 	"Ben", 	"Mig", 	"Sal", 	"Ser", 	"Bim", 	"Xan", 
							"Tur", 	"Dem", 	"Cha", 	"Zab", 	"Hih"};
		String[] names2 = {"ien", 	"lio", 	"mon", 	"nub", 	"zar", 	"bou", 	"hol", 
							"sed", 	"lig", 	"", 	"by", 	"man"};
		int stringLength = names1.length;
		for (int i = 0; i<20; ++i)
		{
			em.getTransaction().begin();
			Proprietaire p = new Proprietaire();
			// We generate random numbers to fill the 
			p.setNom(names1[new Random().nextInt()%stringLength] + names2[new Random().nextInt()%stringLength]);
			p.setAdresse("Volrundd");
			p.setTelephone(null);
			em.persist(p);
			em.getTransaction().commit();
		}
	}
	
	

}