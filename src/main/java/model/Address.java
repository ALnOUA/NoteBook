package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}