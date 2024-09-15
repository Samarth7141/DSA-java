public class sumOfRows{
    public static void main(String[] args){
        int[][] num = { {1,4,9},{11,4,3},{2,2,3} };
        sum(num);
    }

    public static void sum(int matrix[][]){
        int sum = 0;
        for(int i = 1 ; i <= 1 ; i++){
            for(int j =0; j< matrix[0].length ; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}