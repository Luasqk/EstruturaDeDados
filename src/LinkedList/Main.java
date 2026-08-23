package LinkedList;

public class Main {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            list.insertValue(5);
            list.insertValue(6);
            list.insertValue(7);

            list.printList();
            System.out.println();

            list.addAtBegin(9);
            list.printList();
            System.out.println();

            System.out.println("Size: " + list.getSize());
            System.out.println(list.containsValue(79));

            list.deleteTheLastNode();
            list.printList();
        }
    }
