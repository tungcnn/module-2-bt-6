package entities;

public class Employee extends Officer{
    private String task;

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String gender, String address, String task) {
        super(name, dateOfBirth, gender, address);
        this.task = task;
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
                '}';
    }
}
