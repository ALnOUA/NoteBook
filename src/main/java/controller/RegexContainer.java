package controller;

public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_THIRD_NAME = "^[A-Z]+[a-z]{1,15}|[а-щА-ЩЬьЮюЯяЇїІіЄєҐґ]{1,15}";
    String REGEX_FULL_NAME = "^[A-Z]+[a-z]{1,15}|[а-щА-ЩЬьЮюЯяЇїІіЄєҐґ]{1,15}[ \\\\t\\\\v\\\\r\\\\n\\\\f]([A-Z]{1}|[А-ЩЮЯЇІЄҐ]{1})\\\\.";
    String REGEX_NICKNAME = "[\\w]{3,10}";
    String REGEX_COMMENT = "[\\w]{3,100}";
    String REGEX_GROUP = "[\\w]{3,10}";
    String REGEX_HOME__PHONE_NUMBER = "\\+?([0-9]{3})?([0-9]{2})?([0-9]{7})";
    String REGEX_PHONE_NUMBER = "\\+?([0-9]{2})?([0-9]{3})([0-9]{7})";
    String REGEX_SECOND_PHONE_NUMBER = "\\+?([0-9]{2})?([0-9]{3})([0-9]{7})";
    String REGEX_EMAIL = "^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$";
    String REGEX_SKYPE = "[a-zA-Z][a-zA-Z0-9\\.,\\-_]{5,20}";
    String REGEX_INDEX = "(\\d){6}";
    String REGEX_CITY_STREET = "[A-Z][A-Za-z- ]{1,30}|[А-ЩЬЮЯЇІЄҐ][ А-ЩЬЮЯЇІЄҐа-щьюяїієґ-]{1,16}\"";
    String REGEX_HOME_NUMBER = "(\\d){1,3}";
    String REGEX_FLAT_NUMBER = "(\\d){1,4}";
    String REGEX_DATA = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";

}

