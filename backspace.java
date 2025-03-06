import java.util.Scanner;
import java.util.ArrayList;

public class backspace{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);       // scanner
        String input = scanner.nextLine();               // delimiter input
        ArrayList<Character> output = new ArrayList<Character>(); 

        for (int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '<'){
                i--;
            } else{
                output.add(i, input.charAt(i));
            }
        }
        
        for (int i = 0; i < output.size(); i++){
            System.out.print(output.get(i));
        }

        System.out.println();
        
        scanner.close();
    }
}