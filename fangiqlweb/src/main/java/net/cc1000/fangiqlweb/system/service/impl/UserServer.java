package net.cc1000.fangiqlweb.system.service.impl;

import net.cc1000.fangiqlweb.system.domain.User;
import net.cc1000.fangiqlweb.system.domain.UserRepository;
import net.cc1000.fangiqlweb.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

//必须通过该注解告知spring.
@Service
public class UserServer implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityManager em;


    public User findByUsername(User user) {

//        User one = userRepository.getOne(user.getId());
        String username = user.getUsername();

        String sql = "select id,username,password from f_user1 where username=:username";
        Query query = em.createNativeQuery(sql, User.class);
        query.setParameter("username", username);
        List<User> list = query.getResultList();



        return list != null && list.size() > 0 ? list.get(0) : null;

    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
