package seunghoTest;

import builder.UserBuilder;
import model.UserDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImplTest implements UserServiceTest {
    private static UserServiceTest instance = new UserServiceImplTest();
    public static UserServiceTest getInstance() {
        return instance;
    }
    Map<String, UserDto> users;

    public UserServiceImplTest() {
        this.users = new HashMap<>();
    }

    @Override
    public String addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for(int i=0;i<5;i++) {
            String usernameKey = util.createRandomUsername();
            map.put(usernameKey, new UserBuilder()
                            .username(usernameKey)
                            .password("1")
                            .verifyPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size() + "명 (for문 5번)";
    }

    @Override
    public String userCount() {
        return users.size()+"명";
    }

    @Override
    public String join(UserDto user) {
        users.put(user.getUsername(), user);
        return  "회원가입 성공";
    }

    @Override
    public Map<String, UserDto> getUsersMap() {
        return users;
    }

    @Override
    public String login(UserDto user) {
        String msg = "";
        UserDto userInMap = users.get(user.getUsername());
        if(userInMap == null){
            msg = "아이디 틀림";
        } else {
            if(userInMap.getPassword().equals(user.getPassword())){
                msg = "로그인 성공";
            }else {
                msg = "비밀번호 틀림";
            }
        }
        return msg;
    }

}
