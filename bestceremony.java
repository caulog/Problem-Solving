import java.util.Scanner;
import java.util.TreeMap;

public class bestceremony {
    public static void main(String[] args) {
        // Initialize scanner 
        Scanner scanner = new Scanner(System.in);
        // get number of towers
        int n = scanner.nextInt();

        // create a map for tower heights
        TreeMap<Integer, Integer> heights = new TreeMap<>();

        // get heights: 
        // if height not added already, add to map
        // if in map, update count
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            if(heights.get(height) == null){ heights.put(height, 0); } 
            heights.put(height, heights.get(height) +1);
        }

        int max = heights.lastKey();// get max tower height
        int best = n;               // set best equal number of towers
        if (max < n){ best = max; } // best is max height if max is smaller than total towers
        int shorter = 0;            // holds the number of towers <= the current tower
        int charge = 0;             // charge stores charges needed at that height
        
        // loop through towers heights in increasing order
        for (int h : heights.keySet()) {
            shorter += heights.get(h);
            charge = h + n - shorter;
            if (charge < best){ best = charge; }
        }

        System.out.println(best);
        scanner.close();
    }
}
