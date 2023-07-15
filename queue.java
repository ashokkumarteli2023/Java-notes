
import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String argu[])
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue"+queue);

        System.out.println(queue.poll());   //remove front element
        System.out.println(queue);

        System.out.println(queue.peek());   //gives front element
        // System.out.println(queue);
    }
}
