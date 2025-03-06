import java.util.Scanner;

public class pebblesolitaire {
    public static void main(String[] args) {
        // Initialize scanner 
        Scanner scanner = new Scanner(System.in);
        
        // read in input
        int games = scanner.nextInt();

        for(int i = 0; i < games; i++){
            // fill game array
            int[] pebbles = new int[12];
            String start = scanner.nextLine();

            System.out.println("game " + i + " " + start.charAt(1));
            /* 
            for(int j = 0; j < 12; j++){
                if(start.charAt(j+1) == 'o'){
                    System.out.println("game " + i + "o");
                    pebbles[j] = 1;
                } else{
                    pebbles[j] = 0;
                }
            }*/
            //printArray(pebbles);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}