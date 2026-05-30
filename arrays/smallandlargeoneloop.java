package arrays;

public class smallandlargeoneloop {
    public static void largeAndSmall(){
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int arr[] = {5,2,8,1,9};
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small= arr[i];
               
            }
            if(large <arr[i]){
                large=arr[i];
            }
        }
        System.out.println("the small is "+" "+small+" "+ " and large is "+" "+ large);

    }
    public static void main(String[] args) {
        //function call
        largeAndSmall();
        
    }
}
