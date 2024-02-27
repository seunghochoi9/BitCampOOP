package service;

import model.UserDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login();
    String addUsers();
    UserDto findUser(String username);
    Map<String, UserDto> getUserMap();
    String count();
}
