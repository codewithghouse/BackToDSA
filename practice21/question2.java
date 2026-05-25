package practice21;

public class question2 {

    //function to print thepattern 
    public static void printpattern(){
        //declaring 2 variables for row and column
        int n=4; // for rows
        int m=4;//for cols
        //outer loop
        for(int i=0;i<=n;i++){
            //inner loop
            for(int j=0;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        //function call
        printpattern();
        
    }
}
