package array;
public class binarysearch{
    //function to implement binary search
    //the array must be shorted while applying binary search on array
    public static int binarySearch(int array[], int key){
        int start= 0;
        int end = array.length-1;
        
        //while loop for until the condition is true
        while(start <= end){
            int mid =(start +(end -start)/2);
         if(array[mid]==key){
            return mid;
         } if(array[mid]>key){
            end = mid -1;
        }else{
            start = mid+1;
        }
        }
        return -1;

    }
    public static void main(String[] args) {
        int array []={1,2,3,4,5};
        int key = 4;
        //function
        System.out.println("the value is present at index value "+" "+binarySearch(array, key));
    }

}