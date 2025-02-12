public class Address {
    // attributes
    private String street;
    private String city;
    private String province;
    private String postal;

    // constructor
    public Address(String street, String city, String province, String postal) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.postal = postal;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + province + ", " + postal;
    }
}
