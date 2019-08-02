package model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Note {
    private String firstName;
    private String secondName;
    private String patronymic;
    private String nickName;
    private String comment;
    private String group;
    private String homePhoneNumber;
    private String phoneNumber;
    private String email;
    private String skype;
    private Address address;
    private String fullAddress;
    private LocalDateTime lastRecordTime;
    private LocalDateTime lastChangesTime;
    private String loginData;

    private String secondPhoneNumber;
    private NoteBook noteBook;


    public Note(String firstName, String secondName, String patronymic, String nickName, String comment, String group,
                String homePhoneNumber, String phoneNumber, String email, String skype, Address address,
                String fullAddress, LocalDateTime lastRecordTime, LocalDateTime lastChangesTime, String loginData) {
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
        this.loginData = loginData;
    }

    public String getSecondName(String inputStringValueWithScanner) {
        return secondName;
    }
// TODO: 02.08.2019  
    /*public boolean loginIsUnique(String login) {

        Optional<Note> uniquable = Optional.of(noteBook.getNoteBook().stream()                        // Convert to steam
                .filter(x -> login.equals(x.getLoginData()))        // we want "jack" only
                .findAny().orElse(new Note()));
        if(uniquable.equals(login)){
            System.out.println("ERROR");
        }
        return true;

    }*/


}

