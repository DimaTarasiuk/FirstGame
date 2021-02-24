import java.io.IOException;
import java.util.Random;

public class GameLogic {
    public static String[] figures = {"stone", "paper", "noznytsi"};
    public static boolean isGameRun = true;
    public static String playersChoose = "stone";
    public static String IIChose = randSymbol();

    public static void playerSymbolChooser() {
        //todo
        //make realtime choose of symbol
    }

    public static String randSymbol() {
        Random random = new Random();
        return figures[random.nextInt(figures.length)];
    }

    public static void startGame() {
        while (isGameRun) {


            if (IIChose.equalsIgnoreCase(playersChoose)) {
                System.out.println(IIChose + " " + playersChoose);
                System.out.println("Nichiya \n"); // new line
                // todo here is some bug. when different symbols can be nichia

            } else if (IIChose.equalsIgnoreCase("stone") || playersChoose.equalsIgnoreCase("paper")) {
                System.out.println("you: " + playersChoose + " II: " + IIChose);
                System.out.println("You won");
                isGameRun = false;

            } else if (IIChose.equalsIgnoreCase("stone") || playersChoose.equalsIgnoreCase("noznytsi")) {
                System.out.println("you: " + playersChoose + " II: " + IIChose);
                System.out.println("you lose ");
                isGameRun = false;

            } else if (IIChose.equalsIgnoreCase("paper") || playersChoose.equalsIgnoreCase("stone")) {
                System.out.println("you: " + playersChoose + " II: " + IIChose);
                System.out.println("you lose");
                isGameRun = false;

            } else if (IIChose.equalsIgnoreCase("noznytsi") || playersChoose.equalsIgnoreCase("paper")) {
                System.out.println("you: " + playersChoose + "II " + IIChose);
                System.out.println("you lose");
                isGameRun = false;
            } else if (IIChose.equalsIgnoreCase("noznytsi") || playersChoose.equalsIgnoreCase("stone")) {
                System.out.println("You:" + playersChoose + "II : " + IIChose);
            } else {
                System.out.println("no such combination, rand symbol = " + IIChose);
            }

        }
    }

}
