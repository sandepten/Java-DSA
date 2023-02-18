public class Interface {
    public static void main(String[] args) {

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Can move in all directions");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Moves only 1 step in any direction");
    }
}
