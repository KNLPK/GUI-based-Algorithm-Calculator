package sort_logic;

public class HeapSort extends Sorter {
    @Override
    public String sort(int[] numbers) {
        int n = numbers.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(numbers, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = temp;

            heapify(numbers, i, 0);
        }
        return formatOutput(numbers); 
    }

    private void heapify(int[] numbers, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && numbers[left] > numbers[largest]) {
            largest = left;
        }

        if (right < n && numbers[right] > numbers[largest]) {
            largest = right;
        }
        
        if (largest != i) {
            int swap = numbers[i];
            numbers[i] = numbers[largest];
            numbers[largest] = swap;

            heapify(numbers, n, largest);
        }
    }
}
