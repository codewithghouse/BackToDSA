package arrays;
public class oddnumbers {

    //function to print the odd number count from the array
    public static void oddNumberCountFromArray(){
       int arr[] = {1, 2, 3, 4, 5};
       int count = 0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2 !=0){
               count++;

        }
       }
       System.out.println(count +" "+ "are the odd numbers count in an given array");
    }
    public static void main(String[] args) {
        //function call
        oddNumberCountFromArray();
        
    }
}