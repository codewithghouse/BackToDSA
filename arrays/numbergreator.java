package arrays;

public class numbergreator {
    //function to count the numbers greater then the number
    public static void greatorNumber(){
        int count = 0;
       int arr[] = {1,2,3,4,5,6,7};
       int currNum=arr[2];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>currNum){
            count++;
        }
       }
       System.out.println("the total numbers that are greator than 3 are "+ " "+ count);
    }
    public static void main(String[] args) {
        //function call
        greatorNumber();
        
    }
}
