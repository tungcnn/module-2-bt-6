package entities;

public  class Worker extends Officer{
    private String level;

    public Worker() {
    }

    public Worker(String name, String dateOfBirth, String gender, String address, String level) {
        super(name, dateOfBirth, gender, address);
        this.level = level;
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
                ", level='" + level + '\'' +
                '}';
    }
}
