public class Spiral {
    
    public static void main(String args[]){
        // System.out.println("hello world");
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13, 14, 15, 16}};
        DiagonalSum(matrix);
        StaircaseSearch(matrix, 10);

                          
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0 ;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            for(int j = startCol; j<= endCol; j++){
                System.out.print(matrix[startRow][j]+"");
            }
        }
    }

    public static void DiagonalSum(int matrix[][]){
        int sum = 0;
        for( int i = 0 ; i <= matrix.length-1 ; i++){
            //pd
             sum += matrix[i][i];

             if(i != matrix.length - 1 - i){
                // sd
                sum += matrix[i][matrix.length- 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static boolean StaircaseSearch(int matrix[][] , int key){
       int row = 0;
       int col = matrix.length-1;

     while(row < matrix.length && col >= 0  ){
        if(matrix[row][col] == key){
            System.out.println("key found at"+ "("+row+","+ col);
            return true;
        }
        else if(key< matrix[row][col]){
            col--;
        }
        else {
            row++;
        }
        
        }
        System.out.println("element not found ");
        return false;
    }
    }


