import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.TreeSet;
import java.util.Set;
public class hashset {
    public static void main(String[] argu)
    {
        Set<Integer>set=new HashSet<>();     //order is random
        // Set<Integer>set=new LinkedHashSet<>();  //order is same {add and remove o(1)}
        // Set<Integer>set=new TreeSet<>();    //sorted
        set.add(1);
        set.add(12);
        // set.add(121);
        // System.out.println("HashSet"+set);
        
        System.out.println(set.iterator().next());

        //unique
        // set.add(121);
        // set.add(121);
        // set.add(121);
        // System.out.println(set);

        // set.remove(1);
        // System.out.println("after removing: "+set);


        // System.out.println("Contain? "+set.contains(10));

        // System.out.println("Empty? "+set.isEmpty());
        // System.out.println("Size: "+set.size());

        // set.clear();
        // System.out.println("Empty? "+set.isEmpty());


        //Custom class set
        // Set<Student>set=new HashSet<>();
        // set.add(new Student("Ashok", 3));
        // set.add(new Student("Asha", 2));
        // set.add(new Student("Ankesh", 1));
        // set.add(new Student("Ankesh", 1)); //problem -> it will add it
        //becoz ye doh different object hai and hashset inhe differentiate nhi kr skta
            //solution -> we have to define hascode

        // System.out.println(set);
    }
}
