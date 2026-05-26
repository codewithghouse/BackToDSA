package arrays;

public class smallestinarray {
    //function to print the smallest number in an array
    public static void smallestInArray(){
        int array[]={3,7,2,9,1};
        int smallNum=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(smallNum>array[i]){
                smallNum=array[i];
            }
        }
        System.out.print(smallNum);
    }
    public static void main(String[] args) {
        //function call
        smallestInArray();
        
    }
}
