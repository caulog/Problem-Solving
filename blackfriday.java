//import java.lang.Math;
import java.util.*;

public class blackfriday {
    public static void main(String[] args) {
        // Initialize scanner 
        Scanner scanner = new Scanner(System.in);
        int[][] dice = {{-1, -1, -1, -1, -1, -1},{0, 0, 0, 0, 0, 0}};
        boolean found = false;

        // if roll hasnt been found (-1), set to found (1) and store last index
        // if roll has been found before, set to -1
        int size = scanner.nextInt();
        for(int i = 1; i <= size; i++){
            int roll = scanner.nextInt()-1;
            if(dice[0][roll] == -1 && dice[1][roll] == 0){
                dice[0][roll] = 1;
                dice[1][roll] = i;
            } else if (dice[0][roll] == 1){
                dice[0][roll] = -1;
            }
        }

        // find highest unique index 
        for(int i = 5; i >= 0; i--){
            if(dice[0][i] == 1){
                found = true;
                System.out.println(dice[1][i]);
                break;
            }
        }

        // else print none
        if(!found){ System.out.println("none"); }

        scanner.close();
    }
}
