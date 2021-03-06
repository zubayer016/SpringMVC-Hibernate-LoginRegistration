package com.bari.springmvc.dao;

import com.bari.springmvc.model.User;
import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public void updateUser(User user);

    public List<User> listUser();

    public User getUserById(Integer Id);

    public void removeUser(Integer Id);
    
    public User loginUser(String email, String pass);
}
