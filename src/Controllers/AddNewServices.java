package Controllers;

import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.Scanner;

public class AddNewServices {
    public static final String LINK_VILLA = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\Villa.csv";
    public static final String LINK_HOUSE = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\House.csv";
    public static final String LINK_ROOM = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\Room.csv";

    ServicesManage svm = new ServicesManage();

    void addNewVilla() {
        String id = svm.id();
        String nameServices = svm.nameServices();
        double areaUsed = svm.areaUsed();
        double rentalCost = svm.rentalCost();
        int numberOfPeople = svm.numberOfPeople();
        String typeOfRents = svm.typeOfRent();
        String standardRoom = svm.standardRoom();
        String otherFacilities = svm.otherFacilities();
        double poolArea = svm.poolArea();
        int numberOfFloors = svm.numberFloor();

        Services villa = new Villa(id, nameServices, areaUsed, rentalCost, numberOfPeople,
                typeOfRents, standardRoom, otherFacilities, poolArea, numberOfFloors);

        WriterFile wf = new WriterFile();
        wf.writerFile(LINK_VILLA, villa);
    }

    void addNewHouse() {
        String id = svm.id();
        String nameServices = svm.nameServices();
        double areaUsed = svm.areaUsed();
        double rentalCost = svm.rentalCost();
        int numberOfPeople = svm.numberOfPeople();
        String typeOfRents = svm.typeOfRent();
        String standardRoom = svm.standardRoom();
        String otherFacilities = svm.otherFacilities();
        int numberOfFloors = svm.numberFloor();

        Services house = new House(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRents,
                standardRoom, otherFacilities, numberOfFloors);
        WriterFile wf = new WriterFile();
        wf.writerFile(LINK_HOUSE, house);
    }

    void addNewRoom() {
        String id = svm.id();
        String nameServices = svm.nameServices();
        double areaUsed = svm.areaUsed();
        double rentalCost = svm.rentalCost();
        int numberOfPeople = svm.numberOfPeople();
        String typeOfRents = svm.typeOfRent();
        String freeServices =svm.freeServices();

        Services room = new Room(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRents, freeServices);
        WriterFile wf = new WriterFile();
        wf.writerFile(LINK_ROOM, room);
    }

    void addNewServicesMenu() {
        MainController mainMenu = new MainController();
        Scanner input = new Scanner(System.in);
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        int menu = Integer.parseInt(input.nextLine());
        switch (menu) {
            case 1:
                addNewVilla();
                mainMenu.displayMainMenu();
                break;
            case 2:
                addNewHouse();
                mainMenu.displayMainMenu();
                break;
            case 3:
                addNewRoom();
                mainMenu.displayMainMenu();
                break;
            case 4:
                mainMenu.displayMainMenu();
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Input false ");
        }
    }
}
