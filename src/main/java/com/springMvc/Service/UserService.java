package com.springMvc.Service;

import com.springMvc.DAO.UserDAO;
import com.springMvc.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public int CreateUser(User user){
       return userDAO.saveUser(user);
    }
}
