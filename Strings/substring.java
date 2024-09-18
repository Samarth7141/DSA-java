package Strings;

public class substring {
    public static void main(String[] args){
        // String str = "samarth";
        // getSubstring(str, 2, 7);
        String fruits[] = {"samarth", "mango", "banana"};
        largestString(fruits);
    }
    public static void getSubstring(String str , int si, int ei){
        String substr = "";
        for(int i =si ; i< ei ; i++){
            substr += str.charAt(i);
        }
        System.out.println(substr);

    }
    public static void largestString(String str[]){
        String largest = str[0];
        for(int i = 0;i<str.length;i++){
            if(largest.compareTo(str[i])< 0){
                largest = str[i];
            }
        }
        System.out.println(largest);    
    }
}
