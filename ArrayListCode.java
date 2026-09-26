import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class ArrayListCode{
     
      static void listReference(){
         List<Integer> listNums = new ArrayList<>();
         listNums.add(9);
         listNums.add(4);
         listNums.add(2);
         
         System.out.println(listNums.indexOf(4));
      }

   
      public static void main(String args[]){
        Collection<Integer> collectionNums = new ArrayList<Integer>(); 
        collectionNums.add(6);
        collectionNums.add(5);
        collectionNums.add(8);
        collectionNums.add(2);

        for(int n: collectionNums){
         System.out.println(n*2);
        }

        listReference();
        
   }
}