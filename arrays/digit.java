public class digit {

    public static void digits(int array[]){
     
        for(int i = array.length-1 ; i >= 0 ; i--){
            if(array[array.length-1]<9){
                array[array.length-1]+=1;
            }else if(array[array.length-1]==9){
                array[array.length-2]+=1;
                array[array.length-1]=0;

            }  
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3};
        //function call
        digits(array);
        //updated array
        for(int i =0 ;i <array.length;i++){
            System.out.println(array[i]);
        }

    }
}