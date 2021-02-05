package view;

import entities.Officer;
import methods.OfficerFactory;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static Officer getOfficerInfo(String position) {
        Officer officer = OfficerFactory.getOfficer(position);
        System.out.println("Enter officer name: ");
        officer.setName(sc.nextLine());
        System.out.println("Enter officer gender: ");
        officer.setGender(sc.nextLine());
        System.out.println("Enter officer date of birth: ");
        officer.setDateOfBirth(sc.nextLine());
        System.out.println("Enter officer address: ");
        officer.setAddress(sc.nextLine());
        return officer;
    }
}
