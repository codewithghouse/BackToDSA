package paterns;
public class irhp{
    //function to print the inverted rotated half pyramid
    public static void irhP(int n ){
        //outer loop
        for(int i=1;i<=n;i++){
            //first loop for spaces
            for( int j=1 ;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        
        irhP(n);
   
    }
}