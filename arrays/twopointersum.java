package arrays;

public class twopointersum {
    public static void twoPointerSum(){
        int arr[] = {1,2,3,4,6};
        int target = 6;
        int left = 0;
        int right = arr.length -1;
        int result=0 ;
        for(int i=0;i<arr.length;i++){
            if(arr[left]+arr[right]== target){
               result = arr[left]+arr[right];
         
            }else{
                left ++;
                right --;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        //function call
        twoPointerSum();
        
    }
    
}
