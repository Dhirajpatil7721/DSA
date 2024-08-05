class SelectionSort {

    public static void ss() {
        int[] array = { 2, 7, 8, 3, 4, 6, 98, 0 };

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

            System.out.print(array[i] + " ");
        }

    }

    public static void main(String[] args) {

        ss();

    }
}