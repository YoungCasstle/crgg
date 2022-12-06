package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    void deleteUserById(long id);

    User updateUser(User user);

    void addUser(User user);

    User getUserById(long id);
}
