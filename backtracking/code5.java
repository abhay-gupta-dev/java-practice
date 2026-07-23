//finding only one solution of n queens problem
public class code5{
    static int count=0;
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static boolean nqueens(char board[][],int row){
  //base case
         if(row==board.length){
            // printboard(board);
            count++;
            return true;

         }
        // recursion for every column in that row
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
             if( nqueens(board,row+1)){
                return true;
             }
                board[row][j]='x';//backtracking
            }

        }
        return false;

    }
    public static void printboard(char board[][]){
        System.out.println("-----chess board-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println();
    }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
            
        }
      
      if(  nqueens(board,0)){
        System.out.println("solution is possible");
        printboard(board);
      }else{
        System.out.println("solution is not possible");
      }
        System.out.println("total ways to solve n queens problem: "+count);


    }
}