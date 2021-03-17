package Controllers;

import Commons.exceptions.NameComparator;
import Models.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerManage {
    public static final String LINK_CUSTOMER = "F:\\CaseStudy\\src\\Data\\Customer.csv";
    AddNewCustomer addNewCustomer = new AddNewCustomer();

    void addNewCustomer() {
        String name = addNewCustomer.nameCustomerException();
        String birthDay = addNewCustomer.birthDayException();
        String gender = addNewCustomer.genderException();
        String idCard = addNewCustomer.idCardException();
        String phoneNumber = addNewCustomer.phoneNumber();
        String email = addNewCustomer.emailCustomerException();
        String typeOfCustomer = addNewCustomer.typeOfCustomer();
        String address = addNewCustomer.address();

        Customer customer = new Customer(name, birthDay, gender, idCard, phoneNumber, email, typeOfCustomer, address);
        WriterFile wf = new WriterFile();
        wf.writerFile(LINK_CUSTOMER, customer);
    }

    void showInformationCustomer() {
        ReaderFile rf = new ReaderFile();
        List<String> arrayList = new ArrayList<>(rf.readerFile(LINK_CUSTOMER));
        List<Customer> arrCustomer = new ArrayList<>();
        for (String arr : arrayList) {
            String[] information = arr.split(",");
            Customer customer = new Customer(information[0], information[1], information[2], information[3], information[4], information[5], information[6], information[7], information[8]);
            arrCustomer.add(customer);
        }
        Collections.sort(arrCustomer, new NameComparator());

        for (Customer customer : arrCustomer) {
            System.out.println(customer);
        }
    }
}


