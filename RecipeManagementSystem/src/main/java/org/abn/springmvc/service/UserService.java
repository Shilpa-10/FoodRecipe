package org.abn.springmvc.service;
import org.abn.springmvc.model.Login;
import org.abn.springmvc.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
