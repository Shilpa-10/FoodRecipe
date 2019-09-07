package org.abn.springmvc.dao;

import org.abn.springmvc.model.Login;
import org.abn.springmvc.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}