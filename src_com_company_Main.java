package com.company;

import java.security.SecureRandom;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //part_1();
        //part_2();
        //part_3();
        //part_4();
        part_5();
    }

    public static void part_1(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int x, y;
        int answer = 0;

        x = rand.nextInt(10);
        y = rand.nextInt(10);

        System.out.println("How much is " + x + " times " + y + "?");

        while (answer != (x * y))
        {
            answer = scnr.nextInt();
            if (answer != (x * y))
            {
                System.out.println("No. Please Try again.>again.");
            }
            else
            {
                System.out.println("Very good!");
                break;
            }
        }
    }

    public static void part_2(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int x, y;
        int answer = 0;
        int comment, badComment;

        x = rand.nextInt(10);
        y = rand.nextInt(10);

        System.out.println("How much is " + x + " times " + y + "?");

        while (answer != (x * y)) {
            answer = scnr.nextInt();
            if (answer != (x * y)) {
                badComment = rand.nextInt(5);
                switch (badComment) {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
            }

            else {
                badComment = rand.nextInt(5);
                switch (badComment) {
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
            }
        }
    }

    public static void part_3(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int[] x = new int[10];
        int[] y = new int[10];
        int answer;
        int points = 0;
        int i;
        for (i = 0; i < 10; i++)
        {
            x[i] = rand.nextInt(10);
            y[i] = rand.nextInt(10);
        }

        for (i =0; i < 10; i++)
        {
            System.out.println("How much is " + x[i] + " times " + y[i] + "?");
            answer = scnr.nextInt();

            if (answer == (x[i] * y[i]))
            {
                points = points + 10;
            }
        }
        if (points < 75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        part_3();
    }

    public static void part_4(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int[] x = new int[10];
        int[] y = new int[10];
        int answer;
        int level;
        int points = 0;
        int i;

        System.out.println("Please enter a difficulty level. (1-4)");
        level = scnr.nextInt();
        if (level == 1) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(10);
                y[i] = rand.nextInt(10);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + " times " + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (x[i] * y[i])) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_4();
        }

        if (level == 2) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(100);
                y[i] = rand.nextInt(100);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + " times " + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (x[i] * y[i])) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_4();
        }

        if (level == 3) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(1000);
                y[i] = rand.nextInt(1000);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + " times " + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (x[i] * y[i])) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_4();
        }

        if (level == 4) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(10000);
                y[i] = rand.nextInt(10000);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + " times " + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (x[i] * y[i])) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_4();
        }
    }

    public static void part_5(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int[] x = new int[10];
        int[] y = new int[10];
        int type;
        String operator = "";
        int Type = 0;
        int answer;
        int level;
        int points = 0;
        int i;

        System.out.println("What type of problem would you like to do? (1: addition, 2: multiplication, 3: subtraction, 4: division, 5: random)");
        type = scnr.nextInt();
        switch(type) {
            case 1:
                operator = " plus ";
                Type = 1;
                break;
            case 2:
                operator = " times ";
                Type = 2;
                break;
            case 3:
                operator = " minus ";
                Type = 3;
                break;
            case 4:
                operator = " divided by ";
                Type = 4;
                break;
            case 5:
                Type = 5;

        }
        System.out.println("Please enter a difficulty level. (1-4)");
        level = scnr.nextInt();
        if (level == 1) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(10);
                y[i] = rand.nextInt(10);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + operator + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (opType(x[i],  y[i], Type))) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_5();
        }

        if (level == 2) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(100);
                y[i] = rand.nextInt(100);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + operator + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (opType(x[i],  y[i], Type))) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_5();
        }

        if (level == 3) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(1000);
                y[i] = rand.nextInt(1000);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + operator + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (opType(x[i], y[i], Type))) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_5();
        }

        if (level == 4) {
            for (i = 0; i < 10; i++) {
                x[i] = rand.nextInt(10000);
                y[i] = rand.nextInt(10000);
            }

            for (i = 0; i < 10; i++) {
                System.out.println("How much is " + x[i] + operator + y[i] + "?");
                answer = scnr.nextInt();

                if (answer == (opType(x[i], y[i], Type))) {
                    points = points + 10;
                }
            }
            if (points < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            part_5();
        }
    }

    public static int opType(int x, int y, int typeNum) {
        int n = 0;
        switch (typeNum) {
            case 1:
                n = Addition(x, y);
            case 2:
                n = Multiplication(x, y);
            case 3:
                n = Subtraction(x, y);
            case 4:
                n = Division(x, y);
            case 5:
                RANDOS(x, y);
        }
        return n;
    }

    public static int Addition(int x, int y){
        int i = x + y;
        return i;
    }

    public static int Multiplication(int x , int y){
        int i = x * y;
        return i;
    }

    public static int Subtraction(int x, int y){
        int i = x - y;
        return i;
    }

    public static int Division(int x, int y){
        int i = x / y;
        return i;
    }

    public static int RANDOS(int x , int y){
        SecureRandom rand = new SecureRandom();
        int[] arr = new int[10];
        int i;
        int n = 0;
        for (i = 0 ; i < 10; i++)
        {
            arr[i] = rand.nextInt( 4);
        }
        for (i = 0; i < 10; i++)
        {
            switch(arr[i]) {
                case 0:
                    n = Addition(x, y);
                    break;
                case 1:
                    n = Multiplication(x, y);
                    break;
                case 2:
                    n = Subtraction(x, y);
                    break;
                case 3:
                    n = Division(x, y);
                    break;
            }
        }
        return n;
    }
}




