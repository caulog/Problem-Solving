import java.util.Scanner;

public class NinetyNineProblems{
    public static void main(String[] args){
        // inialize scanner
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();

        if (price < 100){
            price = 99;
        } else{
            int hundred = price%100;
            if(hundred < 49){
            price = price - hundred -1;
            } else{
            price = price + (99-hundred);
            }
        }

        System.out.println(price);

        scanner.close(); // finished with scanner
    }
}