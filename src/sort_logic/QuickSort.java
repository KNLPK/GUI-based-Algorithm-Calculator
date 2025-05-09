package sort_logic;

public class QuickSort extends Sorter {
    @Override
    public String sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        return formatOutput(numbers); 
    }

    private void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(numbers, start, end);
            quickSort(numbers, start, partitionIndex - 1); 
            quickSort(numbers, partitionIndex + 1, end); 
        }
    }

    private int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end]; 
        int i = (start - 1); 

        for (int j = start; j < end; j++) {
            if (numbers[j] <= pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[end];
        numbers[end] = temp;

        return i + 1; 
    }
}
