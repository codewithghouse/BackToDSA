package paterns;
public class floydtr{
    //function to print the floyd triangle
    public static void floydTriangle(int n){
        //here count variable is there for increasing 
        int count =1;
        //outer loop 
        //note the i and j are dependent on each other 
        for(int i =1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
             count++;

        }
       
        System.out.println();
        }

    }
    public static void main(String[] args){
        floydTriangle(5);
    }

}
