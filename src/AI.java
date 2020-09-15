public class AI {
    //Scan board, if JQK appear do it, else find first 11 and excute that

    public String scan(board gameBoard){
        String s = "";
        int tempInt = 0;
        if (gameBoard.containsCard("J") && gameBoard.containsCard("Q") && gameBoard.containsCard("K")){
            return "JQK";
        }
        else if(gameBoard.containsCard("A") && gameBoard.containsCard("T")){
            return "AT";
        }
        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            for (int j = 0; j < gameBoard.getBoard().length; j++) {
                String temp = gameBoard.getBoard()[i][j].getValue();
                if(!temp.equals("A") && !temp.equals("T") && !temp.equals("J") && !temp.equals("Q") && !temp.equals("K")){
                    tempInt = Integer.parseInt(temp);
                    if(gameBoard.containsCard(String.valueOf(11-tempInt))){
                        return temp + String.valueOf(11-tempInt);
                    }
                }
            }
        }
        return "none";
    }
    //the plan is to implement the AI after the actual game is setup


}
