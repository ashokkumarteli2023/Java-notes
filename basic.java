//List and ArrayList


// import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class basic {
    public static void main(String args[])
    {
        // System.out.println("let's learn Java");

        //Take input
        // int a;
        // System.out.println("Enter a number:");
        // Scanner sc= new Scanner(System.in);
        // a=sc.nextInt();
        // System.out.println(a);

        //Fixed size
        // String[] students_name=new String[30];
        // students_name[0]="Ankesh";
        // students_name[31]="Ritika";

        //Dynamic size
        // ArrayList<String> students_name=new ArrayList<>();
        // students_name.add("Ankesh");
        // students_name.add("Ashok");
        
        //List
        List<Integer>list = new ArrayList<>();
        // or
        // List<Integer>list = new LinkedList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        
        // list.add(4); //4 will be added at the end
        // System.out.println(list);

        // list.add(1,100);    //add new element at particular index
        // System.out.println(list);

        // List<Integer>list1=new ArrayList();
        // list1.add(1001);
        // list1.add(1002);

        // list.addAll(list1);     //add new list
        // System.out.println(list);

        // System.out.println(list.get(0)); //get element present at index 0

        // list.remove(0);
        // System.out.println(list);
        
        // list.remove(Integer.valueOf(2)); //delete element with given value
        // System.out.println(list);

        // list.clear();   //delete all the elements 
        // System.out.println(list);

        // list.set(0,100);    //update element value at a given index
        // System.out.println(list);

        // System.out.println(list.contains(100)); //check element presence


        //Print the list
        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println("Element is "+list.get(i));
        // }

        // for(Integer ele: list)
        // {
        //    System.out.println("Foreach Element is "+ele); 
        // }

        Iterator<Integer>it=list.iterator();
        while(it.hasNext())
        {
            System.out.println("Iterator element is "+it.next());
        }
        System.out.println("End");
    }
}
