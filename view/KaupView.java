package view;

import builder.UserBuilder;
import model.UserDto;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        UserDto person = new UserBuilder()
                .height(util.createRandomDouble(150, 50))
                .weight(util.createRandomDouble(30, 70))
                .build();
        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi = kaup.createBMI(person);
        String bodyMass = kaup.createBodyMass(bmi);


        System.out.printf("===============BMI 계산기==============\n" +
                        "BMI: %s\n" +
                        "체질량: %s\n" +
                        "===============BMI 계산기==============", bmi, bodyMass);

    }
}

