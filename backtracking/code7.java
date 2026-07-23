public class code7{
    public static boolean sudokusolver(int board[][],int row,int col){
        //base case
        if(row==board.length){
            return true;
        }
        //recursive case
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==board.length){
            nextrow=row+1;
            nextcol=0;
        }
        if(board[row][col]!=0){
           return sudokusolver(board,nextrow,nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;        //if safe then place the digit in the cell so that we can check for next cell 
                if(sudokusolver(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col]=0;        //backtrack

            }
        }
        return false;

    }
    public static boolean isSafe(int board[][],int row,int col,int digit){
        //row and col
        for(int i=0;i<board.length;i++){
            if(board[row][i]==digit){   //row
                return false;
            }
            if(board[i][col]==digit){  //col
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;


    }
    public static void printboard(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
         int[][] board = {
            {3,0,6,5,0,8,4,0,0},
            {5,2,0,0,0,0,0,0,0},
            {0,8,7,0,0,0,0,3,1},
            {0,0,3,0,1,0,0,8,0},
            {9,0,0,8,6,3,0,0,5},
            {0,5,0,0,9,0,6,0,0},
            {1,3,0,0,0,0,2,5,0},
            {0,0,0,0,0,0,0,7,4},
            {0,0,5,2,0,6,3,0,0}
        };
        if(sudokusolver(board,0,0)){
            printboard(board);
        }
        else{
            System.out.println("solution does not exist");
        }


    }
}