// public class matrix2 {
//     public static int[][] sumoftwomatrix(int matrix1[][],int matrix2[][]){
//         int matrix[][]=new int[3][3];
//         for(int i=0;i<matrix1.length;i++){
//             for(int j=0;j<matrix1[0].length;j++){
//                 matrix[i][j]=matrix1[i][j]+matrix2[i][j];
//             }
//         }
//         return matrix;
       

//     }
//     public static void main(String[] args) {
       
//         int matrix1[][]={{1,2,3},
//                          {4,5,6},
//                          {7,8,9}};
//         int matrix2[][]={{9,8,7},
//                          {6,5,4},
//                          {3,2,1}};
//        int matrix[][]= sumoftwomatrix(matrix1,matrix2);
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix.length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();

//         }
        
//     }
    
// }



public class matrix2{
    public static void printmatrixsum(int matrix1[][],int matrix2[][]){
        int matrix[][]=new int[3][3];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                matrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        // return matrix;
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
      
    }
    public static void transposeofmatrix(int matrix1[][]){
        int transpose[][]=new int[3][3];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                transpose[j][i]=matrix1[i][j];

             
            }
           
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");

            }
            System.out.println();
        }
      
        



    }
    public static void main(String[] args) {
        int matrix1[][]={{4,2,0},
                         {4,5,6},
                         {7,4,9}};
        int matrix2[][]={{5,2,7},
                         {1,7,2},
                         {0,2,1}};
       
        transposeofmatrix(matrix1);
        
    }
}