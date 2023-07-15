import java.util.*;
public class Collection {
    public static void main(String[] argu)   
    {
        // System.out.println("working?");
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(24);
        list.add(54);
        list.add(34);
        list.add(32);

        System.out.println("min element: "+Collections.min(list));
        System.out.println("max element: "+Collections.max(list));
        System.out.println("frequency of 12: "+Collections.frequency(list,12));

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}
