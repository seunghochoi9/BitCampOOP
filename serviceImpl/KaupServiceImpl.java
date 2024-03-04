package serviceImpl;

import model.User;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();

    Map<String, User> users;
    List<?> userList;

    public KaupServiceImpl() {
        this.users = new HashMap<>();
        this.userList = new ArrayList<>();
    }

    public static KaupService getInstance(){
        return instance;
    }
    @Override
    public String createBMI(User user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = weight / ((height/100)*(height/100));
        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double num = Double.parseDouble(bmi);
        String bodyMass = "";
        if(num < 18.5){
            bodyMass = "저체중";
        } else if (num < 23) {
            bodyMass = "정상";
        }else if (num < 25) {
            bodyMass = "과체중";
        }else{
            bodyMass = "비만";
        }
        return bodyMass;
    }
}
