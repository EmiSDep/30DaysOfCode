package com.emisdep;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phonebook = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phonebook.get(s) == null){
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phonebook.get(s));
            }
        }
        in.close();
    }
}