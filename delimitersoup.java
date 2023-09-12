import java.util.Scanner;
import java.util.Stack;

public class delimitersoup{
    public static void main(String[] args){
        /* Initialize variables */
        Scanner scanner = new Scanner(System.in);       // scanner
        int len = Integer.parseInt(scanner.nextLine()); // length of delimiter string
        String code = scanner.nextLine();               // delimiter input
        Stack<Character> open = new Stack<>();          // stack for open delimiters
        char delimiter;                                 // holds current delimiter
        boolean broke = false;

        /* Loop through delimiter code */
        for(int i = 0; i < len; i++){
            delimiter = code.charAt(i);

            /* If open delimiter push onto stack */
            if(delimiter == '(' || delimiter == '[' || delimiter == '{'){ open.push(delimiter); }
            
            /* If close delimiter check if correct, if not --> error statement */
            if(delimiter == ')'){
                if(open.size() != 0 && open.peek() == '('){ open.pop(); } 
                else{
                    System.out.println(") " + i);
                    broke = true;
                }
            } 
            if(delimiter == ']'){
                if(open.size() != 0 && open.peek() == '['){ open.pop(); } 
                else{
                    System.out.println("] " + i);
                    broke = true;
                }
            }
            if(delimiter == '}'){
                if(open.size() != 0 && open.peek() == '{'){ open.pop(); } 
                else{
                    System.out.println("} " + i);
                    broke = true;
                }
            }
        }

        // if nothing wrong
        if(!broke){ System.out.println("ok so far"); }

        // close scanner
        scanner.close();
    }
}