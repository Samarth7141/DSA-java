// Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23gshettysamarth7@gmail.com
public class transposeMatrix {
    public static void main(String[] args){
        int[][] array = { {4,7,8},{8,8,7} };
        Transpose(array);

    }
    public static void Transpose(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transpose = new int[m][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m  ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < transpose.length ; i ++){
            for(int j = 0 ; j < transpose[0].length ; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
