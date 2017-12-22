public class TicTacToeDemo {

    public static void main(String[] args) {
        Player firstPlayer = new Player();
        firstPlayer.setName("Alice");

        Player secondPlayer = new Player();
        secondPlayer.setName("Bob");

        Board board = new Board(3);
        
        Game game = new Game();

        game.setBoard(board);
        game.setFirstPlayer(firstPlayer);
        game.setSecondPlayer(secondPlayer);
        
        game.play(0, 0);
        game.play(1, 1);
        game.play(0, 1);
        game.play(1, 2);
        game.play(0, 1);
        game.play(0, 3);
        game.play(2, 1);
        game.play(0, 2);
        game.play(2, 1);
        game.play(1, 0);
        game.play(2, 0);
        game.play(2, 1);

    }
}