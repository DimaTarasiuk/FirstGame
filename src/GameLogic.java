import java.io.IOException;
import java.util.Random;

public class GameLogic {
    public static String[] figures = {"stone", "paper", "noznytsi"};
    public static boolean isGameRun = true;
    public static String playersChoose = "stone";

    public static void playerSymbolChooser(){
        //todo
        //make realtime choose of symbol
    }

    public static String randSymbol(){
        Random random = new Random();
        String symbol = figures[random.nextInt(figures.length)];
        return symbol;
    }

    public static void startGame(){
        while (isGameRun){

            if(randSymbol() == playersChoose){
                System.out.println(randSymbol() + " " + playersChoose );
                System.out.println("Nichiya \n"); // new line
                // todo here is some bug. when different symbols can be nichia

            }else if(randSymbol()== "stone" || playersChoose == "paper"){
                System.out.println("you: "+ playersChoose + " II: stone");
                System.out.println("You won");
                isGameRun = false;

            }else if(randSymbol() == "stone" || playersChoose == "noznytsi"){
                System.out.println("you: "+ playersChoose + " II: stone");
                System.out.println("you lose ");
                isGameRun = false;

            }else if(randSymbol() == "paper" || playersChoose == "stone"){
                System.out.println("you: "+ playersChoose + " II: paper");
                System.out.println("you lose");
                isGameRun = false;

            }else if(randSymbol() == "noznytsi" || playersChoose == "paper"){
                System.out.println("you: "+ playersChoose + " " + " II: noznytsi");
                System.out.println("you lose");
                isGameRun = false;
            }
            else{
                System.out.println("no such combination, rand symbol = " + randSymbol());
            }

        }
    }

}
