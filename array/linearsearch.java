package array;
public class linearsearch{
    //function to print the linear search 
    public static int linearSearch(int array[], int target){
        //loop for iteration on array to find the element
        for(int i=0;i<=array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int target= 5;
        //function call
       System.out.println( "the element is present at"+ "  "+linearSearch(array, target));;
        
    }
}