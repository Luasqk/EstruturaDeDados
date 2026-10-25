package DoubleEndedQueue;

public class Main {
    static void main() {
        DoubleEndedQueue dbQueue = new DoubleEndedQueue();

        dbQueue.pushFront(1);
        dbQueue.pushFront(2);
        dbQueue.pushFront(3);

        System.out.println("\nNode inicial: ");
        dbQueue.printList();

        System.out.println("\nPush Front: ");
        dbQueue.pushFront(4);
        dbQueue.printList();

        System.out.println("\nPush back: ");
        dbQueue.pushBack(9);
        dbQueue.printList();

        System.out.println("\nPop front: ");
        dbQueue.popFront();
        dbQueue.printList();

        System.out.println("\nPop back: ");
        dbQueue.popBack();
        dbQueue.printList();

        System.out.println("\nPeek front: ");
        dbQueue.peekFront();

        System.out.println("\nPeek back: ");
        dbQueue.peekBack();
    }
}
