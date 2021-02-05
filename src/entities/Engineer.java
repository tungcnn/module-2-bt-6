package entities;

public class Engineer extends Officer {
    private String major;

    public Engineer() {
    }

    public Engineer(String name, String dateOfBirth, String gender, String address, String major) {
        super(name, dateOfBirth, gender, address);
        this.major = major;
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
                '}';
    }
}
