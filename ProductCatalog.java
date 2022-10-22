public class ProductCatalog {
    private IOrdenation strategy;

    ProductCatalog(IOrdenation strategy) {
        this.strategy = strategy;
    }

    public void mountCatalog(int[] products) {
        this.strategy.order(products);
    }
}