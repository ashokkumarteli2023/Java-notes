import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class priority_queue {
    public static void main(String argu[])
    {
        Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        //or    PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(11);
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);
        System.out.println("Priority_Queue"+pq);

        System.out.println(pq.peek());  //jo sbse phle niklne wala h 
        System.out.println(pq.poll());  
    }
}
