interface IOrdenacao {
    void ordenar(int[] vet);
}

class BubbleSort implements IOrdenacao {
    public void ordenar(int[] vet) {
        int aux = 0;
        int i = 0;

        System.out.println( "Vetor desordenado: ");

        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }

        System.out.println(" ");

        for(i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }

        System.out.println("Vetor organizado:");

        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }
    }
}

public class App {
    public static void main(String[] args) {
        CatalagoProdutos catalogo = new CatalagoProdutos(new BubbleSort());

        int[] vetor = {7, 9, 18, -1, 5};

        for (int i: vetor) {
            System.out.println(i);
        }

        catalogo.montarCatalogo(vetor);


    }
}