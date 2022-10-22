interface IOrdenation {
    void order(int[] vet);
}

class BubbleSort implements IOrdenation {
    public void order(int[] vet) {
        int aux = 0;

        System.out.println("Vetor desordenado: ");

        for (int i: vet) {
            System.out.println(i);
        }

        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor organizado:");

        for (int i = 0; i<5; i++){
            System.out.println(" " + vet[i]);
        }
    }
}

public class App {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog(new BubbleSort());

        int[] array = {7, 9, 18, -1, 5};

        for (int i: array) {
            System.out.println(i);
        }

        catalog.montarCatalogo(array);
    }
}