import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String args[]){

        List<Integer> nums = Arrays.asList (4, 5, 7, 3, 8);

        // Consumer<Integer> con= new Consumer<Integer>(){
            
        //     public void accept(Integer n){
        //         System.out.print(n);
        //     }
        // };
        
        nums.forEach(n ->  System.out.print(n));

    }
}