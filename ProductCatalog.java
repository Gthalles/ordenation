
public class ProductCatalog {
    private IOrdenation strategy;

    ProductCatalog( IOrdenation strategy) {
        this.strategy = strategy;
    }

    public void montarCatalogo(int[] produtos) {
        this.strategy.order(produtos);
    }

}