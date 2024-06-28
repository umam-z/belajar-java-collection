package zuper.programmer;

import java.util.Queue;

import zuper.programmer.collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());
        System.out.println(queue.offer("Mohammad"));
        System.out.println(queue.offer("Sirajul"));
        System.out.println(queue.offer("Umam"));

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
