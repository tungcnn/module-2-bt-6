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
                    5 - Calculate salary
                    6 - Quit
                    Enter your choice: 
                    """);
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addMenu();
                        break;
                    case 2:
                        Officer o = Menu.searchOfficer(om);
                        if (o != null) {
                            String className = o.getClass().getSimpleName();
                            Officer newOfficer = Menu.getOfficerInfo(className);
                            om.update(newOfficer, o);
                        }
                        break;
                    case 3:
                        Officer o2 = Menu.searchOfficer(om);
                        if (o2 != null) {
                            om.remove(o2);
                        }
                        break;
                    case 4:
                        om.show();
                        break;
                    case 5:
                        Officer o3 = Menu.searchOfficer(om);
                        if (o3 != null) {
                            System.out.println("Enter the total number of working days for this officer:");
                            o3.setWorkingDays(Integer.parseInt(sc.nextLine()));
                            System.out.println(o3.getClass().getSimpleName() + " " + o3.getName() + "'s salary for this month is " + o3.getSalary());
                        }
                        break;
                    case 6:
                        System.out.println("Bye bye");
                        break;
                    default:
                        System.out.println("Enter a number from 1 - 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while (choice != 6);
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
