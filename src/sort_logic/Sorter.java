package sort_logic;

public abstract class Sorter implements SortStrategy {
    protected String formatOutput(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(number).append(" ");
        }
        return result.toString().trim();  
    }
}
