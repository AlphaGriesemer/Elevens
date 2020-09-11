import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        /*
        Deck deck = new Deck();
        for (Card c1: deck.getDeck()) {
            System.out.println(c1.getValue());
        }

         */
        Scanner userInput = new Scanner(System.in);
        Game game = new Game();

        //game loop
        boolean valid;
        int gameMode;
        do {
            System.out.print("Enter game mode (1 = human, 2 = AI): ");
            gameMode = userInput.nextInt();
            if (gameMode == 1 || gameMode == 2) {
                valid = true;
            } else {
                System.out.print("Please enter a valid game mode. ");
                valid = false;
            }
        } while (valid == false);

        if(gameMode == 1){
            while(game.isPlayable() == true) {
                System.out.println();
                game.printBoard();
                do {
                    System.out.print("Move? ");
                    String userMove = userInput.next();
                    if(game.play(userMove) == true){
                        valid = true;
                    } else {
                        System.out.print("Illegal move, try again. ");
                        valid = false;
                    }
                } while(valid == false);
            }
            System.out.println();
            game.printBoard();
            System.out.println("Game Over");


        } else if (gameMode == 2){
            System.out.println("This game mode has not been setup yet");
        }
    }
}
