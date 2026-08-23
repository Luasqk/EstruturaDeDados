package LinkedList;

public class LinkedList {
        Node begin;

        public LinkedList() {
            this.begin = null;
        }

        public void insertValue(int value) {
            if (begin == null) {
                begin = new Node(value);
                return;
            }

            Node currentNode = begin;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = new Node(value);
        }

        public void printList() {
            Node currentNode = begin;
            while (begin != null) {

                System.out.print(currentNode.value);
                currentNode = currentNode.next;

                if (currentNode == null) {
                    return;
                }
                System.out.print(" -> ");
            }

        }

        public int getSize() {
            int size = 0;
            Node currentNode = begin;

            while (currentNode != null) {
                size++;
                currentNode = currentNode.next;
            }
            return size;
        }

        public boolean containsValue(int value) {
            Node currentNode = begin;

            while (currentNode != null) {
                if (currentNode.value == value) {
                    return true;
                }
                currentNode = currentNode.next;
            }

            return false;
        }


        public void addAtBegin(int value) {
            Node newNode = new Node(value);

            newNode.next = begin;
            begin = newNode;
        }


/*
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {

        if(this.tail == null){
            head = null;
            return;
        }

        SinglyLinkedListNode node = head;
        SinglyLinkedListNode previousNode = null;

        if(node.next == null){
            return node.data
        }

        while(node.next != null){

            previousNode = node;
            node = node.next;
        }

        while(previousNode != null){

            System.out.println(node.data);
             node = node.previousNode;
             previousNode = node.previousNode.previousNode;
        }

    }
*/
        public boolean deleteValue(int value){
            Node currentNode = begin;
            Node previousNode = null;

            if (currentNode != null && currentNode.value == value){
                begin = currentNode.next;

                return true;
            }

            while (currentNode != null && currentNode.value != value) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            if(currentNode != null) {
                previousNode.next = currentNode.next;
            }

            if (currentNode == null) {
                return false;
            }

            return true;
        }

        public void deleteTheLastNode(){

            if(begin == null){
                return;
            }

            if(begin.next == null){
                begin = null;
                return;
            }

            Node currentNode = begin;
            Node previousNode = null;

            while(currentNode.next != null){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            previousNode.next = null;
        }
    }