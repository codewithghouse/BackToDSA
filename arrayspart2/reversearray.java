package arrayspart2;

public class reversearray {

    //function to reverse the array without using any extra array
    public static void reverseArray(int array[]){
        
        int first=array[0];
        int last =array[(array.length-1)];
        while(first <last){
            int temp = last; // array ke last element ku store krre
            first = last;
            last = temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        //function call
        reverseArray(array);
        for(int i =0 ; i<array.length; i++){
            System.out.println(array[i]);
        }
        
        
    }
}