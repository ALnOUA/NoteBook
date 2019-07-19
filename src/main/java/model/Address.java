package model;

public class Address {
    private long index;
    private String city;
    private String street;
    private int houseNumber;
    private int appartmentNumber;

    public Address(long index, String city, String street, int houseNumber, int appartmentNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.appartmentNumber = appartmentNumber;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getAppartmentNumber() {
        return appartmentNumber;
    }

    public void setAppartmentNumber(int appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }
}
