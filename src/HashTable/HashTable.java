package HashTable;

public class HashTable {
    private Integer[] table;
    private int capacity;

    public HashTable(int capacity){
        this.capacity = capacity;
        this.table = new Integer[capacity];
    }

    //transforma o numero em positivo e coloca ele na posicao
    //do resto da divisao pela capacidade
    private int hash(int value){
        return Math.abs(value) % capacity;
    }

    //linear probing
    public void put(int value){
        int index = hash(value);
        int startIndex = index;

        //no caso do index ja possuir valor
        while (table[index] != null){
            //evita duplicacoes
            if(table[index] == value){
                return;
            }

            index = (index + 1) % capacity;
            //caso o index seja igual ao inicial, quer dizer
            // que ele deu uma volta completa
            if(index == startIndex){
                System.out.println("Error: HashTable is full!");
                return;
            }
        }
        //caso nao tenha valor insere diretamente
        table[index] = value;
    }

    public void printTable(){
        for (int i = 0; i < capacity; i++) {
            System.out.println("Index: " + i + ": " + table[i]);
        }
    }
    
}
