package seunghoTest;

import model.UserDto;

import java.util.Map;

public interface UserServiceTest {



    String addUsers();


    String userCount();

    String join(UserDto user);

    Map<String, UserDto> getUsersMap();

    String login(UserDto user);
}
