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
<<<<<<< HEAD
                dialog = sprog.SkiftSprog(getString("da / eng / Fin"));
=======
                dialog = sprog.SkiftSprog(getString("da / eng / french"));
>>>>>>> 9545a14ade3b02a26aaa17ff5ea8ab55d23015d5
=======
                dialog = sprog.SkiftSprog(getString("da / eng / deu"));
>>>>>>> 92a5a62c63d3b35f9112d2e83b24fb5a3c7180a0

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
