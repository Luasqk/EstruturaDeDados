package Queues;

public class Main {
    static void main() {
        Queue queue = new Queue();

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(9);

        queue.dequeue();

        queue.printQueue();

        System.out.println(queue.getSize());
    }
}
