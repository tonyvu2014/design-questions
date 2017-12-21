public class Game {

    private Board board;
    private Player firstPlayer; //First player who plays O
    private Player secondPlayer; // Second player who plays X
    private int turn; // 0 for O, 1 for X
    private Player winner;
    private int moves;

    public Game() {
        super();
        this.turn  = 0;
        this.moves = 0;
    }

    public Player getFirstPlayer() {
        return this.firstPlayer;
    }

    public void setFirstPlayer(Player player) {
        this.firstPlayer = player;
    }

    public Player getSecondPlayer() {
        return this.secondPlayer;
    }

    public void setSecondPlayer(Player player) {
        this.secondPlayer = player;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWinner() {
        return this.winner;
    }

    private boolean isValidMove(int x, int y) {
        if (this.winner != null) {
            System.out.println("Game is finished. Winner is: " + this.winner.getName());            
            return false;
        }

        if (moves >= this.board.getN() * this.board.getN()) {
            System.out.println("Game is finished. There is no winner.");            
            return false;            
        }

        if (x < 0 || x >= this.board.getN()) {
            System.out.println("Invalid move outside of the board. Please play again.");
            return false;
        }

        if (y < 0 || y >= this.board.getN()) {
            System.out.println("Invalid move outside of the board. Please play again.");
            return false;
        }

        if (this.board.getState(x, y) != null) {
            System.out.println("Invalid move. The cell is already played. Please play again.");
            return false;          
        }

        return true;

    }

    public void play(int x, int y) {
        System.out.println(String.format("Playing %s at (%d, %d)", turn == 0? 'O':'X' , x, y));
       
        if (!isValidMove(x, y)) {
            return;
        }

        this.board.setState(x, y, turn);

        if (isWinning(x, y)) {
            if (turn == 0) {
                this.winner = this.firstPlayer;
            } else {
                this.winner = this.secondPlayer;
            }
            System.out.println("Game is finished. Winner is: " + this.winner.getName());            
        }

        this.turn = (this.turn + 1) % 2;
        this.moves++;
    }

    public boolean isWinning(int x, int y) {
        return this.board.isWinning(x, y);
    }

}