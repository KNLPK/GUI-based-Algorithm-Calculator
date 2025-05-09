package sort_logic;

public class MergeSort extends Sorter {
    @Override
    public String sort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
        return formatOutput(numbers);
    }

    private void mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; 

            mergeSort(numbers, left, middle); 
            mergeSort(numbers, middle + 1, right); 

            merge(numbers, left, middle, right); 
        }
    }

    private void merge(int[] numbers, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = numbers[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = numbers[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numbers[k] = L[i];
                i++;
            } else {
                numbers[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            numbers[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            numbers[k] = R[j];
            j++;
            k++;
        }
    }
}
