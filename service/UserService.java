package service;

import model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
//    String addUsers();
//    String join(UserDto user);
//    String login(UserDto user);
//    UserDto findUserById(String username);
//    String updatePassword(UserDto user);
//    String deleteUser(String username);
//    List<UserDto> getUserList();
//    List<UserDto> findUsersByName(String name);
//    List<UserDto> findUsersByJob(String job);
//    String countUsers();

    String join(User user);
    String login(User user);
    User findUserById(String username);
    String updatePassword(User user);
    String deleteUser(String username);
    List<User> getUserList();
    List<User> findUsersByName(String name);
    List<User> findUsersByJob(String job);

    String addUsers();
    String count();

    Map<String, User> getUserMap();
}
