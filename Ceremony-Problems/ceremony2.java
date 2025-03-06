import java.util.Arrays;
import java.util.Scanner;

public class ceremony2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBlocks = scanner.nextInt();
        int[] blockHeights = new int[numBlocks];

        for (int i = 0; i < numBlocks; i++) {
            blockHeights[i] = scanner.nextInt();
        }

        // Sort the block heights in decreasing order
        Arrays.sort(blockHeights);

        int charges = 0;

        for (int i = numBlocks - 1; i >= 0; i--) {
            int height = blockHeights[i];
            if(height > numBlocks){
                
            }

            int remainingBlocks = i + 1;

            // If the current block height is greater than the remaining blocks,
            // use a charge to remove all the floors in this block
            if (height >= remainingBlocks) {
                charges += remainingBlocks;
                break;
            }

            // Otherwise, use a charge to remove the top 'height' floors in all blocks
            charges += 1;
        }

        System.out.println(charges);
        scanner.close();
    }
}
