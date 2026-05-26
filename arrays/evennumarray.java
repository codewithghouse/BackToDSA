package arrays;
public class evennumarray {
    //function to print the even num sum from the array
    public static void EvenNumSum(){
        int sum=0;
        int array[]={1,2,3,4,5};
        for(int i=0;i<array.length;i++){
            if((array[i]%2)==0){
                sum=sum+array[i];
            }
            
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        //function call
        EvenNumSum();
        
    }
}