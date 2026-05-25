package practice21;

public class question3 {
    //function to print the triangle pattern
    public static void Printtriangle(){
        int n = 4;
        //outer loop for rows
        for(int i = 0; i < n ; i++){
            //inner loop for cols and here cols are depend on rows
            for( int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Printtriangle();
        
    }
}
