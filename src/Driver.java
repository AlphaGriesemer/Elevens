import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        /*
        Deck deck = new Deck();
        int temp = deck.getNumOfCardLeft();
        for (int i = 0; i < temp ; i++) {
            System.out.println(deck.getCard().getValue());
        }

         */
        Scanner userInput = new Scanner(System.in);
        Game game = new Game();
        AI ai = new AI();
        //game loop
        boolean valid;
        int gameMode;
        do {
            System.out.print("Enter game mode (1 = human, 2 = AI, 3 = AI Simulator): ");
            gameMode = userInput.nextInt();
            if (gameMode == 1 || gameMode == 2 || gameMode == 3) {
                valid = true;
            } else {
                System.out.print("Please enter a valid game mode. ");
                valid = false;
            }
        } while (!valid);

        if(gameMode == 1){
            while(game.isPlayable()) {
                System.out.println();
                game.printBoard();
                do {
                    System.out.print("Move? ");
                    String userMove = userInput.next();
                    if(game.play(userMove)){
                        valid = true;
                    } else {
                        System.out.print("Illegal move, try again. ");
                        valid = false;
                    }
                } while(!valid);
            }
            System.out.println();
            game.printBoard();
            System.out.println("Game Over");


        }
        else if (gameMode == 2){
            while(game.isPlayable()) {
                System.out.println();
                game.printBoard();
                do {
                    //System.out.print("Move? ");
                    String compMove = ai.scan(game.getGameboard());
                    System.out.println(compMove);
                    //String userMove = userInput.next();
                    if(game.play(compMove)){
                        valid = true;
                    } else {
                        if(!game.isPlayable()){
                            break;
                        }
                        System.out.print("Illegal move, try again. ");
                        valid = false;
                    }
                } while(!valid && game.isPlayable());
            }
            System.out.println();
            game.printBoard();
            System.out.println("Game Over");
        } else if (gameMode == 3){
            System.out.print("How many games do you want the AI to play? ");
            int games = userInput.nextInt();

            int wins = 0;
            for(int i = 0; i < games; i++){
                game = new Game();
                ai = new AI();
                do {
                    game.play(ai.scan(game.getGameboard()));
                } while(game.isPlayable());
                if(game.getWin() == true){
                    wins++;
                }
            }
            System.out.println(wins);
        }
        //System.out.println(deck.getNumOfCardLeft());
    }
}
