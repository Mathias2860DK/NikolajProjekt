package com.company;

public class Dansk implements Dialog {

    private String s = "Dansk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryk q for at stoppe ";
    }

    @Override
    public String selectedLanguage() {
        return "det valgte sprog er ";
    }
}
