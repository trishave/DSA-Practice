import java.util.Queue;
import java.util.LinkedList;
public class queue {
    public static void main(String args[])
    {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(12);
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
