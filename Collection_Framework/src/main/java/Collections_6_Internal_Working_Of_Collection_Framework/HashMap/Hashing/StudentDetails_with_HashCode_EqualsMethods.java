package Collections_6_Internal_Working_Of_Collection_Framework.HashMap.Hashing;

import java.util.Objects;

public class StudentDetails_with_HashCode_EqualsMethods {
    int rollNumber;
    String name;
    String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDetails_with_HashCode_EqualsMethods that)) return false;
        return rollNumber == that.rollNumber && name.equals(that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, address);
    }

    public StudentDetails_with_HashCode_EqualsMethods(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
