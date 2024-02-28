package authOOP;

import builder.UserBuilder;
import model.UserDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDto> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }
    public static AuthService getInstance(){return instance;}
    @Override
    public String join(UserDto user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public String login(UserDto user) {
        String msg = "";
        UserDto userInMap = users.get(user.getUsername());
        if(userInMap == null){
            msg = "아이디 틀림";
        }else{
            if(userInMap.getPassword().equals(user.getPassword())){
                msg = "로그인 성공";
            }else{
                msg = "비밀번호 틀림";
            }
        }
        return msg;
    }

    @Override
    public UserDto findUserById(String username) {
        return null;
    }

    @Override
    public String updatePassword(UserDto user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<UserDto> getUserList() {
        return null;
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDto> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return users.size()+"";
    }

    @Override
    public Map<String, UserDto> getUserMap() {
        return users;
    }

    @Override
    public String addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .verifyPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size()+"개 더미값 추가";

    }
}
