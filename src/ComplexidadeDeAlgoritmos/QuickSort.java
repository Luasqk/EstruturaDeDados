package ComplexidadeDeAlgoritmos;

public class QuickSort {
    public static void ordenar(int[] vet, int inicio, int fim){
        if(inicio < fim){
            int posicaoPivo = particionar(
                    vet,
                    inicio,
                    fim
            );
            ordenar(vet, inicio, posicaoPivo - 1);
            ordenar(vet, posicaoPivo + 1, fim);
        }
    }

    private static int particionar(
            int[] vet,
            int inicio,
            int fim) {
        int pivo = vet[fim];
        int i = inicio -1;

        for (int j = inicio; j < fim; j++) {
            if(vet[j] <= pivo){
                i++;
                trocar(vet, i, j);
            }
        }
        trocar(vet, i + 1, fim);
        return  i + 1;
    }

    private static void trocar(
            int[] vet,
            int i,
            int j) {
                int temporario = vet[i];
                vet[i] = vet[j];
                vet[j] = temporario;
    }

    public static void imprimir(int[] vet){
        for (int valor : vet){
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vet = {9, 80, 32, 85, 43, 7, 76, 0};

        ordenar(vet, 0, vet.length - 1);
        imprimir(vet);
    }
}