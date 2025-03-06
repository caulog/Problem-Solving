import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class newceremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        TreeMap<Integer, Integer> heights = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            heights.put(height, heights.getOrDefault(height, 0) + 1);
        }

        int max = heights.lastKey(); // Get the max tower height
        int best = n;
        if (max < n) {
            best = max;
        }
        
        int shorter = 0;
        int charge = 0;

        for (Map.Entry<Integer, Integer> entry : heights.entrySet()) {
            int h = entry.getKey();
            int frequency = entry.getValue();
            shorter += frequency;
            charge = h + n - shorter;
            if (charge < best) {
                best = charge;
            }
        }

        System.out.println(best);
        scanner.close();
    }
}