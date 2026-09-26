import java.util.HashMap;
import java.util.Map;

public class MapCode{
    public static void main(String args[]){
        Map<String, Integer> students= new HashMap<>();

        students.put("SRK", 25);
        students.put("Robert", 45);
        students.put("Kiara", 25);
        students.put("Ranbir", 15);
        students.put("Vicky", 32);

        System.out.println(students);
        System.out.println(students.keySet());

        // Printing the Key-Value pair using enhanced for-loop.

        for(String key : students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }   

    }
}