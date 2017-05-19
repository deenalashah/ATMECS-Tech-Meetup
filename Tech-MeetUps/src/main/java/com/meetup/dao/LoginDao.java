package com.meetup.dao;

import com.meetup.model.Login;
import com.meetup.model.Register;

public interface LoginDao {
public boolean validateLogin(String email,String password);

}
