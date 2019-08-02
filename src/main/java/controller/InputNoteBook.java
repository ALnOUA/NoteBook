package controller;

import model.Address;
import model.Note;
import view.View;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.Constants.*;

public class InputNoteBook {

    private View view;
    private Scanner sc;
    private String loginData;

    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDateTime lastChangesTime;
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

    public InputNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;

    }

    public Note inputNote(List<Note> noteList) {
        UtilityController utilityController = new UtilityController(sc, view);
        InputNoteBook noteBook;
        Note note = new Note(firstName, secondName, patronymic, nickName, comment, group, homePhoneNumber, phoneNumber,
                email, skype, address, fullAddress, lastRecordTime, lastChangesTime, loginData);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        String login = utilityController.inputStringValueWithScanner(LOGIN, REGEX_LOGIN);
        if (note.loginIsUnique(login) == true) {
            note.setLoginData(login);
        }


        note.setFirstName(utilityController.inputStringValueWithScanner(FIRST_NAME, str));
        note.getSecondName(utilityController.inputStringValueWithScanner(SECOND_NAME, str));
        note.setPatronymic(utilityController.inputStringValueWithScanner(PATRONYMIC, str));
        String nick = utilityController.inputStringValueWithScanner(NICKNAME, REGEX_NICKNAME);
        note.setNickName(nick);
        note.setComment(utilityController.inputStringValueWithScanner(COMMENT, REGEX_COMMENT));
        note.setGroup(utilityController.inputStringValueWithScanner(GROUP, REGEX_GROUP));
        note.setHomePhoneNumber(utilityController.inputStringValueWithScanner(HOME_PHONE_NUMBER, REGEX_HOME__PHONE_NUMBER));
        note.setPhoneNumber(utilityController.inputStringValueWithScanner(PHONE_NUMBER, REGEX_PHONE_NUMBER));
        note.setEmail(utilityController.inputStringValueWithScanner(EMAIL, REGEX_EMAIL));
        note.setSkype(utilityController.inputStringValueWithScanner(SKYPE, REGEX_SKYPE));
        note.setLastRecordTime(LocalDateTime.now());
        note.setLastChangesTime(LocalDateTime.now());

        return note;

    }
}