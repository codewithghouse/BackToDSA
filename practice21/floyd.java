package practice21;

public class floyd {
    //function to print the floyd triangle
    public static void FloydTriangle(){
        int count =1;
        //outer loop
        for(int i=0;i<4;i++){
            //inner loop
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
            
    }
}
    public static void main(String[] args) {
        //function call
        FloydTriangle();
        
    }
}
