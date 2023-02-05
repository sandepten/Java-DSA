import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaring strings
        String str = "Sandeep";
        String str2 = new String("Shivani");

        // String input/output
        Scanner s = new Scanner(System.in);
        String inStr = s.next();

        // Concatenation
        String fStr = str + inStr;
        System.out.println(fStr);
    }
}
