package Strings;

public class accenturecoding {
    public static void main(String[] args) {
        int input1 = 8;
        int input2[] = {5,6,4,7,7,1,8,8};
        occurance(input1, input2);
        String input3 = " aaabbba";
        String input4 = " ac";
        remove(input3, input4);

    }   
    public static void occurance(int input1, int[] input2){
        int largest  = 0;
        int Slargest = 0;
        int count = 0 ;
        
        for( int i = 0 ; i <input1-1 ; i ++){
             if(input2[i] > largest){
                Slargest = largest ;
                largest = input2[i];
            }
        }
        System.out.println(largest);
        System.out.println(Slargest);

        for(int  i = 0; i < input1-1; i++){
            if(input2[i]==Slargest){
                count++;
            }
        }
        System.out.println(count);
    } 

    public static void remove(String input1, String input2){
       String str = "";
        for(int i = 0 ; i < input2.length()-1; i++){
            for( int j = 0 ; i< input1.length()-1; j++){
                if(input2.charAt(j) != input1.charAt(i)){
                    str += input2.charAt(i);
                }
            }
        }
        System.out.println(str);
    }
}

