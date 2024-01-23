import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class priorityqueue {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(44);
        pq.offer(12);
        pq.offer(22);
        pq.offer(33);
        
        
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());


    }
}
