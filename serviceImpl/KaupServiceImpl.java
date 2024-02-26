package serviceImpl;

import model.UserDto;
import service.KaupService;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){}
    public static KaupService getInstance(){
        return instance;
    }
    @Override
    public String createBMI(UserDto user) {
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
