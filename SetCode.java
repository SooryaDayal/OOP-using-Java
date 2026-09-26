import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class SetCode{
    public static void main(String args[]){
        // Duplicates are not allowed in HashSet.
        Set<Integer> hashNums= new HashSet<Integer>();
        hashNums.add(55);
        hashNums.add(34);
        hashNums.add(24);
        hashNums.add(11);

        // TreeSet sorts the elements.
        Set<Integer> treeNums= new TreeSet<Integer>();
        treeNums.add(55);
        treeNums.add(34);
        treeNums.add(24);
        treeNums.add(11);

        for (int n: hashNums){
            System.out.println(n);
        }
        System.out.println("----- Sorted using TreeSet-----");
        for (int n: treeNums){
            System.out.println(n);
        }
    }
}