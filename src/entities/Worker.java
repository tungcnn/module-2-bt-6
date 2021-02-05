package entities;

public  class Worker extends Officer{
    private String level;

    public Worker() {
        this.ratio = 1.3;
    }

    public Worker(String name, String dateOfBirth, String gender, String address, String level, double hardSalary) {
        super(name, dateOfBirth, gender, address, hardSalary);
        this.level = level;
        this.ratio = 1.3;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", hardSalary=" + hardSalary +
                ", ratio=" + ratio +
                ", level='" + level + '\'' +
                '}';
    }
}
