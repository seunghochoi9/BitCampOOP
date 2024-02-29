package seunghoTest;

import model.UserDto;

import java.util.Map;

public interface TestUserService {
    String addUsers();

    String userCount();

    String join(UserDto user);

    Map<String, UserDto> getUsersMap();

    String login(UserDto user);

    UserDto findById(String username);

    String changePassword(String password);
}
