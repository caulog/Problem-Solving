//import java.lang.Math;
import java.util.*;

public class reverserot {
    public static void main(String[] args) {
        // Initialize scanner 
        Scanner scanner = new Scanner(System.in);

        //initialize key
        char[] key = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', '.'};

        // Get line one
        String line = scanner.nextLine();
        int rot = (int)line.charAt(0) - 48;

        //System.out.println(rot);

        while(rot != 0){
            String[] rot_info = line.split(" ");
            rot = Integer.parseInt(rot_info[0]);
            String to_reverse = rot_info[1];
            String reversed = ""; 
            String rotted = "";
            
            // reverse the string
            for(int i = to_reverse.length()-1; i >= 0; i--){
                reversed += to_reverse.charAt(i);
            }

            // rot the string
            for(int i = 0; i < reversed.length(); i++){
                char curr = reversed.charAt(i);
                if(curr > 64 && curr < 91){
                    System.out.println(curr+rot);
                    curr = (char)((int) curr+rot);
                    rotted += curr;
                }
            }

            System.out.println(reversed);
            System.out.println(rotted);
            rot = 0; /// TAKE OUT AFTER TRIALS
        }

        //print_arr(init_arr);

        scanner.close();
    }

    public static void print_arr(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
