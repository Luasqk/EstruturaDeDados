package DoublyLinkedList;

public class Main {
    static void main() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertValue(1);
        list.insertValue(2);
        list.insertValue(3);

        list.printList();
        list.deleteValue(2);

        System.out.println();
        System.out.println(list.getSize());

        System.out.println();

        list.printList();
        System.out.println();
        System.out.println(list.getSize());

    }
}
