import java.util.*;
public class array_class {
    public static void main(String[] argu)
    {
        // int[] numbers={1,2,3,4,5};
        // int idx=Arrays.binarySearch(numbers,3); //array must be sorted
        // System.out.println("index of element which value is 3 is ="+idx);

        int[] price={10,1,8,5,3};
        Arrays.sort(price);
        
        //print 
        // System.out.println(price); //wrong way
        for(int value:price)
        {
            System.out.println(value+" ");
        }

        Arrays.fill(price,100);
        System.out.println("after filling ");
        for(int value:price)
        {
            System.out.println(value+" ");
        }
    }
}
