public class code8 {
    public static boolean issafe(int maze[][],int x,int y,int n){
        if(x>=0 && x<n && y>=0 && y<n && maze[x][y]==1){
            return true;
        }
        return false;
    }
    public static void solvemaze(int maze[][],int x,int y,int sol[][],int n){
        if(!issafe(maze,x,y,n)){
            return;
        }
        sol[x][y]=1;
        if(x==n-1 && y==n-1){
            printsol(sol,n);
            sol[x][y]=0;   //backtrack
            return;


        }
        solvemaze(maze,x+1,y,sol,n);  //down
        solvemaze(maze,x,y+1,sol,n);  //right
        sol[x][y]=0;   //backtrack

    }

    
    public static void printsol(int sol[][],int n){
        System.out.println("path is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
            }
            System.out.println();

        }

    

  
    public static void main(String[] args) {

        int maze[][] = {
                {1, 1, 1}, 
                {1, 1, 1},
                {1, 1, 1}
        };
               
        int n = maze.length;
        int sol[][] = new int[n][n];

        solvemaze(maze, 0, 0, sol, n);
    }
}
