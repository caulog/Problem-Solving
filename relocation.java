import java.lang.Math;
import java.util.*;

public class relocation {
    public static void main(String[] args) {
        // Initialize scanner 
        Scanner scanner = new Scanner(System.in);
        
        // read in input
        int n = scanner.nextInt();
        int queries = scanner.nextInt();

        // fill og company map
        Map<Integer, Integer> company_map = new HashMap<Integer, Integer>(); 
        for(int i = 1; i <= n; i++){
            company_map.put(i, scanner.nextInt());
        }

        // loop thru each query 
        for(int i = 0; i < queries; i++){
            int request = scanner.nextInt();
            // move address
            if(request == 1){
                //company_map.entrySet(scanner.nextInt(), scanner.nextInt());
                company_map.replace(scanner.nextInt(), scanner.nextInt());
                //int company = scanner.nextInt() - 1;
                //int address = scanner.nextInt();
                //companies[company] = address;
            } else{
                //int company1 = scanner.nextInt() - 1;
                //int company2 = scanner.nextInt() - 1;
                System.out.println(Math.abs(company_map.get(scanner.nextInt()) - company_map.get(scanner.nextInt())));
            }
        }

        scanner.close();
    }
}
