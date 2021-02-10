package com.company;

public class Finsk implements Dialog {

    private String s = "Suomalainen";
    @Override
    public String getLanguage()  {
        return s;
    }


    @Override
    public String quit() { return " lopeta painamalla q";}

    @Override
    public String selectedLanguage() { return " Valittu kieli on";}

    @Override
    public String whereDoYouLive() {
        return "Missä sinä asut";
    }
}
