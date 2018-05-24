package anna.service;

import org.springframework.beans.factory.annotation.Autowired;

import anna.dao.UserDao;
import anna.model.Login;
import anna.model.User;

public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }

}
