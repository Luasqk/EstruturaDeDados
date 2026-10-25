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

    public static void mergeSort(int[] vet, int inicio, int meio, int fim) {
        int[] auxiliar = new int[fim - inicio + 1];
        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while(i <= meio && j <= fim){
            if(vet[i] <= vet[j]){
                auxiliar[k] = vet[i];
                i++;
            }
            else{
                auxiliar[k] = vet[j];
                j++;
            }
            k++;
        }

        while(i <= meio){
            auxiliar[k] = vet[i];
            i++;
            k++;
        }

        while (j <= fim){
            auxiliar[k] = vet[j];
            j++;
            k++;
        }

        for(i = inicio; i <= fim; i++) {
            vet[i] = auxiliar[i - inicio];
        }
    }

    static void main() {

        int[] vet = {45, 43, 9, 0, 90};

        InsertionSort(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}

