package com.company;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
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


