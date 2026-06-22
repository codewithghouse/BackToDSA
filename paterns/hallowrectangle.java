package paterns;
public class hallowrectangle{
    //function to print the hallow rectangle pattern
    public static void hallow(int n , int m){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             System.out.println("");
           

        }
       
    }
    public static void main(String[] args) {
        int n = 4; //for rows
        int m = 5; // for columns
        //function call
        hallow(n, m);

        
    }
}