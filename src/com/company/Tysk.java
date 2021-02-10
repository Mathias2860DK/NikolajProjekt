package com.company;

public class Tysk implements Dialog {

    private String s = "tysk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Drücken Sie q, um anzuhalten";
    }

    @Override
    public String selectedLanguage() {
        return "Die ausgewählte Sprache ist";
    }

    @Override
    public String whereDoYouLive() {
        return "Who whonst du?";
    }
}
