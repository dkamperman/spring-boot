package de.karrieretutor.springboot.enums;

public enum Unterkategorie {
    SUBKAT1("enum.subcategory.1"),
    SUBKAT2("enum.subcategory.2"),
    SUBKAT3("enum.subcategory.3"),
    SUBKAT4("enum.subcategory.4"),
    SUBKAT5("enum.subcategory.5"),
    SUBKAT6("enum.subcategory.6"),
    SUBKAT7("enum.subcategory.7"),
    SUBKAT8("enum.subcategory.8"),
    SUBKAT9("enum.subcategory.9"),
    SUBKAT10("enum.subcategory.10"),
    KEINE_AHNUNG("enum.subcategory.unknown");

    private final String messageKey;

    Unterkategorie(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public String getMessage() {
        return "";
    }
}
