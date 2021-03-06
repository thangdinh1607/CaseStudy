package Models;

public class Customer {
    private String name;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Object services;

    public Customer() {
    }

    public Customer(String name, String birthDay, String gender,
                    String idCard, String phoneNumber, String email,
                    String typeOfCustomer, String address, Object services) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public Customer(String name, String birthDay, String gender, String idCard, String phoneNumber, String email, String typeOfCustomer, String address) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getServices() {
        return services;
    }

    public void setServices(Object services) {
        this.services = services;
    }

    public String showInFor() {
        return
                name + ";"
                        + birthDay + ";"
                        + gender + ";"
                        + idCard + ";"
                        + phoneNumber + ";"
                        + email + ";"
                        + typeOfCustomer + ";"
                        + address + ";"
                        + services;
    }

    @Override
    public String toString() {
        return name + ","
                + birthDay + ","
                + gender + ","
                + idCard + ","
                + phoneNumber
                + email + ","
                + typeOfCustomer + ","
                + address + ","
                + services;
    }

}
