package arrays;

public class arraysum {

    //function to print the sum of an array
    public static int sumArray(){
        int arr[]={2,4,6,8,10};
        int sum =0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        }
         return sum;
    }
        

    
    public static void main(String[] args) {
        //function call
        System.out.print(sumArray());
    }
}
