package com.emisdep;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        //Calculate sum of hourglass / print maximum sum.

        int count = 0;
        // 16 hourglass for [6][6]
        int sum[] = new int[16];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                //go through each row/column
                sum[count] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]+ arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                count++;
            }
        }

        Arrays.sort(sum);
        //last element 15
        System.out.println(sum[15]);

        scanner.close();
    }
}

