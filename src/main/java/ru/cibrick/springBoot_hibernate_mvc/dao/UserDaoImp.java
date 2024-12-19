package ru.cibrick.springBoot_hibernate_mvc.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.cibrick.springBoot_hibernate_mvc.models.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User findById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void persist(User user) {
        em.persist(user);
    }

    @Override
    public void update(long id, User user) {
        User u = em.find(User.class, id);
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        em.merge(u);
    }

    @Override
    public void remove(Long id) {
        em.remove(em.find(User.class, id));
    }
}
