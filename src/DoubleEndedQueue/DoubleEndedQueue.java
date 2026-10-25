package DoubleEndedQueue;

public class DoubleEndedQueue {
     Node rear;
     Node front;

    public DoubleEndedQueue(){
        this.rear = null;
        this.front = null;
    }

    public void pushFront(int value){
        Node newNode = new Node(value);

        if(rear == null || front == null){
            front = newNode;
            rear = newNode;
            return;
        }

        newNode.next = front;
        front.previous = newNode;
        front = newNode;
    }

    public void popFront(){

        if(front == null){
            return;
        }

        if(front == rear){
            front = null;
            rear = null;
            return;
        }

        front = front.next;
        front.previous = null;

    }

    public void pushBack(int value){
        Node newNode = new Node(value);

        if(rear == null || front == null){
            front = newNode;
            rear = newNode;
            return;
        }

        newNode.previous = rear;
        rear.next = newNode;
        rear = newNode;
    }

    public void popBack(){
        if(rear == null){
            return;
        }

        if(front == rear){
            front = null;
            rear = null;
            return;
        }

        rear = rear.previous;
        rear.next = null;
    }

    public void printList() {
        Node currentNode = front;

        while (currentNode != null) {
            System.out.print(currentNode.value);

            if (currentNode.next != null) {
                System.out.print(" <~> ");
            }

            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public void peekFront(){
        System.out.println(front.value);
    }

    public void peekBack(){
        System.out.println(rear.value);
    }
}
