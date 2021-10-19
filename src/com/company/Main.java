package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//    System.out.println(x);
        System.out.println("Running the code");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your principal");
        int principal = sc.nextInt();

        System.out.println("Enter your rate");
        float rate = sc.nextFloat();

        System.out.println("Enter your time");
        int time = sc.nextInt();

        float SI = principal*rate*time/100 ;

        System.out.println(SI);

    }
}
