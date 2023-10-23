import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class bestceremony {
    public static void main(String[] args) {
        // Initialize scanner 
        Scanner scanner = new Scanner(System.in);
        // get number of towers
        int n = scanner.nextInt();

        // create a map for 
        Map<Integer, Integer> heights = new HashMap<>();

        // get heights: 
        // if height not added already, add to map
        // if in map, update count
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            if(heights.get(height) == null){ heights.put(height, 0); } 
            heights.put(height, heights.get(height) +1);
        }

        // get max tower height
        int max = 0;
        for(int h: heights.keySet()){ if(h > max){ max = h; } }

        int best = n;               // set best equal number of towers
        if (max < n){ best = max; } // best is max height if max is smaller than total towers
        int shorter = 0;            // holds the number of towers <= the current tower
        int charge = 0;             // charge stores charges needed at that height
        
        // loop through towers heights in increasing order
        for (int h : heights.keySet()) {
            //System.out.print("h: " + h);
            shorter += heights.get(h);
            //System.out.print(" x: " + shorter);
            charge = h + n - shorter;
            //System.out.println(" charge: " + charge);
            if (charge < best){ best = charge; }
        }

        System.out.println(best);
        scanner.close();
    }
}
