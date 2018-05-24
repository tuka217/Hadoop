package anna.service;

import anna.model.Login;
import anna.model.User;

public interface UserService {

    User validateUser(Login login);
}
