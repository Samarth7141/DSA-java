package Strings;
import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println(isPalindrom(str));

    }

    public static boolean isPalindrom(String str){
        for(int i = 0 ; i < str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i - 1)){
                return false;
            }
        }
        return true;
    }
}
