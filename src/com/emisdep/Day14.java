package com.emisdep;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements){
        this.elements = elements;
    }

    //find maximum absolute difference between any 2 numbers in elements
    public int computeDifference(){

        int min = elements[0];
        int max = elements[0];
        for (int i = 0; i < elements.length; i++){
            min = Math.min(min, elements[i]);
            max = Math.max(max, elements[i]);
        }
        return maximumDifference = Math.abs(max-min);
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
