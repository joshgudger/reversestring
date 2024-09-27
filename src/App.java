
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter in a string of characters(words)");
        String originalword = scanner.nextLine();
        String reverseoriginalword = "";

        for (int i = 0; i < originalword.length(); i++) { 

            reverseoriginalword = originalword.charAt(i) + reverseoriginalword;
        }
    
    

        System.out.println("Reversed string: " + reverseoriginalword);
        scanner.close();

    }
}
