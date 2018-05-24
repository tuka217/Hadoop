package anna.dao;


import anna.model.Login;
import anna.model.User;

public interface UserDao {
    User validateUser(Login login);
}
