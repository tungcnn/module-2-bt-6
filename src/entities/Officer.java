package entities;

public abstract class Officer {
    protected String name;
    protected String dateOfBirth;
    protected String gender;
    protected String address;

    public Officer() {
    }

    public Officer(String name, String dateOfBirth, String gender, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
