import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age= age;
        this.name= name;
    }

    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class ComparatorVsComparable{
    public static void main(String args[]){

        Comparator<Integer> com =new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                // fetches the last digit and compares.
                if (i%10>j%10)
                    return 1;
                else
                    return -1;
                }
            };

        List<Integer> nums= new ArrayList<>();
        nums.add(23);
        nums.add(34);
        nums.add(52);
        nums.add(14);

        Collections.sort(nums, com);
        System.out.println(nums);

        Comparator<Student> students =new Comparator<Student>()
        {
            public int compare(Student i, Student j){
                if (i.age>j.age)
                    return 1;
                else
                    return -1;
                }
            };
 
        List<Student> studs= new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12,"SRK"));
        studs.add(new Student(41,"Vicky"));
        studs.add(new Student(23, "Luca"));

        Collections.sort(studs, students);
        for(Student s : studs)
            System.out.println(s);

        
    }
}