public class sorting {
    public static void bubble_sort(int number[],int n){
        //i=number of turns
        for(int i=0;i<n-1;i++){
            int swaps=0;
            //j=number of comparisons in each turn
            for(int j=0;j<n-1-i;j++){
                if(number[j]>number[j+1]){
                    //swap
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0){
                break;
            }
        }

    }
    public static void selection_sort(int number[],int n){
        for(int i=0;i<n-1;i++){
            int minindex=i;
             
            //finding the minimum element in the unsorted array
            for(int j=i+1;j<n;j++){
              
                if(number[j]<number[minindex]){
                    minindex=j;
                }
               
               
             
                
          }
            //swap
                  int temp=number[minindex];
                 number[minindex]=number[i];
                number[i]=temp;
               
      
           
           

        }
    }
    public static void insertion_sort(int number[],int n){
       for(int i=1;i<n;i++){
        int curr=number[i];
        int prev=i-1;
        //finding the correct position to insert the current element
        while(prev>=0 && number[prev]>curr){
            number[prev+1]=number[prev];
            prev--;
        }
        number[prev+1]=curr;
       }
    }
    public static void printnumber(int number[],int n){
        for(int i=0;i<n;i++){
            System.out.print(number[i]+" ");
             
        }
    }
    public static void main(String[] args) {
        int number[]={6,5,3,1,8,7,2,4};
        int n=number.length;
      insertion_sort(number, n);
        printnumber(number, n);
        
    }
    
}
