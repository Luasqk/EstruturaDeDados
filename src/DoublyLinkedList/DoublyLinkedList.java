package DoublyLinkedList;

public class DoublyLinkedList {
    Node begin, end;

    public DoublyLinkedList() {
        this.begin = null;
        this.end = null;
    }

    public void insertValue(int value) {
        Node newNode = new Node(value);
        if (begin == null) {
            begin = newNode;
            end = newNode;
            return;
        }
        end.next = newNode;
        newNode.previous = end;
        end = newNode;
    }

    public boolean deleteValue(int value){
        //primeiro valor nulo
        if(begin == null){
            return false;
        }

        Node currentNode = begin;

        while (currentNode != null){
            if(currentNode.value == value){
                //primeiro nó
                if(currentNode == begin){
                    begin = currentNode.next;

                    if(begin != null){
                        begin.previous = null;
                    }
                    else{
                        end = null;
                    }
                    return true;
                }

                //ultimo nó
                if(currentNode == end){
                    end = currentNode.previous;
                    end.next = null;
                    return true;
                }

                //atualizar referencias
                currentNode.previous.next = currentNode.next;
                currentNode.next.previous = currentNode.previous;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void printList() {
        Node currentNode = begin;

        while (currentNode != null) {
            System.out.print(currentNode.value);

            if (currentNode.next != null) {
                System.out.print(" <~> ");
            }

            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public int getSize(){
        int size = 0;
        Node currentNode = begin;

        while(currentNode != null){
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

}