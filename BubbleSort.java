class BubbleSort implements IOrdenation {
    public void order(int[] array) {
        int aux = 0;

        System.out.println("Unordered array: ");

        for (int index: array) {
            System.out.println(index);
        }

        System.out.println(" ");

        for (int index = 0; index < 5; index++) {
            for (int j = 0; j < 4; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        System.out.println("Sorted array:");

        for (int i = 0; i<5; i++){
            System.out.println(" " + array[i]);
        }
    }
}