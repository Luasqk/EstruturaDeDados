package ComplexidadeDeAlgoritmos;

public class Sort {

   public static void InsertionSort(int[] vet){
       //vai fazer for até a quantidade de vezes que for o tamanho da lista
       for (int i = 0; i < vet.length - 1; i++) {
           //variavel que vai guardar a posição do valor mínimo
           int min = i;
           //para cada elemento da lista, vai comparar o elem + 1,
           //se for, guarda a posicao do vetor que é menor
           for (int j = i + 1; j < vet.length; j++) {

               if(vet[j] < vet[min]){
                   min = j;
               }
           }
            //com a posicao guardada, vai trocar os valores se utilizando
           //de uma variavel temporária
           if(min != i){
               int temp = vet[i];
               vet[i] = vet[min];
               vet[min] = temp;
           }
       }
    }

    public static void mergeSort(int[] vet, int inicio, int fim) {}

    static void main() {

        int[] vet = {45, 43, 9, 0, 90};

        InsertionSort(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}

