package Queues;

import LinkedList.Node;

public class Queue {
    public Node front;
    public Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public boolean isNull(){

        if(front == null){
            rear = null;
            return true;
        }

        return false;
    }

    public void enqueue(int value){

        if(isNull()){
            front = new Node(value);
            rear = front;
            return;
        }

        Node node = new Node(value);
        rear.next = node;
        rear = node;

    }

    public void dequeue() {

        if (isNull()) {
            rear = null;
            return;
        }

        if(front == rear){
            front = null;
            rear = null;
            return;
        }

        front = front.next;
    }

    public void printQueue() {
        Node currentNode = front;
        while (currentNode != null) {

            System.out.print(currentNode.value);
            currentNode = currentNode.next;

            System.out.print(" -> ");
        }
    }

    public int getSize(){
        int size = 0;
        Node currentNode = front;

        while (currentNode != rear){
            size++;
            currentNode = currentNode.next;
        }

        return size;
    }
}