public class noOfSeven {
    public static void main(String[] args){
        int[][] array = { {7,7,7},{8,8,7} };
        noofseven(array);
    }

    public static void noofseven(int matrix[][]){
        // int endCol = matrix[0].length;
        int count = 0;
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    
}
