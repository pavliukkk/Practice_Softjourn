package com.Practice.Practice.Service;

public interface SecurityService {

    String findLoggedInEmail();

    void autoLogin(String email, String password);
}
