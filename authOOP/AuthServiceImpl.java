package authOOP;

import model.User;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, User> users;
    List<User> userList;

    private AuthServiceImpl(){
        this.users = new HashMap<>();
        this.userList = new ArrayList<>();
    }
    public static AuthService getInstance(){ return instance; }

    @Override
    public String join(User user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public String login(User user) {
        String msg = "";
        User userInMap = users.get(user.getUsername());
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
    public User findUserById(String username) {
        return users.get(username);
    }

    @Override
    public String updatePassword(User user) {
        users.get(user.getUsername()).setPassword(user.getPassword());
        return "비번 변경 성공";
    }

    @Override
    public String deleteUser(String username) {
        users.remove(username);
        return "회원삭제 완료";
    }

    @Override
    public List<User> getUserList() {
        return new ArrayList<>(users.values());
    }

    @Override
    public List<User> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<User> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return users.size()+"";
    }

    @Override
    public Map<String, User> getUserMap() {
        return users;
    }

    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username,
                    User.builder()
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
