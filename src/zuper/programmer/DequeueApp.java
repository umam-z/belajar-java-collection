package zuper.programmer;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        // STACK
        stack.offerLast("Muhammad");
        stack.offerLast("Sirajul");
        stack.offerLast("Umam");

        System.out.println("STACK");
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        
        Deque<String> qeque = new LinkedList<>();
        
        qeque.offerLast("Muhammad");
        qeque.offerLast("Sirajul");
        qeque.offerLast("Umam");
        
        System.out.println("QUEUE");
        System.out.println(qeque.pollFirst());
        System.out.println(qeque.pollFirst());
        System.out.println(qeque.pollFirst());

        // for (String string : deque) {
        //     System.out.println(string);
        // }

    }
}
