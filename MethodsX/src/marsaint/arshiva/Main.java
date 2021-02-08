package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        int playerLevel = playerCalculateLevel(589);
        int playerPosition = calculateHighScorePosition(458);
        displayHighScorePosition("Kenji", playerPosition, playerLevel);

        playerLevel = playerCalculateLevel(989);
        playerPosition = calculateHighScorePosition(858);
        displayHighScorePosition("Saint", playerPosition, playerLevel);

        playerLevel = playerCalculateLevel(175);
        playerPosition = calculateHighScorePosition(241);
        displayHighScorePosition("Mars", playerPosition, playerLevel);

        playerLevel = playerCalculateLevel(1175);
        playerPosition = calculateHighScorePosition(2041);
        displayHighScorePosition("Arshiva", playerPosition, playerLevel);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition, int playerExperience) {
        System.out.println("Congratulation! " + playerName + " " + "has reached level " + playerExperience);
        System.out.println(playerName + " " + "position is " + highScorePosition + "!!");
    }

    public static int playerCalculateLevel(int playerExp) {
        int playerLevel = 0;
        if (playerExp > 1000) {
            playerLevel = 11;
        } else if (playerExp > 900) {
            playerLevel = 10;
        } else if (playerExp > 800) {
            playerLevel = 9;
        } else if (playerExp > 700) {
            playerLevel = 8;
        } else if (playerExp > 600) {
            playerLevel = 7;
        } else if (playerExp > 500) {
            playerLevel = 6;
        } else if (playerExp > 400) {
            playerLevel = 5;
        } else if (playerExp > 300) {
            playerLevel = 4;
        } else if (playerExp > 200) {
            playerLevel = 3;
        } else if (playerExp > 100) {
            playerLevel = 2;
        } else if (playerExp > 0) {
            playerLevel = 1;
        }
        return playerLevel;
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 200) {
            return 3;
        } else {
            return 4;
        }
    }
}
