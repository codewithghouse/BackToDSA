package paterns;

public class irhpwn {
    //function to print the inverted rotated half pyramid with numbers
    public static void iRHPWM(int n){
        //outer loop for rows
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }System.out.println();

        }

    }
    
    public static void main(String[] args){
        int n=5; // number of rows and columns are dependent on rows
        iRHPWM(n);
    }
}
