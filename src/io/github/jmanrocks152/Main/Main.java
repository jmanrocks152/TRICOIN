package io.github.jmanrocks152.Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jmanrocks152 on 5/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        //Variable initialization
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int coinsToBeTested;
        int numberForRow = 1;
        int rows = 0;
        ArrayList<Integer>  coinValues = new ArrayList<>();
        //For loop that adds the test cases into an ArrayList
        for(int i = 0; i < testCases; i++) {
           coinValues.add(scanner.nextInt());
        }
        //For loop that determines the maximum height of the triangle
        for (Integer coinValue : coinValues) {
            coinsToBeTested = coinValue;
            //While loop that does the actual calculations
            while (coinsToBeTested - numberForRow > 0) {
                //If that checks whether or not we've run out of coins
                if (coinsToBeTested - numberForRow == 0) {
                    return;
                } else {
                    coinsToBeTested -= numberForRow;
                    numberForRow++;
                    rows++;
                }
            }
            System.out.println(rows);
            numberForRow = 1;
            rows = 0;
        }
    }
}
