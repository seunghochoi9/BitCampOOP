package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UserDto {
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

}
