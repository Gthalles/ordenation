public class App {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog(new BubbleSort());

        int[] array = {7, 9, 18, -1, 5};

        catalog.mountCatalog(array);
    }
}