public class practice8 {
    private static final String [] words={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void numtostring(int number){
        //if number is equal to zero then return not do further
        //base case
        if(number==0){
            return;
        }
        int lastdigit=number%10;
        int remainingnumber=number/10;
        numtostring(remainingnumber);
        System.out.print(words[lastdigit]+" ");


    }
    public static void main(String[] args){
        int input=1456;
        if(input==0){
            System.out.println("zero");
        }else{
            numtostring(input);
            System.out.println();

        }

    }
    
}
