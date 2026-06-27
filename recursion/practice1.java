

public class  practice1 {
    public static void printDec(int n){
        //through recursion
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    static int printfact(int n){
        if(n==0){
            return 1;
        }
        //int fnm1=printfact(n-1);
        // int fn= n*fnm1;
        // return fn;
        return n* printfact(n-1);

    }
    public static int calcSum(int n){
        if(n==1){
            return 1;

        }
        return n+ calcSum(n-1);

    }
    public static int febonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int nm1=febonacci(n-1);
        int nm2=febonacci(n-2);
        int fn=nm1+nm2;
        return fn;

    }
    public static boolean sortarray(int arr[],int i){
    //    for(int i=0;i<arr.length-1;i++){
    //     if(arr[i]>arr[i+1]){
    //       return false;
    //     }
    //    }
    //    return true;

    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    return sortarray(arr,i+1);

    }
    public static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr,key,i+1);
    }

    public static int lastOcc(int arr[],int key,int i){
    //base case
    if(i==arr.length){
        return -1;

    }
    int isfound=lastOcc(arr,key,i+1);
    if(isfound== -1 && arr[i]==key){
        return i;
    }
    return isfound;
    }
    

    public static void main(String[] args){
        
       
           int []arr={4,5,8,2,2,9};
          int key=2;
        
            System.out.println(lastOcc(arr,key,0));
          
        }

    }
    

