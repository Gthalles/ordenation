
public class CatalagoProdutos {
    private IOrdenacao strategy;

    CatalagoProdutos( IOrdenacao strategy) {
        this.strategy = strategy;
    }

    public void montarCatalogo(int[] produtos) {
        this.strategy.ordenar(produtos);
    }

}