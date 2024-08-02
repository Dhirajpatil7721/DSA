class InsertiionSort {
    
    public static void main(String[] args) {
        sorting();
    }
    
    public static void sorting() {
        int[] arr = {2, 7, 8, 3, 4, 6, 98, 0};
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be compared and inserted
            int j = i - 1;
            
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // Insert key into the sorted sequence
            
        }
        
        // Print sorted array
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
