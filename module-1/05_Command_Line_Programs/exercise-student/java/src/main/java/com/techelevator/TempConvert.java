package com.techelevator;

import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature:  ");

        int temperature = input.nextInt();
        input.nextLine();

        System.out.print("Is the temperature in degrees (c)elcius, or (f)arenheit? ");

        String effOrCee = input.nextLine();

        System.out.println(temperature + effOrCee + " is " + doConversion(temperature, effOrCee)
                + (effOrCee.toUpperCase().startsWith("f") ? "c" : "f"));

    }

    public static int doConversion(int temperature, String efforcee) {
        if (efforcee.toUpperCase().startsWith("f")) {
            int resultTempC = (int) ((temperature - 32) / 1.8);
            return resultTempC;
        } else {
            int resultTempF = ((int) (temperature * 1.8 + 32));
            return resultTempF;
        }
    }

}
