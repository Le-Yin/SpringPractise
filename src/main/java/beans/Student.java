package beans;

import java.util.List;

/**
 * Created by chelseayin on 2017/7/5.
 */
public class Student {

    private String name;
    private Address address;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Address mainAddress) {
        this.name = name;
        this.address = mainAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Student Info: " + name + " | " + address);
    }

}
