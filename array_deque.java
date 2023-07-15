import java.util.ArrayDeque;
public class array_deque {
    public static void main(String[] argu )
    {
        ArrayDeque<Integer>arr_deque=new ArrayDeque<>();
        arr_deque.offer(1);
        arr_deque.offer(5);
        arr_deque.offer(10);
        System.out.println("ArrayDeque"+arr_deque);

        arr_deque.offerFirst(0);
        arr_deque.offerLast(20);
        System.out.println(arr_deque);
        
        System.out.println("peek:"+arr_deque.peek());
        System.out.println("peekFirst:"+arr_deque.peekFirst());
        System.out.println("peekLast:"+arr_deque.peekLast());

        System.out.println("poll="+arr_deque.poll());
        System.out.println("pollFirst="+arr_deque.pollFirst());
        System.out.println("pollLast="+arr_deque.pollLast());

    }
}
