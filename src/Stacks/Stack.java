package Stacks;

public class Stack {
    public Node top;
    public int maxSize;

    public Stack(int value, int maxSize){
        this.top = null;
        this.maxSize = maxSize;
    }

    public void push(int value){
        if(getSize() + 1 > maxSize){
            System.out.println("Pilha cheia");
            return;
        }
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
        System.out.println(top.value);
    }

    public boolean pop() {
        if (top == null) {
            return false;
        }
        top = top.next;
        return true;
    }

    public int getSize(){
        int size = 0;
        Node currentNode = top;

        while(currentNode != null){
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }
}