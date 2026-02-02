
public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagnol");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left");
    }
}
