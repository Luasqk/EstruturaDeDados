package HashTable;

public class Main {
    static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.put(43);
        hashTable.put(32);
        hashTable.put(5);
        hashTable.put(32);
        hashTable.put(7);
        hashTable.put(5);

        hashTable.printTable();
    }
}
