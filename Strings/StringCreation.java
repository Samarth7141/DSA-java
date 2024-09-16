package Strings;

import java.util.*;
public class StringCreation {
    public static void main(String[] args) {
        String str = "samarth";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        name = name.toUpperCase();
        System.out.println(name);
        
    }
}
