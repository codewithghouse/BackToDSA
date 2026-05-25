package arrays;
public class array1 {
    //function to print the array 
    public static void arrayPrint(){
        int arr[] = {2,4,6,8,10};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        //function call
        arrayPrint();
        
    }
}