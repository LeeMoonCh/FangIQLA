package net.cc1000.fangiqlweb.system.service;

import net.cc1000.fangiqlweb.system.domain.User;

import java.util.List;

public interface UserService {


    User findByUsername(User user);

    List<User> findAll();



}
