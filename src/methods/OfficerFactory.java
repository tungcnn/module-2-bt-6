package methods;

import entities.Employee;
import entities.Engineer;
import entities.Officer;
import entities.Worker;

import java.util.Scanner;

public class OfficerFactory {
    public static Officer getOfficer(String position) {
        Scanner sc = new Scanner(System.in);
        switch (position) {
            case "Employee":
                Employee employee = new Employee();
                System.out.println("Enter employee's task");
                employee.setTask(sc.nextLine());
                System.out.println("Enter employee's salary per day");
                employee.setHardSalary(Double.parseDouble(sc.nextLine()));
                return employee;
            case "Worker":
                Worker worker = new Worker();
                System.out.println("Enter worker's level (3/7, 7/7, etc)");
                worker.setLevel(sc.nextLine());
                System.out.println("Enter worker's salary per day");
                worker.setHardSalary(Double.parseDouble(sc.nextLine()));
                return worker;
            case "Engineer":
                Engineer engineer = new Engineer();
                System.out.println("Enter engineer's major:");
                engineer.setMajor(sc.nextLine());
                System.out.println("Enter engineer's salary per day");
                engineer.setHardSalary(Double.parseDouble(sc.nextLine()));
                return engineer;
            default:
                return null;
        }
    }
}
