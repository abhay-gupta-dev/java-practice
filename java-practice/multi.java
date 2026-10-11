import java.util.*;
public class multi{ 
    public static boolean compare(Integer matrix[][],int target,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            if(matrix[i][j]==target){
                System.out.println("target found at cell "+"("+i+","+j+")");
                return true;
            }
            }
           
        }
        System.out.println("target not found in the matrix");
        return false;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
         Integer matrix[][]=new Integer[row][col];
System.out.println("enter the elements of the matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 matrix[i][j]=sc.nextInt();

            }
           
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(matrix[i][j]+" ");

            }
             System.out.println();
        }
        compare(matrix,5,row,col);
    }

}