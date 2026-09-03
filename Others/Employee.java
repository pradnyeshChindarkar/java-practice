package Others;
public class Employee {
    private int id;
    private Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setId(int... id) {
        this.id = id;
    }
}