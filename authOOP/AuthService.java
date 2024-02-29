package authOOP;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String addUsers();
    String join(UserDto user);
    String login(UserDto user);
    UserDto findUserById(String username);
    String updatePassword(UserDto user);
    String deleteUser(String username);
    List<UserDto> getUserList();
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob(String job);
    String countUsers();
    Map<String, UserDto> getUserMap();


}
