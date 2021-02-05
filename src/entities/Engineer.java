package entities;

public class Engineer extends Officer {
    private String major;

    public Engineer() {
        this.ratio = 1.5;
    }

    public Engineer(String name, String dateOfBirth, String gender, String address, String major, double hardSalary) {
        super(name, dateOfBirth, gender, address, hardSalary);
        this.major = major;
        this.ratio = 1.5;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", hardSalary=" + hardSalary +
                ", ratio=" + ratio +
                '}';
    }
}
