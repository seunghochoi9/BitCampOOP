package serviceImpl;

import model.User;
import repository.UserRepository;
import service.UserService;
import service.UtilService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();

    public static UserService getInstance() {
        return instance;
    }

    UserRepository userRepository;
    Map<String, User> users;

    public UserServiceImpl() {
        userRepository = new UserRepository();
        users = new HashMap<>();
    }

    @Override
    public String join(User user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public String login(User user) {
        String msg = "";
        User userInMap = users.get(user.getUsername());
        if (userInMap == null) {
            msg = "ID 틀림";
        } else {
            if (userInMap.getPassword().equals(user.getPassword())) {
                msg = "로그인 성공";
            } else {
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
        return "비밀번호 수정완료";
    }

    @Override
    public String deleteUser(String username) {
        users.remove(username);
        return "계정삭제 완료";
    }

    @Override
    public List<User> getUserList() {
        return new ArrayList<>(users.values());
    }

    @Override
    public List<User> findUsersByName(String name) {
        return new ArrayList<>(users.values());
    }

    @Override
    public List<User> findUsersByJob(String job) {
        return new ArrayList<>(users.values());
    }

    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String usernameKey = util.createRandomUsername();
            map.put(usernameKey,
                    User.builder()
                            .username(usernameKey)
                            .password("1")
                            .verifyPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size() + "더미 값 추가";
    }

    @Override
    public String count() {
        return users.size() + "";
    }

    @Override
    public Map<String, User> getUserMap() {
        return users;
    }

}