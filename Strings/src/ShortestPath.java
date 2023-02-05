import java.util.Scanner;

public class ShortestPath {
    public static double calShortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    break;
            }
        }
        double ans = Math.sqrt((x * x) + (y * y));
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(calShortestPath(str));
    }
}
