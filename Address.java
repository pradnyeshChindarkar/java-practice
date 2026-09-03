public class Address {
    private int code;
    private String city;

    Address(String city, int id) {
        this.code = id;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
