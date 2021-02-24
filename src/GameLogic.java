import java.util.Random;

public class GameLogic {
    public static String[] figures = {"stone", "paper", "noznytsi"};
    public static boolean isGameRun = true;
    public static String playersChoose = "paper";
    public static String botChoose = "paper"; //randSymbol();


    public static String randSymbol() {
        Random random = new Random();
        return figures[random.nextInt(figures.length)];
    }

    public static void startGame() {


        while (isGameRun) {

            if (botChoose.equalsIgnoreCase(playersChoose)) {
                System.out.println(botChoose + " " + playersChoose);
                System.out.println("Nichiya \n"); // new line
                botChoose = randSymbol();

            } else if (botChoose.equalsIgnoreCase("stone") || playersChoose.equalsIgnoreCase("paper")) {
                System.out.println("you: " + playersChoose + " bot: " + botChoose);
                System.out.println("You won");
                isGameRun = false;

            } else if (botChoose.equalsIgnoreCase("stone") || playersChoose.equalsIgnoreCase("noznytsi")) {
                System.out.println("you: " + playersChoose + " bot: " + botChoose);
                System.out.println("you lose ");
                isGameRun = false;

            } else if (botChoose.equalsIgnoreCase("paper") || playersChoose.equalsIgnoreCase("stone")) {
                System.out.println("you: " + playersChoose + " bot: " + botChoose);
                System.out.println("you lose");
                isGameRun = false;

            } else if (botChoose.equalsIgnoreCase("noznytsi") || playersChoose.equalsIgnoreCase("paper")) {
                System.out.println("you: " + playersChoose + "bot " + botChoose);
                System.out.println("you lose");
                isGameRun = false;
            } else if (botChoose.equalsIgnoreCase("noznytsi") || playersChoose.equalsIgnoreCase("stone")) {
                System.out.println("You:" + playersChoose + "bot : " + botChoose);
                System.out.println("You won");
            } else {
                System.out.println("no such combination, rand symbol = " + botChoose);
            }

        }
    }

}


