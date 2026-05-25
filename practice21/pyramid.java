package practice21;

public class pyramid {
    //function to print the pyramid pattern
  
    public static void PyramidPattern(){
        //spacing loop
        for(int i=0;i<=4-1;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 public static void main(String[] args) {
    //function call
    PyramidPattern();
    
 }   
}
