package co.grandcircus.CoffeeShopApp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShopApp.Item;
import co.grandcircus.CoffeeShopApp.User;


@Repository
@Transactional
public class ItemsDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Item> findAll() {
		return em.createQuery("FROM Item", Item.class).getResultList();
	}

	public void create(Item item) {
		  em.persist(item);
		
	}
	
	
	
	}


