package Bai4_2;

public class Person {
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho address
    public String getAddress() {
        return address;
    }

    // Setter cho address
    public void setAddress(String address) {
        this.address = address;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
