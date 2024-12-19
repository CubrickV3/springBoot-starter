package ru.cibrick.springBoot_hibernate_mvc.dao;

import ru.cibrick.springBoot_hibernate_mvc.models.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(long id);
    void persist(User user);
    void update(long id, User user);
    void remove(Long id);
}
