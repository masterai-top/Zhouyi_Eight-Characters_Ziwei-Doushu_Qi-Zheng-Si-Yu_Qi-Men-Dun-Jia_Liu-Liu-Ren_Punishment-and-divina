package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.User;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserService {

    public int userRegister(User user);

    public String userLogin(User user);

    public List<User> getUserList(User user);

    public Boolean checkAccountUnique(User user);

    public int userResetPassword(User user);

    public User selectById(Integer id);

    public User getUserInfo(Integer id);

    public int updateUserMapCoordinate(User user);
}
