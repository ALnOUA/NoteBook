package model;

import java.util.Date;

public class Note {
    private String firstName;
    private String secondName;
    private String patronymic;
    private String nickName;
    private String comment;
    private Enum group;
    private String homePhoneNumber;
    private String phoneNumber;
    private String email;
    private String skype;
    private Address address;
    private String fullAddress;
    private Date lastRecordTime;
    private Date lastChangesTime;

    private String secondPhoneNumber;

    public Note(String firstName, String secondName, String patronymic, String nickName, String comment, Enum group, String homePhoneNumber, String phoneNumber, String email, String skype, Address address, String fullAddress, Date lastRecordTime, Date lastChangesTime, String secondPhoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.homePhoneNumber = homePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.fullAddress = fullAddress;
        this.lastRecordTime = lastRecordTime;
        this.lastChangesTime = lastChangesTime;
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public Note(String firstName, String secondName, String patronymic, String nickName, String comment, Enum group, String homePhoneNumber, String phoneNumber, String email, String skype, Address address, String fullAddress, Date lastRecordTime, Date lastChangesTime) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.homePhoneNumber = homePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.fullAddress = fullAddress;
        this.lastRecordTime = lastRecordTime;
        this.lastChangesTime = lastChangesTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Enum getGroup() {
        return group;
    }

    public void setGroup(Enum group) {
        this.group = group;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Date getLastRecordTime() {
        return lastRecordTime;
    }

    public void setLastRecordTime(Date lastRecordTime) {
        this.lastRecordTime = lastRecordTime;
    }

    public Date getLastChangesTime() {
        return lastChangesTime;
    }

    public void setLastChangesTime(Date lastChangesTime) {
        this.lastChangesTime = lastChangesTime;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }
}
