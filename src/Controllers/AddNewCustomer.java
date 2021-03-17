package Controllers;

import Commons.exceptions.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddNewCustomer {
    private Pattern pattern;
    private Matcher matcher;
    public static final String REGEX_NAME_CUSTOMER = "^([A-Z]\\w+\\s[A-Z]\\w+)+$";
    public static final String REGEX_EMAIL_CUSTOMER = "^^\\w\\S+@(\\w+.){1,2}(com|com.vn)$";
    public static final String REGEX_GENDER_CUSTOMER = "^(male | female | unknow)$";
    public static final String REGEX_IDCARD_CUSTOMER = "^\\d{9}$";
    public static final String REGEX_BIRTHDAY_CUSTOMER = "^(0?[1-9]|(1|2)[\\d]|3(0|1))/(0?\\d|1[0-2])/(19|20)\\d{2}$";

    Scanner scanner = new Scanner(System.in);
    boolean check;

    String nameCustomerException() {
        String name;

        do {
            System.out.println("Enter name Customer :");
            name = scanner.nextLine();
            try {
                check = Pattern.compile(REGEX_NAME_CUSTOMER).matcher(name).matches();
                if (check == false) {
                    throw new InvalidNameException("Invalid name");
                }
            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return name;
    }
    String birthDayException(){
        String birthDay;
        do {
            System.out.println("Enter birth day :");
            birthDay = scanner.nextLine();
            try {
                check = Pattern.compile(REGEX_BIRTHDAY_CUSTOMER).matcher(birthDay).matches();
                if (check == false) {
                    throw new InvalidBirthdayException("Invalid birth day : dd//mm/yyyy");
                }
            } catch (InvalidBirthdayException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return birthDay;
    }

    String genderException() {
        String gender;
        do {
            System.out.println("Enter gender Customer :");
            gender = scanner.nextLine().toLowerCase();
            try {
                check = Pattern.compile(REGEX_GENDER_CUSTOMER).matcher(gender).matches();
                if (check == false) {
                    throw new InvalidGenderException("Invalid gender : male | female | unknow");
                }
            } catch (InvalidGenderException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return gender;
    }

    String idCardException() {
        String idCard;
        do {
            System.out.println("Enter IdCard Customer :");
            idCard = scanner.nextLine();
            try {
                check = Pattern.compile(REGEX_IDCARD_CUSTOMER).matcher(idCard).matches();
                if (check == false) {
                    throw new InvalidIDCard("Invalid idCard : XXX-XXX-XXX");
                }
            } catch (InvalidIDCard e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return idCard;
    }
    String phoneNumber(){
        String phoneNumber;
        do {
            System.out.println("Enter IdCard Customer :");
            phoneNumber = scanner.nextLine();
            try {
                check = Pattern.compile(REGEX_IDCARD_CUSTOMER).matcher(phoneNumber).matches();
                if (check == false) {
                    throw new InvalidIDCard("Invalid phone number : XXXX-XXX-XXX");
                }
            } catch (InvalidIDCard e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return phoneNumber;
    }

    String emailCustomerException() {
        String email;
        do {
            System.out.println("Enter email Customer :");
            email = scanner.nextLine();
            try {
                check = Pattern.compile(REGEX_EMAIL_CUSTOMER).matcher(email).matches();
                if (check == false) {
                    throw new InvalidEmailException("Invalid email");
                }
            } catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return email;
    }
    String typeOfCustomer(){
        String typeOfCustomer;
        do {
            System.out.println("Enter type of Customer :");
            typeOfCustomer = scanner.nextLine();
            try {
                check = Pattern.compile(REGEX_NAME_CUSTOMER).matcher(typeOfCustomer).matches();
                if (check == false) {
                    throw new InvalidNameException("Invalid type");
                }
            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return typeOfCustomer;
    }
    String address(){
        String address;
        System.out.println("Enter address customer:");
        address=scanner.nextLine();
        return address;
    }
}
