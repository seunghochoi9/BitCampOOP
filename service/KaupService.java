package service;

import model.UserDto;

public interface KaupService {
    String createBMI(UserDto user);
    String createBodyMass(String bmi);
}
