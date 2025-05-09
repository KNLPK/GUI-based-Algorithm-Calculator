package algo_Calc;

public class Utils {
    public static int[] parseInput(String input) {
        String[] tokens = input.split(" ");
        int[] numbers = new int[tokens.length];
        
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        return numbers;
    }
}
