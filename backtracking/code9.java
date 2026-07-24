public class code9 {

    public static boolean issafe(int maze[][], int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1);
    }

    public static boolean solvemaze(int maze[][], int x, int y, int sol[][], int n) {

        if (!issafe(maze, x, y, n)) {
            return false;
        }

        sol[x][y] = 1;

        if (x == n - 1 && y == n - 1) {
            printsol(sol, n);
           
            return true;
        }

        // Down
        if (solvemaze(maze, x + 1, y, sol, n)) {
            return true;
        }

        // Right
        if (solvemaze(maze, x, y + 1, sol, n)) {
            return true;
        }

        // Backtrack
        sol[x][y] = 0;
        return false;
    }

    public static void printsol(int sol[][], int n) {

        System.out.println("Path:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[i][j] + " ");
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

        System.out.println("Solutions are:");
        solvemaze(maze, 0, 0, sol, n);
    }
}
