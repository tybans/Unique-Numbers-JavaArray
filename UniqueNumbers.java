import java.util.HashMap;
import java.util.Map;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 2, 1, 6, 6, 1, 5, 6, 5, 6};

        // Calling the function to find unique numbers and their frequencies
        findUniqueNumbers(arrNum);
    }

    // Function to find unique numbers and their frequencies
    private static void findUniqueNumbers(int[] arr) {
        
        // Creating a HashMap to store the frequency of each unique number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array
        for (int num : arr) {
            // If the number is already present in the map, increment its frequency
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the number is not present, add it to the map with a frequency of 1
                frequencyMap.put(num, 1);
            }
        }

        // Display the unique numbers and their frequencies
        System.out.println("Unique Numbers and their frequencies =>");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
