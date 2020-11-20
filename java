package com.company;
import java.util.Scanner;
import java.util.Random;

public class guess_the_number {
    static void first(){
        Scanner sc  = new Scanner(System.in);
                System.out.println("Playing Guess The Number...");
                System.out.println("Press 1 To Play Guess The Number\nPress 2 For Exit\nSo What's Your Choice!");
        int y = sc.nextInt();
        switch (y) {
            case 1:
                logic();
            case 2:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                error();
        }
    }
    static void logic() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int no_of_chance = 10;
        int pcinput = rand.nextInt(100);

        System.out.println("Playing Guess The Number...");
        System.out.println("Press 111 For Exiting The Game AnyTime");
        System.out.println("Press 01 For Hint\n");

        while (no_of_chance != 0) {
            System.out.println("You have only " + no_of_chance + " Chances Left!");
            System.out.println("Enter Number");
            int x = sc.nextInt();

            if (x == pcinput) {
                System.out.println("You Won!");
                break;
            }
            else if (x==111){
                 System.out.println("You Pressed 111(Which Means Exit)\nExiting...");
                System.exit(0);
            }
            else if(x > 100){
                System.out.println("Please Note: Number Should Not Exceeds More Than 100\n");
                logic();
            }
            else if(x==01){
                System.out.println("Hint: Number Is Between 0 and 100\n");
                logic();
            }
            if (no_of_chance!=1) {
                if (x < pcinput) {
                    System.out.println("Number Is Small!\n");
                }
                else if (x > pcinput) {
                    System.out.println("Number Is Big!\n");
                }
            }
            no_of_chance--;
        }
        if (no_of_chance==0){
            System.out.println("You Lose!");
        }
        System.out.println("Pc Input Was " + pcinput);
        System.out.println("Chances Took Was " + (10-no_of_chance));
        play_again();
    }

    static void error(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Wrong number\nPlease Type 1 To Play The Game or 2 For Exit!");
        int y = sc.nextInt();
        switch (y) {
            case 1:
                logic();
            case 2:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                error();
        }
    }

    static void play_again(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Press 1 To Play Again The Gaae Press 2 To Exit The Game");
        int y = sc.nextInt();
        switch (y) {
            case 1:
                logic();
            case 2:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                error();
        }
    }

    public static void main(String[] args) {
        first();

    }
}
