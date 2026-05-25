package practice21;
public class zeroonepattern {
   
//1
// 01
// 101
// 0101
 //function to print the zero one pattern 
 public static void zeroOnePattern(){
 // outer loop
 for(int i=1;i<=4;i++){
    //inner loop
    for( int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print("1"+" ");
        }else{
            System.out.print("0"+" ");
        }
    }
    System.out.println();
 }
 }

    public static void main(String[] args) {
        //function call
        zeroOnePattern();
        
    }
}