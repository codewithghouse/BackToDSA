package arrays;

public class evennumsumcount {
    public static void evenSumcount(){
       int arr[] = {1,2,3,4,5,6};
       int count = 0; //for even numbers count 
       int sum =0; // for total sum of an even numbers from an given array
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2 == 0){
            count++;
            sum+= arr[i];
        }
       }
       System.out.println("Even number count "+" "+ count);
       System.out.println("Even Numbers Sum "+" "+sum);
    }

    public static void main(String[] args) {
        //function call
        evenSumcount();
    }
}
