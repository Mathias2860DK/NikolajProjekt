package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dialog dialog = new English();



        Sprog sprog = new Sprog();

        while (!   getString(dialog.quit() ).equalsIgnoreCase("q") )  {


            if(getString("change language - press y for yess").equalsIgnoreCase("y")) {


                dialog = sprog.SkiftSprog(getString("da / eng / Fin / deu / french"));


            }
            System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage() + " ");
            Scanner scanner = new Scanner(System.in);
            System.out.println(dialog.whereDoYouLive());
            String whereDoYouLive = scanner.nextLine();
            System.out.println(whereDoYouLive);



        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");

        return scanner.nextLine();

    }
}
