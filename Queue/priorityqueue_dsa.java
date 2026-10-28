import java.util.* ; 

public class  priorityqueue_dsa {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()) ;

        queue.offer("B") ;
        queue.offer("A") ;
        queue.offer("Q") ;
        queue.offer("Y") ;
        queue.offer("12"); 

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
