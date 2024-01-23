import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String args[])
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offerLast(25);
        System.out.println(adq);

        System.out.println(adq.peek()); //front element
        System.out.println(adq.peekFirst()); //first element
        System.out.println(adq.peekLast());  //last 

        System.out.println(adq.poll());     //front out
        System.out.println("poll() "+adq);  

        System.out.println(adq.pollFirst());  
        System.out.println("pollFirst()"+adq);

        System.out.println(adq.pollLast()); //last removed
        System.out.println("pollLast()"+ adq);

    }
}
