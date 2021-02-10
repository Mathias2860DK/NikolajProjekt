package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dialog dialog = new English();



        Sprog sprog = new Sprog();

        while (!   getString(dialog.quit() ).equalsIgnoreCase("q") )  {


            if(getString("change language - press y for yess").equalsIgnoreCase("y")) {

<<<<<<< HEAD
                dialog = sprog.SkiftSprog(getString("da / eng / Fin"));

                dialog = sprog.SkiftSprog(getString("da / eng / french"));

                dialog = sprog.SkiftSprog(getString("da / eng / deu"));
=======
                dialog = sprog.SkiftSprog(getString("da / eng / Fin / french/ deu"));
>>>>>>> cf821985e0604c6c44dba69bd25afc1d0d3a2d05

            }
            System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());

        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");

        return scanner.nextLine();

    }
}
