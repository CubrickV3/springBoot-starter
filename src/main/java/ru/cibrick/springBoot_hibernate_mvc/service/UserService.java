package ru.cibrick.springBoot_hibernate_mvc.service;

import ru.cibrick.springBoot_hibernate_mvc.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(long id);

    void persist(User user);

    void update(long id, User user);

    void remove(Long id);
}
