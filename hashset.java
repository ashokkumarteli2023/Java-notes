// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
public class hashset {
    public static void main(String[] argu)
    {
        // Set<Integer>set=new HashSet<>();     //order is random
        // Set<Integer>set=new LinkedHashSet<>();  //order is same
        Set<Integer>set=new TreeSet<>();    //sorted
        set.add(1);
        set.add(12);
        set.add(121);
        System.out.println("HashSet"+set);
        
        //unique
        set.add(121);
        set.add(121);
        set.add(121);
        System.out.println(set);

        set.remove(1);
        System.out.println("after removing: "+set);


        System.out.println("Contain? "+set.contains(10));

        System.out.println("Empty? "+set.isEmpty());
        System.out.println("Size: "+set.size());

        set.clear();
        System.out.println("Empty? "+set.isEmpty());
    }
}
