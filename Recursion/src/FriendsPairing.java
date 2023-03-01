//? Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only oce. Find out the total number of ways in which friends can remain single or can be paired up.

public class FriendsPairing {
    public static int findFriendPairs(int n) {
        if (n == 1 || n == 2)
            return n;
        // for singles
        int single = findFriendPairs(n - 1);
        // for pairs
        int pairs = findFriendPairs(n - 2);
        return single + ((n - 1) * pairs);
    }

    public static void main(String[] args) {
        System.out.println(findFriendPairs(5));
    }
}
