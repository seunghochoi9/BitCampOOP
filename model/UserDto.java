package model;

public class UserDto {
    private int id;
    private String username;
    private String password;
    private String verifyPassword;
    private String name;
    private String socialSecurityNumber;
    private String phoneNumber;
    private String address;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double weight;

    public UserDto(String username, String password, String verifyPassword, String name, String socialSecurityNumber,
                   String phoneNumber, String address, double height, double weight) {
        this.username = username;
        this.password = password;
        this.verifyPassword = verifyPassword;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", verifyPassword='" + verifyPassword + '\'' +
                ", name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
