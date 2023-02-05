import java.util.Scanner;

public class FirstLetterUppercase {
    public static String firstLetterUppercase(String str) {
        StringBuilder finalString = new StringBuilder("");
        finalString.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                finalString.append(Character.toUpperCase(str.charAt(i)));
            } else {
                finalString.append(str.charAt(i));
            }
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(firstLetterUppercase(str));
    }
}
