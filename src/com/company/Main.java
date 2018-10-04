package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Defining name,breed,age
        String name;
        String breed;
        int age;
        // prompting the user to input
        Scanner keyboard= new Scanner(System.in);
        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.nextLine();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.nextLine();
        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();

        System.out.println( name + " is your " + breed + " and it is " + age );

    }
}
