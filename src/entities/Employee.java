package entities;

public class Employee extends Officer{
    private String task;

    public Employee() {
        this.ratio = 1;
    }

    public Employee(String name, String dateOfBirth, String gender, String address, String task, double hardSalary) {
        super(name, dateOfBirth, gender, address, hardSalary);
        this.task = task;
        this.ratio = 1;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", hardSalary=" + hardSalary +
                ", ratio=" + ratio +
                '}';
    }
}
