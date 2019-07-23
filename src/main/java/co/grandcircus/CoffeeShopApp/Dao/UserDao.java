package co.grandcircus.CoffeeShopApp.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShopApp.User;

@Transactional
@Repository 

public class UserDao {
	
	@PersistenceContext
    private EntityManager em;

    
    public void create(User user) {
        em.persist(user);
    }
    
    public void update(User user) {
        em.merge(user);
    }
}
