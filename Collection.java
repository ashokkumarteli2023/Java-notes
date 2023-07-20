import java.util.*;
public class Collection {
    public static void main(String[] argu)   
    {
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(24);
        list.add(54);
        list.add(34);
        list.add(32);

        System.out.println(list); //maintain order

        Collections.reverse(list);  //reverse the list
        System.out.println("After reversing:"+list);

        // System.out.println("min element: "+Collections.min(list));
        // System.out.println("max element: "+Collections.max(list));
        // System.out.println("frequency of 12: "+Collections.frequency(list,12));

        // Collections.sort(list,Comparator.reverseOrder());
        // System.out.println(list);

        // List<Student>list=new ArrayList<>();    //while compiling it will generate 2 files
            //{Collection.class and Collection$1.class}
        
        // list.add(new Student("Ashok", 1));
        // list.add(new Student("Abhishek", 3));
        // list.add(new Student("Priyanka", 2));
        // Collections.sort(list); //need to implement Comparable interface
                //for a given class only one Comparable

        // System.out.println(list);

        // Student s1=new Student("Luv", 2);
        // Student s2=new Student("Kush", 3);
        // System.out.println(s1.compareTo(s2));

        //override comparable
        //  Collections.sort(list, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2)
        //     {
        //         return s1.name.compareTo(s2.name);  //direct compare becoz both are strings
        //     }
        // });
        // or
        // Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));

        
        
        // System.out.println(list);
        
        // list.add(new Student("Priyanka", 0));
        // System.out.println(list);
    }
}
