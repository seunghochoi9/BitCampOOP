package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class User {
    private String username;
    private String password;
    private String verifyPassword;
    private String name;
    private String socialSecurityNumber;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

    @Builder(builderMethodName = "builder")
    public User(String username, String password, String verifyPassword, String name, String socialSecurityNumber,
                String phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.verifyPassword = verifyPassword;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
