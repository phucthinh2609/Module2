package Bai8_CleanCode.tennisGame;

public class TennisGame {

    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";

    public static void main(String[] args) {
        getScore("Thinh", "Buoi", 1, 3);
    }

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore=0;
        if (scorePlayer1==scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = LOVE_ALL;
                    break;
                case 1:
                    score = FIFTEEN_ALL;
                    break;
                case 2:
                    score = THIRTY_ALL;
                    break;
                case 3:
                    score = FORTY_ALL;
                    break;
                default:
                    score = DEUCE;
                    break;

            }
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4) {
            int minusResult = scorePlayer1-scorePlayer2;
            if (minusResult==1)
                score = ADVANTAGE_PLAYER_1;
            else if (minusResult ==-1)
                score = ADVANTAGE_PLAYER_2;
            else if (minusResult>=2)
                score = WIN_FOR_PLAYER_1;
            else
                score = WIN_FOR_PLAYER_2;
        }
        else {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scorePlayer1;
                else { score+="-"; tempScore = scorePlayer2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
