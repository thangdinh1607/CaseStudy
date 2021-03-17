package Controllers;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ServicesManage {
    public static final String REGEX_ID = "^(SV)(VL|HO|RO)\\d{4}$";
    public static final String REGEX_NAME_SERVICE = "^[A-Z]\\w+$";
    public static final String REGEX_AREA_USED = "^[3-9]\\d.\\d+";
    public static final String REGEX_NUMBER_OF_PEOPLE = "^(1|2)[0-9]";
    public static final String REGEX_ACCOMPANIED_SERVICE = "^(massage |karaoke|food|car)";
    public static final String REGEX_NUMBER_FLOOR = "^[1-40]";
    public static final String REGEX_BIRTHDAY = "^((0)[1-9]|(1|2)[0-9]|(3)(0|1))(/|.)((0)[0-9]|(1)[0-2](/|.)((1)(9)[0-9][0-9]|(2)(0)[0][0-3])$";
    Scanner input = new Scanner(System.in);
    CheckRegex checkRegex = new CheckRegex();

    String id() {
        String id;
        boolean check;
        do {
            System.out.println("Enter id :");
            id = input.nextLine();
            if (checkRegex.checkId(id, REGEX_ID)) {
                check = false;
                System.out.println("Success id = : " + id);
            } else {
                check = true;
                System.out.println("false --- SVXX-YYYY");
            }
        } while (check);
        return id;
    }

    String nameServices() {
        String nameServices;
        boolean check;
        do {
            System.out.println("Enter name Services :");
            nameServices = input.nextLine();
            if (checkRegex.checkId(nameServices, REGEX_NAME_SERVICE)) {
                check = false;
                System.out.println("Success name services =" + nameServices);
            } else
                check = true;
            System.out.println("false --- Villa | House | Room ");
        } while (check);
        return nameServices;
    }

    double areaUsed() {
        String areaUsed;
        boolean check;
        do {
            System.out.println("Enter area used :");
            areaUsed = input.nextLine();
            if (checkRegex.checkId(areaUsed, REGEX_AREA_USED)) {
                check = false;
                System.out.println("Success area used = " + areaUsed);
            } else
                check = true;
            System.out.println("false area used > 30");
        } while (check);
        return Double.parseDouble(areaUsed);
    }

    double rentalCost() {
        double rentalCost;
        boolean check;
        do {
            System.out.println("Enter rental cost :");
            rentalCost = Double.parseDouble(input.nextLine());
            if (rentalCost > 0) {
                check = false;
                System.out.println("Success rental cost  =" + rentalCost);
            } else
                check = true;
            System.out.println("false ---rental cost > 0");
        } while (check);
        return rentalCost;
    }

    int numberOfPeople() {
        String numberOfPeople;
        boolean check;
        do {
            System.out.println("Enter number of people :");
            numberOfPeople = input.nextLine();
            if (checkRegex.checkId(numberOfPeople, REGEX_NUMBER_OF_PEOPLE)) {
                check = false;
                System.out.println("Success number of people = " + numberOfPeople);
            } else
                check = true;
            System.out.println("false ---0<number of people < 20");
        } while (check);
        return Integer.parseInt(numberOfPeople);
    }

    String typeOfRent() {
        String tyOfRent;
        boolean check;
        do {
            System.out.println("Enter type of rent :");
            tyOfRent = input.nextLine();
            if (checkRegex.checkId(tyOfRent, REGEX_NAME_SERVICE)) {
                check = false;
                System.out.println("Success type of rent = " + tyOfRent);
            } else
                check = true;
            System.out.println("false : -- Year | Month | Day | Hour");
        } while (check);
        return tyOfRent;
    }

    String standardRoom() {
        String standardRoom;
        boolean check;
        do {
            System.out.println("Enter standard room :");
            standardRoom = input.nextLine();
            if (checkRegex.checkId(standardRoom, REGEX_NAME_SERVICE)) {
                check = false;
                System.out.println("Success standard room = " + standardRoom);
            } else
                check = true;
            System.out.println("false -- Vip| Normal ");
        } while (check);
        return standardRoom;
    }

    String otherFacilities() {
        String otherFacilities;
        boolean check;
        do {
            System.out.println("Enter other facilities :");
            otherFacilities = input.nextLine();
            if (checkRegex.checkId(otherFacilities, REGEX_NAME_SERVICE)) {
                check = false;
                System.out.println("Succes other facilities = " + otherFacilities);
            } else
                check = true;
            System.out.println("false");
        } while (check);
        return otherFacilities;
    }

    double poolArea() {
        String poolArea;
        boolean check;
        do {
            System.out.println("Enter area used :");
            poolArea = input.nextLine();
            if (checkRegex.checkId(poolArea, REGEX_AREA_USED)) {
                check = false;
                System.out.println("Success area used = " + poolArea);
            } else
                check = true;
            System.out.println("false area used >30  ");
        } while (check);
        return Double.parseDouble(poolArea);
    }

    int numberFloor() {
        int numberFloor;
        boolean check;
        do {
            System.out.println("Enter number floor :");
            numberFloor = Integer.parseInt(input.nextLine());
            if (numberFloor > 0) {
                check = false;
                System.out.println("Success number floor =  " + numberFloor);
            } else
                check = true;
            System.out.println("false number floor > 0");
        } while (check);
        return numberFloor;
    }

    String freeServices() {
        String freeServices;
        boolean check;
        do {
            System.out.println("Enter freeServices :");
            freeServices = input.nextLine();
            if (checkRegex.checkId(freeServices, REGEX_NAME_SERVICE)) {
                check = false;
                System.out.println("Success freeServices = " + freeServices);
            } else
                check = true;
            System.out.println("false");
        } while (check);
        return freeServices;
    }
}