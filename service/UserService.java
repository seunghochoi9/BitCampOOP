package service;

import model.UserDto;
import serviceImpl.UserServiceImpl;

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

    String join(UserDto user);
    String login(UserDto user);
    UserDto findUserById();
    String updatePassword();
    String deleteUser();
    List<UserDto> getUserList();
    List<UserDto> findUsersByName();
    List<UserDto> findUsersByJob();

    String addUsers();
    String count();

    Map<String, UserDto> getUserMap();
}
