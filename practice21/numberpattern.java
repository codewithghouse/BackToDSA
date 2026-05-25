package practice21;

public class numberpattern {
    //function to print the number pattern 
    public static void numberPattern(){
        //outer loop
        for(int i=4;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //function call
        numberPattern();
        
    }
}
