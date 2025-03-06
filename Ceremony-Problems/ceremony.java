import java.util.Scanner;
import java.util.ArrayList;

public class ceremony{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);   // scanner
        int numtowers = scanner.nextInt();          // number of towers input
        ArrayList<Integer> towers = new ArrayList<Integer>(); 
        boolean placed;

        if (numtowers > 0){
            towers.add(scanner.nextInt());
        }
        
        for(int i = 1; i < numtowers; i++){ 
            int height = scanner.nextInt();
            placed = false;

            // if current tower is higher than highest tower
            // place the tower at the end of the list
            if(height >= towers.get(towers.size()-1)){
                towers.add(height);
                placed = true;
            }

            // if the current tower has not been placed
            // check if the current tower is smaller than
            // any of the towers in the list
            // if the current tower is smaller than any towers
            // in the list, place it
            if(!placed){
                outerLoop:
                for(int j = 0; j < towers.size(); j++){
                    if(height < towers.get(j) && j >= 1){
                        if(j != towers.size() && towers.get(j) == towers.get(j+1)){
                            break;
                        }
                        towers.add(j, height);
                        placed = true;
                        break outerLoop;
                    }
                }
            }
                
            if(!placed){
                towers.add(0, height);
                //System.out.print(height + " ");
            }
        }

        for(int i = 0; i < numtowers; i++){
            System.out.print(towers.get(i) + " ");
        }
        

        //System.out.println(towers.get(0));

        System.out.println();

        scanner.close();
    }
}