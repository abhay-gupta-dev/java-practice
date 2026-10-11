public class doublesum {
    public static int double_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //for primary diagonaal sum
            sum+=matrix[i][i];         //row and column are same for primary diagonal
            //for secondary diagonal sum
            if(i!=matrix.length-1-i){   //to avoid double counting of middle element in case of odd order matrix
                sum+=matrix[i][matrix.length-1-i];  //row is i and column is (length-1-i) for secondary diagonal
            }
        }
        return sum;
    }
    public static boolean searchelementinmatrix(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at cell ("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found in the matrix");
        return false;

    }
    public static int countofnumber(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        System.err.println("number of occurrences of "+key+" in the matrix is: "+count);
        return count;
    }
    public static int printsumnumberfrom2ndrow(int matrix[][]){
      int sum=0;
    for(int j=0;j<matrix[0].length;j++){
        sum+=matrix[1][j];  //row is 1 for second row and column is j
    }
    System.out.println("sum of elements from second row is: "+sum);
    return sum;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int[][] matrix = {
    {1,  3,  5,  7},
    {2,  4,  6,  8},
    {9, 4, 4, 12},
    {13,14, 15, 16}
};
// int target=sc.nextInt();
printsumnumberfrom2ndrow(matrix);


     
       
      
    }
    
}
