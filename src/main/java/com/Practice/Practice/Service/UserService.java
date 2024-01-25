package com.Practice.Practice.Service;

import com.Practice.Practice.Entities.User;

public interface UserService {

    void save(User user);

    User findByEmailOrPhone(String email, String phone);

}
