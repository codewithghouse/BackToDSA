package array;

public class largestinarray {
    public static int largestinArray(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(largest < array[i]){
                            largest =array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int array[]={1,5,8,9,10};
        //function call
        System.out.println("the largest element is "+" "+largestinArray(array));

    }
}
