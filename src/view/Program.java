package view;

import entities.Officer;
import methods.OfficerManagement;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static OfficerManagement<Officer> om = new OfficerManagement<>();

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.print("""
                    ------------------
                    1 - Add new officer
                    2 - Change officer info
                    3 - Remove officer
                    4 - Display all officers info
                    5 - Quit
                    Enter your choice: 
                    """);
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addMenu();
                        break;
                    case 2:
                        System.out.println("Enter officer name for searching:");
                        Officer o = om.search(sc.nextLine());
                        if (o == null) {
                            System.out.println("No such officer");
                        } else {
                            String className = o.getClass().getSimpleName();
                            Officer newOfficer = Menu.getOfficerInfo(className);
                            om.update(newOfficer, o);
                        }
                        break;
                    case 3:
                        System.out.println("Enter officer name for searching:");
                        Officer o2 = om.search(sc.nextLine());
                        if (o2 == null) {
                            System.out.println("No such officer");
                        } else {
                            om.remove(o2);
                        }
                        break;
                    case 4:
                        om.show();
                        break;
                    case 5:
                        System.out.println("Bye bye");
                        break;
                    default:
                        System.out.println("Enter a number from 1 - 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while (choice != 5);
    }

    static void addMenu() {
        int choice;
        do {
            System.out.print("""
                    -------------------
                    1 - Add Worker
                    2 - Add Employee
                    3 - Add Engineer
                    4 - Back
                    Enter your choice: 
                    """);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Officer worker = Menu.getOfficerInfo("Worker");
                    om.add(worker);
                    break;
                case 2:
                    Officer employee = Menu.getOfficerInfo("Employee");
                    om.add(employee);
                    break;
                case 3:
                    Officer engineer = Menu.getOfficerInfo("Engineer");
                    om.add(engineer);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter a number from 1 - 4");
            }
        } while (choice != 4);
    }
}
