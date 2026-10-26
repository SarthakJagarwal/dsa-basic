import java.util.Queue ; 
import java.util.LinkedList ; 

public class queuebasic_dsa {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>() ; 

        queue.offer("karan");
        queue.offer("sarthak") ;
        queue.offer("kunal") ;

        System.out.println(queue.contains("karan")); 
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
// where used 
//1. keyboard buffer
//2. printer queue
//3. used in linkedlist , bfs 