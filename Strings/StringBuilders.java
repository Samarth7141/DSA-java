package Strings;

public class StringBuilders {
    public static void main(String[] args){
    StringBuilder sb = new StringBuilder("Samarth ");
    for(char ch = 'a'; ch <= 'z'; ch++){
        sb.append(ch);
    }
    System.out.println(sb);
}
}
