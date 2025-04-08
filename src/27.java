import java.util.*;

public class ScienceReport {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        
        // Add some sample data to the list
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");
        data.add("Data 4");
        
        // Print the results of a simple operation on the list (e.g., sort)
        Collections.sort(data);
        
        // Optionally, print or use the sorted list
        System.out.println("Sorted Data: " + data);
    }
}
