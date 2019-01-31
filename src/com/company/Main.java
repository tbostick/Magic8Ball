package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main

{

    public static void main(String[] args)

    {
        System.out.println("Do you have a question for the Magic 8-Ball? (y/n)");
        Scanner sc = new Scanner(System.in);
        String Answer = sc.next();

        Random r = new Random();

//        for (int i = 0; i < 20; i++) {
//            int answer = r.nextInt(20);
//            switch (answer) {
//                case 0:
//                    System.out.println();
//                    break;
//                case 1:
//                    System.out.println("It is decidedly so");
//                    break;
//                case 2:
//                    System.out.println("Without a doubt");
//                    break;
//                case 3:
//                    System.out.println("Yes definitely");
//                    break;
//                case 4:
//                    System.out.println("You may rely on it");
//                    break;
//                case 5:
//                    System.out.println("As I see it, yes");
//                    break;
//                case 6:
//                    System.out.println("Most likely");
//                    break;
//                case 7:
//                    System.out.println("Outlook good");
//                    break;
//                case 8:
//                    System.out.println("Yes");
//                    break;
//                case 9:
//                    System.out.println("Signs point to yes");
//                    break;
//                case 10:
//                    System.out.println("Reply hazy try again");
//                    break;
//                case 11:
//                    System.out.println("Ask again later");
//                    break;
//                case 12:
//                    System.out.println("Better not tell you now");
//                    break;
//
//
//            }

            // ArrayList of strings
        ArrayList<String> response = new ArrayList<>();
            // Adding items to an arraylist
            response.add("It is certain");
            response.add("I don't know what you're talking about");
            response.add("Very doubtful");
            response.add("Outlook not so good");
            response.add("Don't count on it");
            response.add("My sources say no");
            response.add("Concentrate and ask again");
            response.add("Cannot predict now");


        while (Answer.equalsIgnoreCase("y")) {
            // Getting the random index from the arraylist
            int randomIndex = r.nextInt(response.size());
            // Getting the item at the randomIndex
            String item = response.get(randomIndex);
            System.out.println("Enter a question: ");
            String userInput = sc.nextLine();
            sc.nextLine();
            System.out.println("Response = " + item);
            System.out.println("You want to play again: ");
            Answer = sc.next();
        }
                System.out.println("Thank you for playing");



        }
}