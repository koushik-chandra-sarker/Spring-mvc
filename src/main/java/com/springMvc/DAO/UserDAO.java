package com.springMvc.DAO;

import com.springMvc.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class UserDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int saveUser(User user){
        int id = (Integer)hibernateTemplate.save(user);
        return id;
    }
}
